<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!doctype html>
<html>
<title>Place Details</title>
<body>
    <h1>Place Details</h1>
    Place Details for ${ticket.name}
    <p>${ticket.description}</p>
    <p>Schedule:</p>
    <table>
        <tr><th>Venue</th><th></th><th>Date</th></tr>
        <c:forEach var="ticket" items="${place.name}">
            <tr><td>${ticket.venue}</td><td>${ticket.type}</td><td><fmt:formatDate pattern="dd MMM yyyy" value="${ticket.date}" /></td></tr>
        </c:forEach>
    </table>
    <a href="../tickets">Back to Band List</a>
</body>
</html>