function validateform(){
	var firstName = document.formReg.firstname.value;
	if(firstName == "" || firstName.length<2 || !isAlpha(firstName)){
		alert("Please provide your correct first name");
	}

	var lastName = document.formReg.lastname.value;
	if(lastName == "" || lastName.length<2 || !isAlpha(lastName)){
		alert("Please provide your correct last name");
	}

	var dob = document.formReg.DOB.value;
	if(dob == ""){
		alert("Please provide your correct DOB");
	}

	var address = document.getElementById("address").value;
	if(address == "" || address.length<5){
		alert("Please provide your correct address");
	}

	var phone = document.formReg.phone.value;
	if(phone == "" || phone.length<10 || !isNum(phone)){
		alert("Please provide your correct phone number");
	}

	var sport = document.formReg.sports.value;
	console.log(sport);
	if(sports == "" || !isSport(sport)){
		alert("Please select correct sports");
	}

	var email = document.formReg.email.value;
	if(email == "" || !isemail(email)){
		alert("Please enter correct email");
	}

	var password = document.formReg.password.value;
	if(password == ""){
		alert("Please provide password");
	}
	else if(password.length<8){
		alert("password should be of minimum 8 characters");
	}
	else if(!checkPassword(password)){
		alert("password must include special character,digit and capital letter");
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

function isSport(sport){
	if(sport == "Cricket" || sport == "Football" || sport == "Volleyball" || sport == "Chess" || sport == "Carrom"){
		return true;
	}
	return false;
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

