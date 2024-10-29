package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LuxianguihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LuxianguihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LuxianguihuaView;


/**
 * 路线规划
 *
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
public interface LuxianguihuaService extends IService<LuxianguihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LuxianguihuaVO> selectListVO(Wrapper<LuxianguihuaEntity> wrapper);
   	
   	LuxianguihuaVO selectVO(@Param("ew") Wrapper<LuxianguihuaEntity> wrapper);
   	
   	List<LuxianguihuaView> selectListView(Wrapper<LuxianguihuaEntity> wrapper);
   	
   	LuxianguihuaView selectView(@Param("ew") Wrapper<LuxianguihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LuxianguihuaEntity> wrapper);
   	
}

