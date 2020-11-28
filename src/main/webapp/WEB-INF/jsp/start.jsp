<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/CSS/mainStyles.css">
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