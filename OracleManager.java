package project.manager.frame;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class OracleManager
  implements DBManager
{
  private String driver = "oracle.jdbc.driver.OracleDriver";
  private Connection con;
  
  public OracleManager()
    throws Exception
  {
    Properties prop = new Properties();
    String path = getClass().getResource("").getPath();
    path = URLDecoder.decode(path, "UTF-8") + "log.txt";
    File file = new File(path);
    if (!file.exists()) {
      throw new Exception("DB에 연결되지 못했습니다.");
    }
    prop.load(new FileReader(file));
    Class.forName(this.driver);
    this.con = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"), prop.getProperty("pwd"));
  }
  
  public PreparedStatement create(String sql)
    throws SQLException
  {
    return this.con.prepareStatement(sql);
  }
  
  public Statement create()
    throws SQLException
  {
    return this.con.createStatement();
  }
}
