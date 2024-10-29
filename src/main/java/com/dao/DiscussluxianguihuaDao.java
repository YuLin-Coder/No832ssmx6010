package com.dao;

import com.entity.DiscussluxianguihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussluxianguihuaVO;
import com.entity.view.DiscussluxianguihuaView;


/**
 * 路线规划评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
public interface DiscussluxianguihuaDao extends BaseMapper<DiscussluxianguihuaEntity> {
	
	List<DiscussluxianguihuaVO> selectListVO(@Param("ew") Wrapper<DiscussluxianguihuaEntity> wrapper);
	
	DiscussluxianguihuaVO selectVO(@Param("ew") Wrapper<DiscussluxianguihuaEntity> wrapper);
	
	List<DiscussluxianguihuaView> selectListView(@Param("ew") Wrapper<DiscussluxianguihuaEntity> wrapper);

	List<DiscussluxianguihuaView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussluxianguihuaEntity> wrapper);
	
	DiscussluxianguihuaView selectView(@Param("ew") Wrapper<DiscussluxianguihuaEntity> wrapper);
	
}
