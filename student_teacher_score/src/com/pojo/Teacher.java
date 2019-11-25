package com.pojo;

import java.util.List;

public class Teacher {
    private Integer id;
    private String teaname, teaclass;
    private Students students;
    private Score score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeaname() {
        return teaname;
    }

    public void setTeaname(String teaname) {
        this.teaname = teaname;
    }

    public String getTeaclass() {
        return teaclass;
    }

    public void setTeaclass(String teaclass) {
        this.teaclass = teaclass;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teaname='" + teaname + '\'' +
                ", teaclass='" + teaclass + '\'' +
                ", students=" + students +
                ", score=" + score +
                '}';
    }
}
