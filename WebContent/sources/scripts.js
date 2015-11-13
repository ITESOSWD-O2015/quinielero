function validateLogin() {
	var username = document.forms['username'].value;
	var password = document.forms['password'].value;
	if (username == null || username == "") {
		alert("Please fill username field");
		document.forms['username'].focus();
		return false;
	} else if (password == null || password == "") {
		alert("Please enter your password");
		document.forms['password'].focus();
		return false;
	} else {
		return true;
	}
}