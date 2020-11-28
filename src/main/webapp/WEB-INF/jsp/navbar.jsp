<div class="navbar">
        <ul>

			<% if (session.getAttribute("name")==null) { %>
			    <li><a href="/home">Quiz</a></li>
                <li><a href="/home/login">Login </a></li>
                <li><a href="/home/sign">Sign Up</a></li>
            <% } else { %>
                <li><a href="/home/login">Quiz</a></li>
			    <li><a href="/home/signout">Sign out</a></li>
			<% } %>
		</ul>
</div>
