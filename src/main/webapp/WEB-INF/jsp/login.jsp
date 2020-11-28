<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/mainStyles.css">
<link rel="stylesheet" type="text/css" href="/css/login.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script type="text/javascript">
 $(document).ready(function(){
   $("#header").load("../home/nav");
  });
</script>
</head>
<body>
    <div id="header"></div>
	<div class="login">
		<form action="/home/login" method="post">
			<h1>Login</h1>
			<div>
				<div><label>Username</label></div>
				<div><input type="text" name="username" required></div>
			</div>
			<div>
				<div><label>Password</label></div>
				<div><input type="password" name="password" required></div>
			</div>
			<div>
                <div><input type="submit" name="submit" value="submit" required></div>
            </div>

		</form>

	</div>
</body>
</html>