package com.pojo;

import java.util.List;

public class Students {
    private Integer id,tid;
    private String stuname,stuclass;

    private Teacher teacher;
    private Score score;

    public Students() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStuclass() {
        return stuclass;
    }

    public void setStuclass(String stuclass) {
        this.stuclass = stuclass;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", tid=" + tid +
                ", stuname='" + stuname + '\'' +
                ", stuclass='" + stuclass + '\'' +
                ", teacher=" + teacher +
                ", score=" + score +
                '}';
    }
}
