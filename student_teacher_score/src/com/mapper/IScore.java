package com.mapper;

import com.pojo.Score;

public interface IScore {
    //通过学号查询成绩
    public Score selectScoreById(Integer id);
}
