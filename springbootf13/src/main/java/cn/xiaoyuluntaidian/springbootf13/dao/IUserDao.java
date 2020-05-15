package cn.xiaoyuluntaidian.springbootf13.dao;

import cn.xiaoyuluntaidian.springbootf13.domain.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {
    @Select("SELECT * FROM usertable")
    List<Student> findAll();
}
