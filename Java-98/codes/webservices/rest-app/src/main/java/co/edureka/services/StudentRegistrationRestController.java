package co.edureka.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import co.edureka.services.model.Student;

@Path("/edureka")
public class StudentRegistrationRestController {
	@POST
	@Produces("application/json")
	@Path("/register")
	public Student registerNewStudent(@FormParam("name_field") String name, @FormParam("age_field") Integer age, 
			@FormParam("addr_field") String address) {
		
		//logic to save Student to data store
		Student st = new Student();
		
		st.setStudentName(name);
		st.setStudentAddress(address);
		st.setStudentAge(age);
		
		return st;
	}
}
