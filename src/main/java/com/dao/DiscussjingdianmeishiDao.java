package com.dao;

import com.entity.DiscussjingdianmeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingdianmeishiVO;
import com.entity.view.DiscussjingdianmeishiView;


/**
 * 景点美食评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
public interface DiscussjingdianmeishiDao extends BaseMapper<DiscussjingdianmeishiEntity> {
	
	List<DiscussjingdianmeishiVO> selectListVO(@Param("ew") Wrapper<DiscussjingdianmeishiEntity> wrapper);
	
	DiscussjingdianmeishiVO selectVO(@Param("ew") Wrapper<DiscussjingdianmeishiEntity> wrapper);
	
	List<DiscussjingdianmeishiView> selectListView(@Param("ew") Wrapper<DiscussjingdianmeishiEntity> wrapper);

	List<DiscussjingdianmeishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingdianmeishiEntity> wrapper);
	
	DiscussjingdianmeishiView selectView(@Param("ew") Wrapper<DiscussjingdianmeishiEntity> wrapper);
	
}
