<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.sql.Connection"
        import="java.sql.DriverManager"
        import="java.sql.ResultSet"
        import="java.sql.SQLException"
        import="java.sql.Statement"
        %>

<%
    Connection conex=null;
    Statement sql=null;
    try{
    Class.forName("com.mysql.jdbc.Driver");
    conex = (Connection)DriverManager.getConnection("jdbc:mysql://127.0.0.1/proyecto_conferencia","root","");
   sql = conex.createStatement();
   out.print("conexion Establecida");
    }catch(Exception e){
    out.print("ERROR EN LA CONEXION"+ e);
    }
    %>
    



        
