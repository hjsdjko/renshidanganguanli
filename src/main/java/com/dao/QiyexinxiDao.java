package com.dao;

import com.entity.QiyexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyexinxiView;

/**
 * 企业信息 Dao 接口
 *
 * @author 
 */
public interface QiyexinxiDao extends BaseMapper<QiyexinxiEntity> {

   List<QiyexinxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
