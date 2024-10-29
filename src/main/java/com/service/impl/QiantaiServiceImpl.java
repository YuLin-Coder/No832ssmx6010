package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QiantaiDao;
import com.entity.QiantaiEntity;
import com.service.QiantaiService;
import com.entity.vo.QiantaiVO;
import com.entity.view.QiantaiView;

@Service("qiantaiService")
public class QiantaiServiceImpl extends ServiceImpl<QiantaiDao, QiantaiEntity> implements QiantaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiantaiEntity> page = this.selectPage(
                new Query<QiantaiEntity>(params).getPage(),
                new EntityWrapper<QiantaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiantaiEntity> wrapper) {
		  Page<QiantaiView> page =new Query<QiantaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiantaiVO> selectListVO(Wrapper<QiantaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiantaiVO selectVO(Wrapper<QiantaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiantaiView> selectListView(Wrapper<QiantaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiantaiView selectView(Wrapper<QiantaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
