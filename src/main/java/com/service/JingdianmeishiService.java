package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingdianmeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingdianmeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingdianmeishiView;


/**
 * 景点美食
 *
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
public interface JingdianmeishiService extends IService<JingdianmeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingdianmeishiVO> selectListVO(Wrapper<JingdianmeishiEntity> wrapper);
   	
   	JingdianmeishiVO selectVO(@Param("ew") Wrapper<JingdianmeishiEntity> wrapper);
   	
   	List<JingdianmeishiView> selectListView(Wrapper<JingdianmeishiEntity> wrapper);
   	
   	JingdianmeishiView selectView(@Param("ew") Wrapper<JingdianmeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingdianmeishiEntity> wrapper);
   	
}

