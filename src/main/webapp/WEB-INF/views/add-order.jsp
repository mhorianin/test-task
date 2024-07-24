<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Order</title>
</head>
<body>
    <h1>Create a New Order</h1>
    <form:form action="/order-create" modelAttribute="requestDto" method="post">
        <label for="lastname">Last Name</label>
        <form:input path="lastname" id="lastname" placeholder="Last Name" />
        <form:errors path="lastname" cssClass="error" />
        <br>
        <label for="product">Product</label>
        <form:input path="product" id="product" placeholder="Product" />
        <form:errors path="product" cssClass="error" />
        <br>
        <label for="quantity">Quantity</label>
        <form:input type="number" path="quantity" id="quantity" placeholder="Quantity" />
        <form:errors path="quantity" cssClass="error" />
        <br>
        <input type="submit" value="Create Order">
    </form:form>
</body>
</html>
