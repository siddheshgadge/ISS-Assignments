<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentication</title>
<link rel = "stylesheet" href="CSS/styles.css"/>

</head>
<body>

<input type="hidden" id="status" value="<%= request.getAttribute("status") %>"/>

<h2>Authentication</h2>
<div class="container" id="container">
	<div class="form-container sign-up-container">
		<form method="post" action="register" name="formReg" onsubmit="validateform()">
			<h1>Create Account</h1>
			<input type="text" name="name" placeholder="Name" required/>
			<input type="email" name="email" placeholder="Email" required/>
			<input type="password" name="pass" placeholder="Password" required/>
			<input type="tel" name="mobile" placeholder="Mobile"required/>
			<button>Sign Up</button>
		</form>
	</div>
	<div class="form-container sign-in-container">
		<form method="post" action="login">
			<h1>Sign in</h1>
			<input type="email" name="email" placeholder="Email" />
			<input type="password" name="pass" placeholder="Password" />
			<a href="#">Forgot your password?</a>
			<button>Sign In</button>
		</form>
	</div>
	<div class="overlay-container">
		<div class="overlay">
			<div class="overlay-panel overlay-left">
				<h1>Welcome Back!</h1>
				<p>To keep connected with us please login with your personal info</p>
				<button class="ghost" id="signIn">Sign In</button>
			</div>
			<div class="overlay-panel overlay-right">
				<h1>Hello, Friend!</h1>
				<p>Enter your personal details and start journey with us</p>
				<button class="ghost" id="signUp">Sign Up</button>
			</div>
		</div>
	</div>
</div>


<script type="text/javascript" src="JS/main.js"></script>
<script type="text/javascript" src="JS/validation.js"></script>
<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<script type="text/javascript">
	var status = document.getElementById("status").value;
	if(status == "success"){
		Swal.fire(
				  'Congratualations',
				  'Account Created Successfully!',
				  'success'
				);
	} 
	if(status == "failed"){
		Swal.fire(
				  'Try Again',
				  'Wrong email or password!',
				  'failed'
				);
	}
</script>


</body>
</html>