package com.dmchrl.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dmchrl.domain.Score;

import java.util.List;

/**
 * Created by dmchrl on 2019/3/3.
 */
public interface ScoreMapper extends BaseMapper<Score> {

  public List<Score> findAll();

  public void insertScore(Score score);
}
