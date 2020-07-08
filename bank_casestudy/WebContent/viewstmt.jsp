<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style>
					table, tr, td{
						 border: 1px solid black;
						 width : 40%;
						 text-align: center;
					}
				</style>
</head>
<body>
<c:forEach var="s" items="${list}">
						<table>
							<tr>
								
								<td>
									<c:out value="${s.getType()}"></c:out>
								</td>
								<td>
									<c:out value="${s.getAmount()}"></c:out>
								</td>
									
							</tr>
						</table>
					</c:forEach>
</body>
</html>