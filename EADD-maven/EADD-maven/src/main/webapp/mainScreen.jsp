<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<script>
//alert("page load");
</script>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form onsubmit="return addStudent()">
Name <input type="text" id="student_Name" required> <br>
Grade <input type="number" id="Grade" required> <br>
Roll No <input type="number" id="Roll_no" required> <br>


Gender

<select id="Gender">
<option value="Male" name="Male"> Male</option>
<option value="Female" name="Female"> Female </option>

</select>
<br>
Address <input type="text" id="Address" required> <br>
<input type="submit" value="Add student">



</form>

<p id="para"></p>
<br/><br/>
<br/>
<br/>
<br/>

<form action="logout">
<input type="submit" value="logout">

</form>
</body>

<script  src="trp.js"></script>

</html>