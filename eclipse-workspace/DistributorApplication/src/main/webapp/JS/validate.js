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

function searchUsingAjax(str){
	let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange=function(){
		if(this.readyState==4 && this.status==200){
			document.getElementById("showGrid").innerHTML=this.responseText;
		}
	};
	xhttp.open("GET","searchVendor?n="+str,true);
	xhttp.send();
}







