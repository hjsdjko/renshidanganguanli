package com.entity.view;

import com.entity.QiyexinxiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 企业信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("qiyexinxi")
public class QiyexinxiView extends QiyexinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;




	public QiyexinxiView() {

	}

	public QiyexinxiView(QiyexinxiEntity qiyexinxiEntity) {
		try {
			BeanUtils.copyProperties(this, qiyexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}












}
