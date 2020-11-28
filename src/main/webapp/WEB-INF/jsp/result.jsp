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
.results {
	margin-left: 25%;
	margin-right: 25%;
	margin-top: 10%;
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
	<div class="results">
		<table style="width:100%">
  <tr>
    <th>Category</th>
    <th>Count</th>

  </tr>
  <tr>
    <td>Total</td>
    <td>${total}</td>
  </tr>
  <tr>

    <td>Unanswred</td>
    <td>${unans}</td>
  </tr>
  <tr>
    <td>wrong</td>
    <td>${wrong}</td>
  </tr>
    <tr>
    <td>correct</td>
    <td>${correct}</td>
  </tr>
</table>
	</div>
</body>