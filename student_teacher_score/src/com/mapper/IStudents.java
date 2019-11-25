package com.mapper;

import com.pojo.Students;
import java.util.List;

public interface IStudents {
    //通过姓名，班级实现多条件查询
    public List<Students> selectByName_Class(String stuname,String stuclass);
    //查询学生对于的老师
    public List<Students> seletcStu_Tea();
    //根据id查询学生的成绩
    public List<Students> seletc_stu_score();

}
