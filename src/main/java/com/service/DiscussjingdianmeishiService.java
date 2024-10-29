package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingdianmeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingdianmeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingdianmeishiView;


/**
 * 景点美食评论表
 *
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
public interface DiscussjingdianmeishiService extends IService<DiscussjingdianmeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingdianmeishiVO> selectListVO(Wrapper<DiscussjingdianmeishiEntity> wrapper);
   	
   	DiscussjingdianmeishiVO selectVO(@Param("ew") Wrapper<DiscussjingdianmeishiEntity> wrapper);
   	
   	List<DiscussjingdianmeishiView> selectListView(Wrapper<DiscussjingdianmeishiEntity> wrapper);
   	
   	DiscussjingdianmeishiView selectView(@Param("ew") Wrapper<DiscussjingdianmeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingdianmeishiEntity> wrapper);
   	
}

