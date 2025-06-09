package in.abc.comp;

import java.util.List;

import in.abc.dto.Employee;

public interface IEmployeeDAO {
	
	public List<Employee> findAllEmployees() throws Exception;

}
