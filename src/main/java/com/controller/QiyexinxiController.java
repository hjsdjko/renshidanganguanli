
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 企业信息
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/qiyexinxi")
public class QiyexinxiController {
    private static final Logger logger = LoggerFactory.getLogger(QiyexinxiController.class);

    @Autowired
    private QiyexinxiService qiyexinxiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("员工".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = qiyexinxiService.queryPage(params);

        //字典表数据转换
        List<QiyexinxiView> list =(List<QiyexinxiView>)page.getList();
        for(QiyexinxiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        QiyexinxiEntity qiyexinxi = qiyexinxiService.selectById(id);
        if(qiyexinxi !=null){
            //entity转view
            QiyexinxiView view = new QiyexinxiView();
            BeanUtils.copyProperties( qiyexinxi , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody QiyexinxiEntity qiyexinxi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,qiyexinxi:{}",this.getClass().getName(),qiyexinxi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<QiyexinxiEntity> queryWrapper = new EntityWrapper<QiyexinxiEntity>()
            .eq("qiyexinxi_name", qiyexinxi.getQiyexinxiName())
            .eq("qiyexinxi_number", qiyexinxi.getQiyexinxiNumber())
            .eq("qiyexinxi_qiangxiang", qiyexinxi.getQiyexinxiQiangxiang())
            .eq("qiyexinxi_hangye", qiyexinxi.getQiyexinxiHangye())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        QiyexinxiEntity qiyexinxiEntity = qiyexinxiService.selectOne(queryWrapper);
        if(qiyexinxiEntity==null){
            qiyexinxi.setCreateTime(new Date());
            qiyexinxiService.insert(qiyexinxi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody QiyexinxiEntity qiyexinxi, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,qiyexinxi:{}",this.getClass().getName(),qiyexinxi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<QiyexinxiEntity> queryWrapper = new EntityWrapper<QiyexinxiEntity>()
            .notIn("id",qiyexinxi.getId())
            .andNew()
            .eq("qiyexinxi_name", qiyexinxi.getQiyexinxiName())
            .eq("qiyexinxi_number", qiyexinxi.getQiyexinxiNumber())
            .eq("qiyexinxi_qiangxiang", qiyexinxi.getQiyexinxiQiangxiang())
            .eq("qiyexinxi_hangye", qiyexinxi.getQiyexinxiHangye())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        QiyexinxiEntity qiyexinxiEntity = qiyexinxiService.selectOne(queryWrapper);
        if(qiyexinxiEntity==null){
            qiyexinxiService.updateById(qiyexinxi);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        qiyexinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<QiyexinxiEntity> qiyexinxiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            QiyexinxiEntity qiyexinxiEntity = new QiyexinxiEntity();
//                            qiyexinxiEntity.setQiyexinxiName(data.get(0));                    //企业名称 要改的
//                            qiyexinxiEntity.setQiyexinxiNumber(Integer.valueOf(data.get(0)));   //企业人数 要改的
//                            qiyexinxiEntity.setQiyexinxiQiangxiang(data.get(0));                    //企业注册资金 要改的
//                            qiyexinxiEntity.setQiyexinxiHangye(data.get(0));                    //所属行业 要改的
//                            qiyexinxiEntity.setCreateTime(date);//时间
                            qiyexinxiList.add(qiyexinxiEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        qiyexinxiService.insertBatch(qiyexinxiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
