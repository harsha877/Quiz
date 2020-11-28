<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/mainStyles.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script type="text/javascript">
 $(document).ready(function(){
   $("#header").load("../home/nav");
  });
</script>
</head>
<body>
	<div id="header"></div>
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