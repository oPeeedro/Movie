<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Movie Details</title>
<body>
    <h1>Movie Details</h1>
    Movie Details for ${movie.name}
    <p>${movie.synopsis}</p>
    <p>Music type:</p>
    <ul>
        <c:forEach var="types" items="${movie.types}">
            <li>${types}</li>
        </c:forEach>
    </ul>
    <p>Ticket History:</p>
    <ul>
        <c:forEach var="ticket" items="${movie.place}">
            <li><a href="../ticket/{ticketId}">${ticket.id}</a>(Ticket: ${ticket.description})</li>
        </c:forEach>
    </ul>
    <a href="../movies">Back to Movie List</a>
</body>
</html>