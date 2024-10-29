package com.entity.view;

import com.entity.DiscussluxianguihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 路线规划评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
@TableName("discussluxianguihua")
public class DiscussluxianguihuaView  extends DiscussluxianguihuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussluxianguihuaView(){
	}
 
 	public DiscussluxianguihuaView(DiscussluxianguihuaEntity discussluxianguihuaEntity){
 	try {
			BeanUtils.copyProperties(this, discussluxianguihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
