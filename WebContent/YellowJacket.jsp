<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<f:view>
<h:outputText value="Hello World ! (in JSF !)" />
<br />
<h:selectOneListbox >
	<f:selectItems value="#{YellowJacketBeanList.list}"/>
</h:selectOneListbox> 
 <h:graphicImage value = "https://img.imt.fr/signature-mail/logos/logo-imtld.png"/>
 <h:commandButton />
 <h:outputLabel />
 
</f:view>
</body>
</html>