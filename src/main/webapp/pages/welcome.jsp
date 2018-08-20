<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>Welcome JSP</title>
</head>
<body>

<%--<h3>Welcome alien ${obj}</h3><br>--%>
<h3>Welcome alien: ${obj.aid}, ${obj.aname}</h3><br>
     <form action="addAlien">
         <label>Object name</label> <input type="text" name="aname"><br>
         <label>Object ID</label> <input type="text" name="aid"><br>
         <label>Object Lang</label> <input type="text" name="lang"><br>
         <input type="submit" name="Input in DB">
     </form>

    <form action="getAlien">
        <label>Object ID</label> <input type="text" name="aid"><br>
        <input type="submit" name="Find">
    </form>
</body>
</html>