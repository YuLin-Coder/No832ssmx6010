package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaoqingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaoqingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaoqingxinxiView;


/**
 * 邀请信息
 *
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
public interface YaoqingxinxiService extends IService<YaoqingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaoqingxinxiVO> selectListVO(Wrapper<YaoqingxinxiEntity> wrapper);
   	
   	YaoqingxinxiVO selectVO(@Param("ew") Wrapper<YaoqingxinxiEntity> wrapper);
   	
   	List<YaoqingxinxiView> selectListView(Wrapper<YaoqingxinxiEntity> wrapper);
   	
   	YaoqingxinxiView selectView(@Param("ew") Wrapper<YaoqingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaoqingxinxiEntity> wrapper);
   	
}

