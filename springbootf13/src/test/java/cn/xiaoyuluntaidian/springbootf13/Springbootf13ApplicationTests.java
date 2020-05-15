package cn.xiaoyuluntaidian.springbootf13;

import cn.xiaoyuluntaidian.springbootf13.dao.IUserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class Springbootf13ApplicationTests {

	@Autowired
	private IUserDao dao;

	@Test
	void contextLoads() throws SQLException {
		System.out.println(dao.findAll());
	}

}
