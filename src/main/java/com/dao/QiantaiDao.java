package com.dao;

import com.entity.QiantaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiantaiVO;
import com.entity.view.QiantaiView;


/**
 * 前台
 * 
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
public interface QiantaiDao extends BaseMapper<QiantaiEntity> {
	
	List<QiantaiVO> selectListVO(@Param("ew") Wrapper<QiantaiEntity> wrapper);
	
	QiantaiVO selectVO(@Param("ew") Wrapper<QiantaiEntity> wrapper);
	
	List<QiantaiView> selectListView(@Param("ew") Wrapper<QiantaiEntity> wrapper);

	List<QiantaiView> selectListView(Pagination page,@Param("ew") Wrapper<QiantaiEntity> wrapper);
	
	QiantaiView selectView(@Param("ew") Wrapper<QiantaiEntity> wrapper);
	
}
