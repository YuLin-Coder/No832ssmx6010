package com.entity.view;

import com.entity.JingdianmeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 景点美食
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
@TableName("jingdianmeishi")
public class JingdianmeishiView  extends JingdianmeishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingdianmeishiView(){
	}
 
 	public JingdianmeishiView(JingdianmeishiEntity jingdianmeishiEntity){
 	try {
			BeanUtils.copyProperties(this, jingdianmeishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
