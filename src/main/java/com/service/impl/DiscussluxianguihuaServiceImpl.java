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


import com.dao.DiscussluxianguihuaDao;
import com.entity.DiscussluxianguihuaEntity;
import com.service.DiscussluxianguihuaService;
import com.entity.vo.DiscussluxianguihuaVO;
import com.entity.view.DiscussluxianguihuaView;

@Service("discussluxianguihuaService")
public class DiscussluxianguihuaServiceImpl extends ServiceImpl<DiscussluxianguihuaDao, DiscussluxianguihuaEntity> implements DiscussluxianguihuaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussluxianguihuaEntity> page = this.selectPage(
                new Query<DiscussluxianguihuaEntity>(params).getPage(),
                new EntityWrapper<DiscussluxianguihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussluxianguihuaEntity> wrapper) {
		  Page<DiscussluxianguihuaView> page =new Query<DiscussluxianguihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussluxianguihuaVO> selectListVO(Wrapper<DiscussluxianguihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussluxianguihuaVO selectVO(Wrapper<DiscussluxianguihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussluxianguihuaView> selectListView(Wrapper<DiscussluxianguihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussluxianguihuaView selectView(Wrapper<DiscussluxianguihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
