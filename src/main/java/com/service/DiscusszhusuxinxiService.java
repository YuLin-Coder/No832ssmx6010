package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhusuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhusuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhusuxinxiView;


/**
 * 住宿信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
public interface DiscusszhusuxinxiService extends IService<DiscusszhusuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhusuxinxiVO> selectListVO(Wrapper<DiscusszhusuxinxiEntity> wrapper);
   	
   	DiscusszhusuxinxiVO selectVO(@Param("ew") Wrapper<DiscusszhusuxinxiEntity> wrapper);
   	
   	List<DiscusszhusuxinxiView> selectListView(Wrapper<DiscusszhusuxinxiEntity> wrapper);
   	
   	DiscusszhusuxinxiView selectView(@Param("ew") Wrapper<DiscusszhusuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhusuxinxiEntity> wrapper);
   	
}

