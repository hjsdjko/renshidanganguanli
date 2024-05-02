package com.entity.vo;

import com.entity.QiyexinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 企业信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qiyexinxi")
public class QiyexinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
