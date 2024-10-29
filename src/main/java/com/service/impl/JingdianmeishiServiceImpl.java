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


import com.dao.JingdianmeishiDao;
import com.entity.JingdianmeishiEntity;
import com.service.JingdianmeishiService;
import com.entity.vo.JingdianmeishiVO;
import com.entity.view.JingdianmeishiView;

@Service("jingdianmeishiService")
public class JingdianmeishiServiceImpl extends ServiceImpl<JingdianmeishiDao, JingdianmeishiEntity> implements JingdianmeishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingdianmeishiEntity> page = this.selectPage(
                new Query<JingdianmeishiEntity>(params).getPage(),
                new EntityWrapper<JingdianmeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingdianmeishiEntity> wrapper) {
		  Page<JingdianmeishiView> page =new Query<JingdianmeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingdianmeishiVO> selectListVO(Wrapper<JingdianmeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingdianmeishiVO selectVO(Wrapper<JingdianmeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingdianmeishiView> selectListView(Wrapper<JingdianmeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingdianmeishiView selectView(Wrapper<JingdianmeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
