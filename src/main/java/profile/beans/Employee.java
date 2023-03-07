package profile.beans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String jobTitle;
	private LocalDate hiredDate;
	@Autowired
	private Building building;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee(String name, String jobTitle, LocalDate hiredDate) {
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		this.hiredDate = hiredDate;
	}

	public Employee(long id, String name, String jobTitle, LocalDate hiredDate) {
		super();
		this.id = id;
		this.name = name;
		this.jobTitle = jobTitle;
		this.hiredDate = hiredDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public LocalDate getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(LocalDate hiredDate) {
		this.hiredDate = hiredDate;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", jobTitle=" + jobTitle + ", hiredDate=" + hiredDate
				+ ", building=" + building + "]";
	}

}
