package com.entity.model;

import com.entity.BumenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 部门信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BumenModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 部门名称
     */
    private String bumenName;


    /**
     * 部门类型
     */
    private Integer bumenTypes;


    /**
     * 部门人数
     */
    private Integer bumenNumber;


    /**
     * 部门强项
     */
    private String bumenQiangxiang;


    /**
     * 部门负责人
     */
    private String bumenFuzeren;


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
	 * 获取：部门名称
	 */
    public String getBumenName() {
        return bumenName;
    }


    /**
	 * 设置：部门名称
	 */
    public void setBumenName(String bumenName) {
        this.bumenName = bumenName;
    }
    /**
	 * 获取：部门类型
	 */
    public Integer getBumenTypes() {
        return bumenTypes;
    }


    /**
	 * 设置：部门类型
	 */
    public void setBumenTypes(Integer bumenTypes) {
        this.bumenTypes = bumenTypes;
    }
    /**
	 * 获取：部门人数
	 */
    public Integer getBumenNumber() {
        return bumenNumber;
    }


    /**
	 * 设置：部门人数
	 */
    public void setBumenNumber(Integer bumenNumber) {
        this.bumenNumber = bumenNumber;
    }
    /**
	 * 获取：部门强项
	 */
    public String getBumenQiangxiang() {
        return bumenQiangxiang;
    }


    /**
	 * 设置：部门强项
	 */
    public void setBumenQiangxiang(String bumenQiangxiang) {
        this.bumenQiangxiang = bumenQiangxiang;
    }
    /**
	 * 获取：部门负责人
	 */
    public String getBumenFuzeren() {
        return bumenFuzeren;
    }


    /**
	 * 设置：部门负责人
	 */
    public void setBumenFuzeren(String bumenFuzeren) {
        this.bumenFuzeren = bumenFuzeren;
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
