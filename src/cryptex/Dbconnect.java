
package cryptex;

import java.sql.*;


public class Dbconnect {
    
        private Connection con;
        private Statement st;
        private ResultSet rs;
        
        public Dbconnect(){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                
                con = DriverManager.getConnection("jdbc:mysql://192.168.0.10:3306/symp","root","dlink405");
                st = con.createStatement();
                
            }catch(Exception ex){
                System.out.println("Error : "+ex);
            }
        }
        
       public String[][] getData(){
            String[][] returnValue= new String[30][7];
            try{
                String query = "select * from ques order by rand() limit 20 ";
                rs = st.executeQuery(query);
                int i=0;
                while(rs.next()) {
                       returnValue[i][0]= rs.getString("ques_id");
                       returnValue[i][1] = rs.getString("Question");
                       returnValue[i][2] = rs.getString("Option1");
                       returnValue[i][3] = rs.getString("Option2");
                       returnValue[i][4] = rs.getString("Option3");
                       returnValue[i][5] = rs.getString("Option4");
                       returnValue[i][6] = rs.getString("Answer");
                    i++;
                }
                 for(int j=0;j<i;j++)
                {
                    for(int k=0;k<7;k++)
                    {
                        //System.out.println(returnValue[j][k]);
                    }
                }
                 
                 
                con.close();
                if (con.isClosed()) 
                System.out.println("Connection closed.");
                 
                 
            }catch(Exception cx){
                System.out.println("EXCEPTION  "+cx);
            }
             return returnValue;
        }
        
        public void putData(String name,int regid,int marks ,int time){
            try{
                //System.out.println(regid);
                //System.out.println(marks);
                int a=regid;
                int b=marks;
                int c=time;
                String d=name;
                String sql = "insert into reg values('"+d+"',"+a+","+b+","+c+")";
                st.executeUpdate(sql);
                
                
                con.close();
                if (con.isClosed()) 
                System.out.println("Connection closed.");
                
               
                
            }catch(Exception cx){
                System.out.println(cx);
            }
        }
}

