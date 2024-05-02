package com.entity.vo;

import com.entity.BumenEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 部门信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("bumen")
public class BumenVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 部门名称
     */

    @TableField(value = "bumen_name")
    private String bumenName;


    /**
     * 部门类型
     */

    @TableField(value = "bumen_types")
    private Integer bumenTypes;


    /**
     * 部门人数
     */

    @TableField(value = "bumen_number")
    private Integer bumenNumber;


    /**
     * 部门强项
     */

    @TableField(value = "bumen_qiangxiang")
    private String bumenQiangxiang;


    /**
     * 部门负责人
     */

    @TableField(value = "bumen_fuzeren")
    private String bumenFuzeren;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：部门名称
	 */
    public String getBumenName() {
        return bumenName;
    }


    /**
	 * 获取：部门名称
	 */

    public void setBumenName(String bumenName) {
        this.bumenName = bumenName;
    }
    /**
	 * 设置：部门类型
	 */
    public Integer getBumenTypes() {
        return bumenTypes;
    }


    /**
	 * 获取：部门类型
	 */

    public void setBumenTypes(Integer bumenTypes) {
        this.bumenTypes = bumenTypes;
    }
    /**
	 * 设置：部门人数
	 */
    public Integer getBumenNumber() {
        return bumenNumber;
    }


    /**
	 * 获取：部门人数
	 */

    public void setBumenNumber(Integer bumenNumber) {
        this.bumenNumber = bumenNumber;
    }
    /**
	 * 设置：部门强项
	 */
    public String getBumenQiangxiang() {
        return bumenQiangxiang;
    }


    /**
	 * 获取：部门强项
	 */

    public void setBumenQiangxiang(String bumenQiangxiang) {
        this.bumenQiangxiang = bumenQiangxiang;
    }
    /**
	 * 设置：部门负责人
	 */
    public String getBumenFuzeren() {
        return bumenFuzeren;
    }


    /**
	 * 获取：部门负责人
	 */

    public void setBumenFuzeren(String bumenFuzeren) {
        this.bumenFuzeren = bumenFuzeren;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
