<html>
<head>
<link rel="stylesheet" type="text/css" href="/CSS/mainStyles.css">
<link rel="stylesheet" type="text/css" href="/CSS/login.css">
</head>
<body>
    <div class="navbar">
            <ul>
    			<li><a href="/home">Quiz</a></li>
    			<li><a href="/home/login">Login </a></li>
    			<li><a href="/home/sign">Sign Up</a></li>
    		</ul>
    </div>
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