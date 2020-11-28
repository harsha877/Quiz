<head>
	<style>
body{
	margin: 0;
	padding: 0;
}
.navbar {
  height: 8%;
  width: 100%;
  background-color: #F3EFF0;
  overflow: hidden;
}
.navbar ul{
	width: auto;
	float: right;

}
.navbar li{
	margin: 0;
	padding-left: 	15px;
	padding-right: 5px;
	text-align: right;
	display: inline-block;

}
.navbar a{
	text-decoration: none;
	color: #999B95;
}

.navbar ul li a:hover{
	color: #2F2F2D;
}
.hi {
	padding-top: 10%;
	text-align: center;
}

form{
text-align: center;
}
</style>
</head>
<body>
	<div class="navbar">

		<ul>
			<li><a href="/home/login">Quiz</a></li>
			<li><a href="/home/signout">Sign out</a></li>
		</ul>
	</div>

	<form action="/quiz">
	<h1 class="hi">Hi ${name}</h1>
	<button value="start">start Quiz</button>
	</form>
</body>