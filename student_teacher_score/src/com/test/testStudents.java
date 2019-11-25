package com.test;

import com.factory.Factory;
import com.mapper.IStudents;
import com.mapper.ITeacher;
import com.pojo.Students;
import com.pojo.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class testStudents {
    private SqlSession session=null;
    private IStudents iStudents;
    private ITeacher iTeacher;

    @Test
    public void  testselectByName_Class(){
        List<Students> studentsList;
        Factory factory=new Factory();
        session=factory.SqlSession();
        iStudents=session.getMapper(IStudents.class);
        studentsList= iStudents.selectByName_Class("田景鹏","2");
        for (Students students:studentsList){
            System.out.println(students.toString());
        }
    }
    @Test
    public void  testseletcStu_Tea(){
        List<Students> studentsList;
        Factory factory=new Factory();
        session=factory.SqlSession();
        iStudents=session.getMapper(IStudents.class);
        studentsList= iStudents.seletcStu_Tea();
        for (Students students:studentsList){
            System.out.println(students.toString());
        }
    }
    @Test
    public void  testselect_score(){
        List<Teacher> teacherList;
        Factory factory=new Factory();
        session=factory.SqlSession();
        iTeacher=session.getMapper(ITeacher.class);
        teacherList= iTeacher.select_score();
        for (Teacher teacher:teacherList){
            System.out.println(teacher.toString());
        }
    }
    @Test
    public void  testseletcStu_Sc(){

        Factory factory=new Factory();
        session=factory.SqlSession();
        iStudents=session.getMapper(IStudents.class);

        List<Students> studentsList=iStudents.seletc_stu_score();
        for (Students students:studentsList){
            System.out.println(students.toString());
        }
    }
}
