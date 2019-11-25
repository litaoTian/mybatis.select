package com.pojo;

public class Score {
    private int id,java,android;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getAndroid() {
        return android;
    }

    public void setAndroid(int android) {
        this.android = android;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", java=" + java +
                ", android=" + android +
                '}';
    }
}
