package profile.controller;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import profile.beans.Building;
import profile.beans.Employee;

@Configuration
public class BeanConfiguration {
	@Bean
	public Employee employee () {
		Employee bean = new Employee("Michael Jordan");
		//bean.setName("Nick Michaud");
		bean.setJobTitle("Application Developer");
		LocalDate hiredDate = LocalDate.parse("2021-05-15");
		bean.setHiredDate(hiredDate);
		return bean;
	}
	@Bean
	public Building building () {
		Building bean = new Building ("x-5432", "Des Moines", "Iowa");
		return bean;
	}
}
