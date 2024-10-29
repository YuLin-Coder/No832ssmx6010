package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussluxianguihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussluxianguihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussluxianguihuaView;


/**
 * 路线规划评论表
 *
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
public interface DiscussluxianguihuaService extends IService<DiscussluxianguihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussluxianguihuaVO> selectListVO(Wrapper<DiscussluxianguihuaEntity> wrapper);
   	
   	DiscussluxianguihuaVO selectVO(@Param("ew") Wrapper<DiscussluxianguihuaEntity> wrapper);
   	
   	List<DiscussluxianguihuaView> selectListView(Wrapper<DiscussluxianguihuaEntity> wrapper);
   	
   	DiscussluxianguihuaView selectView(@Param("ew") Wrapper<DiscussluxianguihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussluxianguihuaEntity> wrapper);
   	
}

