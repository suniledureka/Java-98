class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Praveen";
		sal = 5000;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}
}


class ObjectTest{
	public static void main(String[] args) 
	{
		//-- create an instance/object of Employee type
		Employee emp = new Employee();

		//-- access the state of an object using reference
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		//-- access the state of an object using reference and method
		emp.getDetails();

		//-- change the state of object using reference
		emp.empno = 101;
		emp.name = "Sajay Patil";
		emp.sal = 2500;

		emp.getDetails();

		//-- change the state of object using reference and method
		emp.setDetails();
		emp.getDetails();
	}
}
