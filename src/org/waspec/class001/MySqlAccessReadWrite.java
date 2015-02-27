package org.waspec.class001;

import java.beans.Statement;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.PrivateKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by v-daisyq on 2/26/2015.
 */
public class MySqlAccessReadWrite {
    private Connection connection=null;
    private java.sql.Statement statement=null;
    private ResultSet resultSet=null;
    private FileWriter fileWriter=null;
    private BufferedWriter bufferedWriter=null;
    public void ConnectSql(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost/world","root","328053338");

        }catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    public void readSqlWriteFromSampleWorld(){
        try{
            statement=connection.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM city");

            fileWriter=new FileWriter("E:\\mysqlcity.word");
            bufferedWriter=new BufferedWriter(fileWriter);

            while (resultSet.next()){
                String string=resultSet.getString("name");
                int number=resultSet.getInt("ID");
                System.out.println(string);


                bufferedWriter.write(string);
                bufferedWriter.write(Integer.toString(number));
                bufferedWriter.newLine();

            }
            bufferedWriter.close();


        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }

}
