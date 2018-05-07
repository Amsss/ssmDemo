package com.zhuzz.ssmDemo.mapper.user;

import com.zhuzz.ssmDemo.dto.user.Student;
import com.zhuzz.ssmDemo.mapper.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: Zezhao.Zhu
 * @Description:
 * @Date: 9:34 2018/5/4
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    Student findStudent(String name);
}
