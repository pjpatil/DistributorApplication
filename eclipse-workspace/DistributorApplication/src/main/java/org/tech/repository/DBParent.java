package org.tech.repository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBParent {
	public static String path;
	protected DBConfig config=DBConfig.getInstance(path);
	protected Connection conn=config.getConnection();
	protected PreparedStatement stmt=config.getPreparedStatement();
	protected ResultSet rs=config.getResultSet();
}
