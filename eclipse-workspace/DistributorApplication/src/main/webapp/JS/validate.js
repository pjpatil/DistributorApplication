function validateVendor() {
	var vendName = document.getElementById("txtVend").value;
	let regExp = /^[a-zA-Z]+$/;
	let result = regExp.test(vendName);
	if (result == false) {
		let span = document.getElementById("msg");
		msg.innerHTML = "Invalid Vendor name";
		let button = document.getElementById("btn");
		button.disabled = true;
		return false;
	}
	else {
		let span = document.getElementById("msg");
		msg.innerHTML = "";
		let button = document.getElementById("btn");
		button.disabled = false;
		return true;
	}

}
