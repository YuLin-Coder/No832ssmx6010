package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiantaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiantaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiantaiView;


/**
 * 前台
 *
 * @author 
 * @email 
 * @date 2021-03-20 09:46:50
 */
public interface QiantaiService extends IService<QiantaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiantaiVO> selectListVO(Wrapper<QiantaiEntity> wrapper);
   	
   	QiantaiVO selectVO(@Param("ew") Wrapper<QiantaiEntity> wrapper);
   	
   	List<QiantaiView> selectListView(Wrapper<QiantaiEntity> wrapper);
   	
   	QiantaiView selectView(@Param("ew") Wrapper<QiantaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiantaiEntity> wrapper);
   	
}

