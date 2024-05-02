package com.entity.model;

import com.entity.QiyexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 企业信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QiyexinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 企业名称
     */
    private String qiyexinxiName;


    /**
     * 企业人数
     */
    private Integer qiyexinxiNumber;


    /**
     * 企业注册资金
     */
    private String qiyexinxiQiangxiang;


    /**
     * 所属行业
     */
    private String qiyexinxiHangye;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：企业名称
	 */
    public String getQiyexinxiName() {
        return qiyexinxiName;
    }


    /**
	 * 设置：企业名称
	 */
    public void setQiyexinxiName(String qiyexinxiName) {
        this.qiyexinxiName = qiyexinxiName;
    }
    /**
	 * 获取：企业人数
	 */
    public Integer getQiyexinxiNumber() {
        return qiyexinxiNumber;
    }


    /**
	 * 设置：企业人数
	 */
    public void setQiyexinxiNumber(Integer qiyexinxiNumber) {
        this.qiyexinxiNumber = qiyexinxiNumber;
    }
    /**
	 * 获取：企业注册资金
	 */
    public String getQiyexinxiQiangxiang() {
        return qiyexinxiQiangxiang;
    }


    /**
	 * 设置：企业注册资金
	 */
    public void setQiyexinxiQiangxiang(String qiyexinxiQiangxiang) {
        this.qiyexinxiQiangxiang = qiyexinxiQiangxiang;
    }
    /**
	 * 获取：所属行业
	 */
    public String getQiyexinxiHangye() {
        return qiyexinxiHangye;
    }


    /**
	 * 设置：所属行业
	 */
    public void setQiyexinxiHangye(String qiyexinxiHangye) {
        this.qiyexinxiHangye = qiyexinxiHangye;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
