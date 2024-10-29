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


import com.dao.ZhusuxinxiDao;
import com.entity.ZhusuxinxiEntity;
import com.service.ZhusuxinxiService;
import com.entity.vo.ZhusuxinxiVO;
import com.entity.view.ZhusuxinxiView;

@Service("zhusuxinxiService")
public class ZhusuxinxiServiceImpl extends ServiceImpl<ZhusuxinxiDao, ZhusuxinxiEntity> implements ZhusuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhusuxinxiEntity> page = this.selectPage(
                new Query<ZhusuxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhusuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhusuxinxiEntity> wrapper) {
		  Page<ZhusuxinxiView> page =new Query<ZhusuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhusuxinxiVO> selectListVO(Wrapper<ZhusuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhusuxinxiVO selectVO(Wrapper<ZhusuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhusuxinxiView> selectListView(Wrapper<ZhusuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhusuxinxiView selectView(Wrapper<ZhusuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
