<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/defaults.css">
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
	<form class="center" action="/quiz">
	<h1 class="hi">Hi ${name}</h1>
	<div class="center"><button value="start">start Quiz</button></div>
	</form>
</body>
</html>