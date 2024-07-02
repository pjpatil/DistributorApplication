package org.tech.repository;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DBConfig {

	protected Connection conn;
	protected PreparedStatement stmt;
	protected ResultSet rs;
	private static DBConfig db=null;

	private DBConfig(String path) {
		try {
//			File f=new File(".");
//			String path=f.getAbsolutePath().substring(0,f.getAbsolutePath().length()-1)+"resources\\db.properties";
			FileInputStream fin=new FileInputStream(path);
			Properties p= new Properties();
			System.out.println(path);
			p.load(fin);
			String username=p.getProperty("db.username");
			String password=p.getProperty("db.password");
			String url=p.getProperty("db.url");
			String driverClassName=p.getProperty("db.driverClassName");
			
			Class.forName(driverClassName);
			conn=DriverManager.getConnection(url,username,password);
			if(conn!=null) {
				System.out.println("Database is conected. ");
			}
			else {
				System.out.println("Database is not conected !");
			}
		}
		catch(Exception ex){
			System.out.println("Error is "+ex);
		}
	}

	public static DBConfig getInstance(String path) {
		if(db==null) {
			db=new DBConfig(path);
		}
		return db;
	}

	public Connection getConnection() {
		return conn;
	}

	public PreparedStatement getPreparedStatement() {
		return stmt;
	}

	public ResultSet getResultSet() {
		return rs;
	}

}
