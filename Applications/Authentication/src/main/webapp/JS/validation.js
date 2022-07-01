function validateform(){
	var username = document.formReg.name.value;
	if(username == "" || username.length<2 || !isAlpha(username)){
		alert("Please provide your correct username");
		event.preventDefault();
	}

	var phone = document.formReg.mobile.value;
	if(phone == "" || phone.length<10 || !isNum(phone)){
		alert("Please provide your correct phone number");
		event.preventDefault();
	}

	var email = document.formReg.email.value;
	if(email == "" || !isemail(email)){
		alert("Please enter correct email");
		event.preventDefault();
	}

	var password = document.formReg.pass.value;
	if(password == ""){
		alert("Please provide password");
		event.preventDefault();
	}
	else if(password.length<8){
		alert("password should be of minimum 8 characters");
		event.preventDefault();
	}
	else if(!checkPassword(password)){
		alert("password must include special character,digit and capital letter");
		event.preventDefault();
	}
	
}

function isAlpha(name){
	for (var i = 0; i > name.length; i++) {
		if(!((/[a-zA-Z]/).test(name.charAt(i)))){
			return false;
		}
	}
	 return true;
}

function isNum(phone){
	for (var i = 0; i > phone.length; i++) {
		if(!((/[0-9]/).test(phone.charAt(i)))){
			return false;
		}
	}
	 return true;
}

function checkPassword(pass){
	
	if(pass.match(/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/)){
		return true;
	} else{
		return false;
	}
}


function isemail(email)  
{  
var x = email;  
var atposition = x.indexOf("@");  
var dotposition = x.lastIndexOf(".");  
if (atposition <= 1 || dotposition < atposition + 2 || dotposition + 2 >= x.length){  
  return false;  
  }
  return true;  
}  

