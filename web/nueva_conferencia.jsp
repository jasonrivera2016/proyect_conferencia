<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="registro.java" method="post">
         Nombre Conferencia:
                <input type="text" name="Nombre conferencia">
                <br/>
         Nombre Expositor:
                <input type="text" name="Nombre Expositor">
                <br/>
         Capacidad:
                  <input type="text" name="Capacidad">
                  <br/>
         Fecha y hora:
                <input type="text" name="fecha y hora">
                <br/>
        Descripcion:
                 <input type="text area" name="AAA-MM-DD 00:00:00">
                <br/>
         Costo:
                <input type="text" name="costo">
                <br/>
          Sala:
                <input type="text" name="sala">
                <br/>
         Encargado:
                <input type="text" name="encargado">
                <br/>
    <p><input type="submit" value="Enviar"></p>
</form>
        
        
        
    </body>
</html>
