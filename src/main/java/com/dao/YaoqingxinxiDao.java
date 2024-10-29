package com.dao;

import com.entity.YaoqingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaoqingxinxiVO;
import com.entity.view.YaoqingxinxiView;


/**
 * 邀请信息
 * 
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
public interface YaoqingxinxiDao extends BaseMapper<YaoqingxinxiEntity> {
	
	List<YaoqingxinxiVO> selectListVO(@Param("ew") Wrapper<YaoqingxinxiEntity> wrapper);
	
	YaoqingxinxiVO selectVO(@Param("ew") Wrapper<YaoqingxinxiEntity> wrapper);
	
	List<YaoqingxinxiView> selectListView(@Param("ew") Wrapper<YaoqingxinxiEntity> wrapper);

	List<YaoqingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YaoqingxinxiEntity> wrapper);
	
	YaoqingxinxiView selectView(@Param("ew") Wrapper<YaoqingxinxiEntity> wrapper);
	
}
