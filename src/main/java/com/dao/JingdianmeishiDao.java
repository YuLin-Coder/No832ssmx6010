package com.dao;

import com.entity.JingdianmeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingdianmeishiVO;
import com.entity.view.JingdianmeishiView;


/**
 * 景点美食
 * 
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
public interface JingdianmeishiDao extends BaseMapper<JingdianmeishiEntity> {
	
	List<JingdianmeishiVO> selectListVO(@Param("ew") Wrapper<JingdianmeishiEntity> wrapper);
	
	JingdianmeishiVO selectVO(@Param("ew") Wrapper<JingdianmeishiEntity> wrapper);
	
	List<JingdianmeishiView> selectListView(@Param("ew") Wrapper<JingdianmeishiEntity> wrapper);

	List<JingdianmeishiView> selectListView(Pagination page,@Param("ew") Wrapper<JingdianmeishiEntity> wrapper);
	
	JingdianmeishiView selectView(@Param("ew") Wrapper<JingdianmeishiEntity> wrapper);
	
}
