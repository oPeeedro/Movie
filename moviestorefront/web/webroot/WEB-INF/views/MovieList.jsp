<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <title>Movie List</title>
    <body>
        <h1>Movie List</h1>
     <ul>
     <c:forEach var="movie" items="${movies}">
        <li><a href="./movies/${movie.name}">${movie.name}</a></li>
      </c:forEach>
      </ul>
    </body>
</html>