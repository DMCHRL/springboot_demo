package com.dmchrl.controller;

import com.dmchrl.domain.Score;
import com.dmchrl.domain.Student;
import com.dmchrl.mapper.ScoreMapper;
import com.dmchrl.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by dmchrl on 2019/3/3.
 */
@RestController
public class StudentRest {

  private final StudentMapper studentMapper;

  public StudentRest(StudentMapper studentMapper){
    this.studentMapper = studentMapper;
  }

  @Autowired
  ScoreMapper scoreMapper;

  @GetMapping("/findStudentById/{id}")
  public Student findStudentById(@PathVariable String id){
    return studentMapper.getById(id);
  }

  @GetMapping("/insertStudent")
  public Student insertStudent( Student student){
    studentMapper.insertStudent(student);
    return student;
  }

  @GetMapping("/score/findAll")
  public List<Score> findAll(){
    return scoreMapper.findAll();
  }

  @GetMapping("/insertScore")
  public Score insertScore( Score score){
    scoreMapper.insert(score);
    return score;
  }

}
