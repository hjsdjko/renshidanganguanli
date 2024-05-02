package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 部门信息
 *
 * @author 
 * @email
 */
@TableName("bumen")
public class BumenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BumenEntity() {

	}

	public BumenEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Bumen{" +
            "id=" + id +
            ", bumenName=" + bumenName +
            ", bumenTypes=" + bumenTypes +
            ", bumenNumber=" + bumenNumber +
            ", bumenQiangxiang=" + bumenQiangxiang +
            ", bumenFuzeren=" + bumenFuzeren +
            ", createTime=" + createTime +
        "}";
    }
}
