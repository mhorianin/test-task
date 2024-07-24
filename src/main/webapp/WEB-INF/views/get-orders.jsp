<!DOCTYPE html>
<html>
<head>
    <title>Order Submission Result</title>
    <script>
        function showAlert(message) {
            alert(message);
        }

        window.onload = function() {
            var message = '${message}';
            if (message) {
                showAlert(message);
            }
        }
    </script>
</head>
<body>
    <h2>Order Submission Result</h2>
    <p>${message}</p>
    <a href="/">Go Back</a>
</body>
</html>
