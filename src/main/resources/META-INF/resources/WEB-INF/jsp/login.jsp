<html>
<head>
	<meta charset="UTF-8">
	<link href="webjars/bootstrap/5.2.0/css/bootstrap.min.css" rel="stylesheet" >
	<title>Login Page</title>
</head>
<body>
	<div class="container">
		<h1>Login</h1>
		<pre>${errorMessage}</pre>
		<form method="post">
			Name: <input type="text" name="name">
			Password: <input type="password" name="password">
			<input type="submit"><br>
		</form>
	</div>

	<script src="webjars/bootstrap/5.2.0/js/bootstrap.bundle.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>
