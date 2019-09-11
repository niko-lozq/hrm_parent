package com.wgb.hrm.service;

import com.wgb.hrm.domain.CourseType;
import com.baomidou.mybatisplus.service.IService;
import com.wgb.hrm.query.CourseTypeQuery;
import com.wgb.hrm.util.PageList;

import java.util.List;

/**
 * <p>
 * 课程目录 服务类
 * </p>
 *
 * @author niko
 * @since 2019-09-03
 */
public interface ICourseTypeService extends IService<CourseType> {
    /**
     * 高级查询+分页+关联查询
     * @param query
     * @return
     */
    PageList<CourseType> selectListPage(CourseTypeQuery query);

    /**
     * 通过父亲id获取儿子,及其儿子的儿子等子子孙孙
     * @param pid
     * @return
     */
    List<CourseType> queryTypeTree(Long pid);
}
