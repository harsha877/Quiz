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