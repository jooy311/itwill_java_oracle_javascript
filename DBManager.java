package project.manager.frame;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public abstract interface DBManager
{
  public abstract PreparedStatement create(String paramString)
    throws SQLException;
  
  public abstract Statement create()
    throws SQLException;
}
