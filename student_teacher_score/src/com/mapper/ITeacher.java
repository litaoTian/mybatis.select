package com.mapper;

import com.pojo.Teacher;

import java.util.List;

public interface ITeacher {
    //老师查看学生的成绩
    List<Teacher> select_score();
}
