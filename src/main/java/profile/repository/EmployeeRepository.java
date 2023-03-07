package profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import profile.beans.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
