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


import com.dao.DiscussjingdianmeishiDao;
import com.entity.DiscussjingdianmeishiEntity;
import com.service.DiscussjingdianmeishiService;
import com.entity.vo.DiscussjingdianmeishiVO;
import com.entity.view.DiscussjingdianmeishiView;

@Service("discussjingdianmeishiService")
public class DiscussjingdianmeishiServiceImpl extends ServiceImpl<DiscussjingdianmeishiDao, DiscussjingdianmeishiEntity> implements DiscussjingdianmeishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingdianmeishiEntity> page = this.selectPage(
                new Query<DiscussjingdianmeishiEntity>(params).getPage(),
                new EntityWrapper<DiscussjingdianmeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingdianmeishiEntity> wrapper) {
		  Page<DiscussjingdianmeishiView> page =new Query<DiscussjingdianmeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingdianmeishiVO> selectListVO(Wrapper<DiscussjingdianmeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingdianmeishiVO selectVO(Wrapper<DiscussjingdianmeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingdianmeishiView> selectListView(Wrapper<DiscussjingdianmeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingdianmeishiView selectView(Wrapper<DiscussjingdianmeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
