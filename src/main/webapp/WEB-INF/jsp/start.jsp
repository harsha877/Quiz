<!DOCTYPE html>
<html>
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
	padding-left:15px;
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
.option:hover{
	color: black;
	background-color: #D7F390;
}
.option:focus{
	color: black;
	background-color: #BDF040;
}
.question{
	color: #BDF040;
	background: black;

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
	<div>
		<form action="/quiz/next" method="post">

  			<div>
  				Question: ${currentQuestion}
  				<input type="text" name="question" value=${id} hidden="true" >
  			</div>

 			<div class="option" tabindex="1" onclick="option(1)">
			1: ${o1}
			</div>

			<div class="option" tabindex="2" onclick="option(2)">
			2: ${o2}
			</div>

			<div class="option" tabindex="3" onclick="option(3)">
			3: ${o3}
			</div>
			<div class="option" tabindex="3" onclick="option(4)">
			4: ${o4}
			</div>
			<input type="text" name="option" id="option" value="0" hidden="true" >

  			<input type="submit" value="next" name="next">


		</form>
	</div>
  			<script type="application/javascript">
			function option(id){
			    document.getElementById("option").value = id;
			 }
			</script>


</body>
</html>