package profile;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import profile.beans.Building;
import profile.beans.Employee;
import profile.controller.BeanConfiguration;
import profile.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeProfileApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProfileApplication.class, args);
		
		 ApplicationContext appContext = new
		 AnnotationConfigApplicationContext(BeanConfiguration.class);
		 Employee e = appContext.getBean("employee", Employee.class);
		 System.out.println(e.toString());
		
	}
	@Autowired
	EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Employee e = appContext.getBean("employee", Employee.class);
		repo.save(e);
		
		LocalDate hiredDate = LocalDate.parse("2022-12-01");
		Employee emp = new Employee("Nicholas Michaud", "Software Engineer", hiredDate);
		Building build = new Building ("x-1234", "West Des Moines", "Iowa");
		emp.setBuilding(build);
		repo.save(emp);
		
		List<Employee> allMyEmployees = repo.findAll();
		for(Employee people: allMyEmployees) {
			System.out.println(people.toString());
	}
		((AbstractApplicationContext) appContext).close();
	
	}
}
