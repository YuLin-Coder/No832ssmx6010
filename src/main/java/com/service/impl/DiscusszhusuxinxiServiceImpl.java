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


import com.dao.DiscusszhusuxinxiDao;
import com.entity.DiscusszhusuxinxiEntity;
import com.service.DiscusszhusuxinxiService;
import com.entity.vo.DiscusszhusuxinxiVO;
import com.entity.view.DiscusszhusuxinxiView;

@Service("discusszhusuxinxiService")
public class DiscusszhusuxinxiServiceImpl extends ServiceImpl<DiscusszhusuxinxiDao, DiscusszhusuxinxiEntity> implements DiscusszhusuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhusuxinxiEntity> page = this.selectPage(
                new Query<DiscusszhusuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusszhusuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhusuxinxiEntity> wrapper) {
		  Page<DiscusszhusuxinxiView> page =new Query<DiscusszhusuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhusuxinxiVO> selectListVO(Wrapper<DiscusszhusuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhusuxinxiVO selectVO(Wrapper<DiscusszhusuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhusuxinxiView> selectListView(Wrapper<DiscusszhusuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhusuxinxiView selectView(Wrapper<DiscusszhusuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
