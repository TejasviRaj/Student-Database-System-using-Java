function addStudent()
{
	alert("start");
	var student_Name = document.getElementById("student_Name").value;
	var Grade = document.getElementById("Grade").value;
	var Roll_no = document.getElementById("Roll_no").value;
	var Gender = document.getElementById("Gender").value;
	var Address = document.getElementById("Address").value;

	
	var data = "student_Name="+student_Name+"&Grade="+Grade+"&Roll_no="+Roll_no+"&Gender="+Gender+"&Address="+Address;

	var xhr = new XMLHttpRequest();
	xhr.withCredentials = true;

	xhr.addEventListener("readystatechange", function () {
	  if (this.readyState === this.DONE) {
	    document.getElementById('para').innerHTML=this.responseText;
	  }
	});

	xhr.open("POST", "http://localhost:8080/EADD-maven/GetStudent");
	xhr.setRequestHeader("content-type", "application/x-www-form-urlencoded");

	xhr.send(data);
	alert("end");

return false;
}