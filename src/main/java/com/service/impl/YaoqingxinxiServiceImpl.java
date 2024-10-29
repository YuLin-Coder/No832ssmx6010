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


import com.dao.YaoqingxinxiDao;
import com.entity.YaoqingxinxiEntity;
import com.service.YaoqingxinxiService;
import com.entity.vo.YaoqingxinxiVO;
import com.entity.view.YaoqingxinxiView;

@Service("yaoqingxinxiService")
public class YaoqingxinxiServiceImpl extends ServiceImpl<YaoqingxinxiDao, YaoqingxinxiEntity> implements YaoqingxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaoqingxinxiEntity> page = this.selectPage(
                new Query<YaoqingxinxiEntity>(params).getPage(),
                new EntityWrapper<YaoqingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaoqingxinxiEntity> wrapper) {
		  Page<YaoqingxinxiView> page =new Query<YaoqingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaoqingxinxiVO> selectListVO(Wrapper<YaoqingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaoqingxinxiVO selectVO(Wrapper<YaoqingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaoqingxinxiView> selectListView(Wrapper<YaoqingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaoqingxinxiView selectView(Wrapper<YaoqingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
