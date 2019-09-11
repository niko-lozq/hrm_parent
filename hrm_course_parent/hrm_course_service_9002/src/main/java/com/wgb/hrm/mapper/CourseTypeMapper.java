package com.wgb.hrm.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.wgb.hrm.domain.CourseType;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.wgb.hrm.query.CourseTypeQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 课程目录 Mapper 接口
 * </p>
 *
 * @author niko
 * @since 2019-09-03
 */
public interface CourseTypeMapper extends BaseMapper<CourseType> {
    /**
     * @param page
     * @param query
     * @return
     */
    List<CourseType> loadListPage(Pagination page,
                                  @Param("query") CourseTypeQuery query);
}
