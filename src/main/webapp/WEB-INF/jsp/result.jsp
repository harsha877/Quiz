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
</html>