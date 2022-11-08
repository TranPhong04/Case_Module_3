<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>TGP Shop</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-3">
    <h1 style="color: #20c997"align="center">User: Products List</h1>



    <table class="table">
        <form action="/show" method="get">
            <button type="submit" class="btn btn-success"  >Show</button>
        <thead>
        <tr>
            <th>ID</th>
            <th>Product's Name</th>
            <th>Image</th>
            <th>Price</th>
            <th>Amount</th>
            <th>Detail</th>
            <th>Buy</th>
            <th>Seemore</th>
        </tr>
        </thead>
        <c:forEach items="${products}" var="sp" >
            <tbody>

            <tr>
                <td>${sp.id}</td>
                <td>${sp.name}</td>
                <td><img src="${sp.img}" width="250px" height="200px"></td>
                <td>${sp.price}</td>
                <td>${sp.amount}</td>
                <td>${sp.detail}</td>
                <td><a type="button" class="btn btn-warning" href="/edit?id=${sp.id}">Buy</a></td>
                <td><a type="button" class="btn btn-success" href="/delete?id=${sp.id}">See More</a></td>
            </tr>

            </tbody>
        </c:forEach>
        </form>
    </table>
    <a type="button" class="btn btn-success"  href="/index.jsp">Main Menu</a>
</div>

</body>
</html>

