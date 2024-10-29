package com.entity.view;

import com.entity.YaoqingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 邀请信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
@TableName("yaoqingxinxi")
public class YaoqingxinxiView  extends YaoqingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YaoqingxinxiView(){
	}
 
 	public YaoqingxinxiView(YaoqingxinxiEntity yaoqingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yaoqingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
