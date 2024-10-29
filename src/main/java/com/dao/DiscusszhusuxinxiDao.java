package com.dao;

import com.entity.DiscusszhusuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhusuxinxiVO;
import com.entity.view.DiscusszhusuxinxiView;


/**
 * 住宿信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
public interface DiscusszhusuxinxiDao extends BaseMapper<DiscusszhusuxinxiEntity> {
	
	List<DiscusszhusuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusszhusuxinxiEntity> wrapper);
	
	DiscusszhusuxinxiVO selectVO(@Param("ew") Wrapper<DiscusszhusuxinxiEntity> wrapper);
	
	List<DiscusszhusuxinxiView> selectListView(@Param("ew") Wrapper<DiscusszhusuxinxiEntity> wrapper);

	List<DiscusszhusuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhusuxinxiEntity> wrapper);
	
	DiscusszhusuxinxiView selectView(@Param("ew") Wrapper<DiscusszhusuxinxiEntity> wrapper);
	
}
