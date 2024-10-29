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


import com.dao.LuxianguihuaDao;
import com.entity.LuxianguihuaEntity;
import com.service.LuxianguihuaService;
import com.entity.vo.LuxianguihuaVO;
import com.entity.view.LuxianguihuaView;

@Service("luxianguihuaService")
public class LuxianguihuaServiceImpl extends ServiceImpl<LuxianguihuaDao, LuxianguihuaEntity> implements LuxianguihuaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LuxianguihuaEntity> page = this.selectPage(
                new Query<LuxianguihuaEntity>(params).getPage(),
                new EntityWrapper<LuxianguihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LuxianguihuaEntity> wrapper) {
		  Page<LuxianguihuaView> page =new Query<LuxianguihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LuxianguihuaVO> selectListVO(Wrapper<LuxianguihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LuxianguihuaVO selectVO(Wrapper<LuxianguihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LuxianguihuaView> selectListView(Wrapper<LuxianguihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LuxianguihuaView selectView(Wrapper<LuxianguihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
