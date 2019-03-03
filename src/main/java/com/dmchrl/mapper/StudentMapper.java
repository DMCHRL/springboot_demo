package com.dmchrl.mapper;

import com.dmchrl.domain.Student;
import org.apache.ibatis.annotations.*;

/**
 * Created by dmchrl on 2019/3/3.
 */
//@Mapper
public interface StudentMapper {

  @Select("select * from t_student where id =#{id}")
  public Student getById(String id);

  @SelectKey(keyProperty = "id",resultType = String.class,before = true,
    statement = "select replace(uuid(), '-', '')")
  @Options(keyProperty = "id", useGeneratedKeys = true)
  //@Options(useGeneratedKeys = true,keyProperty = "id") //自增策略
  @Insert("insert into t_student(id,name,age) values(#{id},#{name},#{age})")
  public int insertStudent(Student student);
}
