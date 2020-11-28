<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/mainStyles.css">
<link rel="stylesheet" type="text/css" href="/css/login.css">

</head>
<body>
	<div class="login">
		<form action="/home/sign" method="post">
			<h1>Sign-up</h1>
			<div>
				<div><label>Name</label></div>
				<div><input type="text" name="name" required></div>
			</div>

			<div>
				<div><label>Username</label></div>
				<div><input type="text" name="username" required></div>
			</div>
			<div>
				<div><label>Password</label></div>
				<div><input type="password" name="password" required></div>
			</div>
			<div>
				<div><label>Repeat Password</label></div>
				<div><input type="text" name="" required></div>
			</div>
			<div>
				<button>
					submit
				</button>
			</div>
			<div><a href="/home/login">Already a user </a></div>
		</form>

	</div>
</body>
</html>