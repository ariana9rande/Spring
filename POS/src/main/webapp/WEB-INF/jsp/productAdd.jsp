<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Add</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link rel="shortcut icon" href="/images/favicon.ico" type="image/x-icon">
</head>
<body>
<%@ include file="logout.jsp" %>
<div class="header">
    <h1>Product Add</h1>
</div>
<%@ include file="navbar.jsp" %>
<div class="container">
    <form action="/product/add" method="post">
        <div class="form-group">
            <label for="product">Product</label>
            <select id="product" name="productId" class="form-control" required>
                <option value="">Select Product</option>
                <c:forEach var="product" items="${products}">
                    <option value="${product.id}">${product.name}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="quantity">Quantity</label>
            <input type="number" id="quantity" name="quantity" class="form-control" required>
            <p>${error}</p>
        </div>
        <button type="submit" class="btn btn-primary">Add Stock</button>
    </form>
</div>
<div class="container">
    <h2>상품 목록</h2>
    <table class="table">
        <thead>
        <tr>
            <th>상품명</th>
            <th>가격</th>
            <th>수량</th>
            <th>구매가격</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.stock}</td>
                <td>${product.purchasePrice}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
