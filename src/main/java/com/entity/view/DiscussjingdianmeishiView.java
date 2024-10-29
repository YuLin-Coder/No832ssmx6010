package com.entity.view;

import com.entity.DiscussjingdianmeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 景点美食评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
@TableName("discussjingdianmeishi")
public class DiscussjingdianmeishiView  extends DiscussjingdianmeishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjingdianmeishiView(){
	}
 
 	public DiscussjingdianmeishiView(DiscussjingdianmeishiEntity discussjingdianmeishiEntity){
 	try {
			BeanUtils.copyProperties(this, discussjingdianmeishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
