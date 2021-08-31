package capgemini.emp_asset.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department1")
public class Department {

	@Id
	@Column(name="dept_Id",nullable=false,unique=true)
	private Integer deptId;
	private String name;
	
	//@OneToMany(mappedBy="department",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	//private Set<Employee> employee;
	
	//Constructors
	

	public Department(Integer deptId, String name) {
		super();
		this.deptId = deptId;
		this.name = name;
		//this.employee = employee;
	}
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Setters/getters
	public Integer getDeptId() {
		return deptId;
	}


	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", name=" + name +  "]";
	}


}
