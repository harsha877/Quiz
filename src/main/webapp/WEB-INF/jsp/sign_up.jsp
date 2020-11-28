<head>
	<style>
body{
	margin: 0;
	padding: 0;
}
.login {
	margin-top: 50px;
	margin-left: 300px;
	width: 500px;
	height: 400px;
  	background-color: #F3EFF0;
  	border-radius: 5px;
  	padding-left: 200px;
  	border: 1px solid black;
}
.login form div div label{
	text-align: left;
}

.login form div {
	padding: 1px;

}
.login form div a{
	text-decoration: none;
}

</style>
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