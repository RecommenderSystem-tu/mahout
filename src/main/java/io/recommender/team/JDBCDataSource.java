package io.recommender.team;

import java.io.*;
import java.util.Properties;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class JDBCDataSource {
	public MysqlDataSource getDataSource() {
		Properties prop = new Properties();

		try {
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream("jdbc.properties");
			prop.load(inputStream);
			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setServerName(prop.getProperty("jdbc.host"));
			dataSource.setUser(prop.getProperty("jdbc.username"));
			dataSource.setPassword(prop.getProperty("jdbc.password"));
			dataSource.setDatabaseName(prop.getProperty("jdbc.dataBase"));
			return dataSource;
					
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
