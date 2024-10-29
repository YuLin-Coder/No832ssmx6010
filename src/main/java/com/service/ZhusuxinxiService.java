package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhusuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhusuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhusuxinxiView;


/**
 * 住宿信息
 *
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
public interface ZhusuxinxiService extends IService<ZhusuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhusuxinxiVO> selectListVO(Wrapper<ZhusuxinxiEntity> wrapper);
   	
   	ZhusuxinxiVO selectVO(@Param("ew") Wrapper<ZhusuxinxiEntity> wrapper);
   	
   	List<ZhusuxinxiView> selectListView(Wrapper<ZhusuxinxiEntity> wrapper);
   	
   	ZhusuxinxiView selectView(@Param("ew") Wrapper<ZhusuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhusuxinxiEntity> wrapper);
   	
}

