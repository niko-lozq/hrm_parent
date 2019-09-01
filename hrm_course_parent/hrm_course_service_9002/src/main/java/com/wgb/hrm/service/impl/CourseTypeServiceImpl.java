package com.wgb.hrm.service.impl;

import com.wgb.hrm.domain.CourseType;
import com.wgb.hrm.mapper.CourseTypeMapper;
import com.wgb.hrm.service.ICourseTypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课程目录 服务实现类
 * </p>
 *
 * @author niko
 * @since 2019-09-01
 */
@Service
public class CourseTypeServiceImpl extends ServiceImpl<CourseTypeMapper, CourseType> implements ICourseTypeService {

}
