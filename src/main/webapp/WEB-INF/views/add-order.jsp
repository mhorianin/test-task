<!DOCTYPE html>
<html>
<head>
    <title>Customer Form</title>
    <script>
        function showAlert(message) {
            alert(message);
        }
    </script>
</head>
<body>
    <h2>Enter Product Details</h2>
    <form action="/test/private/createOrder" method="post">
        <label for="lastname">Customer Last Name:</label>
        <input type="text" id="lastname" name="lastname" required><br><br>
        <label for="product">Product Name:</label>
        <input type="text" id="product" name="product" required><br><br>
        <label for="quantity">Quantity:</label>
        <input type="number" id="quantity" name="quantity" required><br><br>
        <input type="submit" value="Submit">
    </form>
    <c:if test="${not empty message}">
        <script>
            showAlert('${message}');
        </script>
    </c:if>
</body>
</html>
