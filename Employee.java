package capgemini.emp_asset.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="employee1")
public class Employee extends User{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8198603919110518657L;

	@NotEmpty(message = "Name is required")
	private String name;
	
	private String designation;
	
	
	@ManyToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private Department department;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, String designation, Department dept) {
		super();
		
		this.name = name;
		this.designation = designation;
		this.department = dept;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Department getDept() {
		return department;
	}

	public void setDept(Department dept) {
		this.department = dept;
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + super.getUserId() + ", name=" + name + ", designation=" + designation + ", department="
				+ department + "]";
	}


	/*@Override
	public String toString() {
		return "Employee [id=" + super.getUserId() +  + ", designation=" + designation + ", dept=" + department + "]";
	}*/

}
