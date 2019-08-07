var myObj;

getStudent();

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
	  }
	});

	xhr.open("POST", "http://localhost:8080/EADD-maven/GetStudent");
	xhr.setRequestHeader("content-type", "application/x-www-form-urlencoded");

	xhr.send(data);
	alert("end");

return false;
}

function getStudent()
{
	var data = null;

	var xhr = new XMLHttpRequest();
	xhr.withCredentials = true;

	xhr.addEventListener("readystatechange", function () {
	  if (this.readyState === this.DONE) {
		    myObj = JSON.parse(this.responseText);
		    generateTable();
	  }
	});

	xhr.open("GET", "http://localhost:8080/EADD-maven/GetStudent");

	xhr.send(data);	
}

function generateTable()

{


   var tbody =document.getElementById("table_body");

var child = tbody.lastElementChild;
while (child) {
tbody.removeChild(child);
child = tbody.lastElementChild;
}

for (i = 0; i < myObj.length; i++) {

var row = document.createElement("tr");

var cell = document.createElement("td");

cell.setAttribute("class", "lalign");

var cellText = document.createTextNode(myObj[i]["student_Name"]);

cell.appendChild(cellText);

row.appendChild(cell);

cell = document.createElement("td");

cellText = document.createTextNode(myObj[i]["Grade"]);
cell.appendChild(cellText);

row.appendChild(cell);


cell = document.createElement("td");

cellText = document.createTextNode(myObj[i]["Roll_no"]);
cell.appendChild(cellText);

row.appendChild(cell);


cell = document.createElement("td");

cellText = document.createTextNode(myObj[i]["Gender"]);
cell.appendChild(cellText);

row.appendChild(cell);

cell = document.createElement("td");

cellText = document.createTextNode(myObj[i]["Address"]);
cell.appendChild(cellText);

row.appendChild(cell);



tbody.appendChild(row);
}



    document.getElementById('para').innerHTML=myObj[0]["student_Name"];

}
