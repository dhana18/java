<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<%@page import="com.se.tags.Client" %>
<%

Client s=new Client();
s.setA(1);
s.setB(3);
request.setAttribute("c", s);

%>


${c.a}
${c.b}
${c.a+c.b}
