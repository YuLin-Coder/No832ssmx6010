package com.entity.view;

import com.entity.QiantaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 前台
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
@TableName("qiantai")
public class QiantaiView  extends QiantaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiantaiView(){
	}
 
 	public QiantaiView(QiantaiEntity qiantaiEntity){
 	try {
			BeanUtils.copyProperties(this, qiantaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
