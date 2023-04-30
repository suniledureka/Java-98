var xhr;

function getEmployeeDetails(empno)
{
	xhr = new XMLHttpRequest();
	xhr.open("GET", "search?eno="+empno, true); //true - asynchronous coomunication  
	xhr.onreadystatechange = stateChanged;
	xhr.send();
}

function stateChanged(){
    var name = 'NO MATCH';
	var sal = 'NO MATCH'
	    
 	if(xhr.readyState==4 && xhr.status==200){
 		var responseData = xhr.responseText;
 		
 		if(responseData.length > 0){
 		  var jsonEmp = JSON.parse(responseData); //to convert to a JSON object
 		  
 		  name = jsonEmp.emp_name;
 		  sal = jsonEmp.emp_sal;
 		}
 		document.getElementById("emp_name").innerHTML = name;
 		document.getElementById("emp_sal").innerHTML = sal;
 	}
}