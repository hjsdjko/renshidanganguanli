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
 * 企业信息
 *
 * @author 
 * @email
 */
@TableName("qiyexinxi")
public class QiyexinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QiyexinxiEntity() {

	}

	public QiyexinxiEntity(T t) {
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
     * 企业名称
     */
    @TableField(value = "qiyexinxi_name")

    private String qiyexinxiName;


    /**
     * 企业人数
     */
    @TableField(value = "qiyexinxi_number")

    private Integer qiyexinxiNumber;


    /**
     * 企业注册资金
     */
    @TableField(value = "qiyexinxi_qiangxiang")

    private String qiyexinxiQiangxiang;


    /**
     * 所属行业
     */
    @TableField(value = "qiyexinxi_hangye")

    private String qiyexinxiHangye;


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
	 * 设置：企业名称
	 */
    public String getQiyexinxiName() {
        return qiyexinxiName;
    }


    /**
	 * 获取：企业名称
	 */

    public void setQiyexinxiName(String qiyexinxiName) {
        this.qiyexinxiName = qiyexinxiName;
    }
    /**
	 * 设置：企业人数
	 */
    public Integer getQiyexinxiNumber() {
        return qiyexinxiNumber;
    }


    /**
	 * 获取：企业人数
	 */

    public void setQiyexinxiNumber(Integer qiyexinxiNumber) {
        this.qiyexinxiNumber = qiyexinxiNumber;
    }
    /**
	 * 设置：企业注册资金
	 */
    public String getQiyexinxiQiangxiang() {
        return qiyexinxiQiangxiang;
    }


    /**
	 * 获取：企业注册资金
	 */

    public void setQiyexinxiQiangxiang(String qiyexinxiQiangxiang) {
        this.qiyexinxiQiangxiang = qiyexinxiQiangxiang;
    }
    /**
	 * 设置：所属行业
	 */
    public String getQiyexinxiHangye() {
        return qiyexinxiHangye;
    }


    /**
	 * 获取：所属行业
	 */

    public void setQiyexinxiHangye(String qiyexinxiHangye) {
        this.qiyexinxiHangye = qiyexinxiHangye;
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
        return "Qiyexinxi{" +
            "id=" + id +
            ", qiyexinxiName=" + qiyexinxiName +
            ", qiyexinxiNumber=" + qiyexinxiNumber +
            ", qiyexinxiQiangxiang=" + qiyexinxiQiangxiang +
            ", qiyexinxiHangye=" + qiyexinxiHangye +
            ", createTime=" + createTime +
        "}";
    }
}
