package capgemini.emp_asset.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="assetRequest1")
public class AssetRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2919447557016200718L;

	@Id
	private Integer assetReqId;
	
	@OneToMany
	private Set<Asset> assets;

	//@Column(name="requestDate")
	private LocalDate reqDate;
	
	@ManyToOne
	//@JoinColumn(name="empId")
	private Employee employee;

	//@OneToOne
	//private AssetAllocation assetAllocation;
	
	//Constructors
	
	public AssetRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssetRequest(Integer assetReqId, Set<Asset> assets, LocalDate reqDate, Employee employee) {
		super();
		this.assetReqId = assetReqId;
		this.assets = assets;
		this.reqDate = reqDate;
		this.employee = employee;
	}

	//Getters and Setters
	
	public Integer getAssetReqId() {
		return assetReqId;
	}

	public void setAssetReqId(Integer assetReqId) {
		this.assetReqId = assetReqId;
	}

	public Set<Asset> getAssets() {
		return assets;
	}

	public void setAssets(Set<Asset> assets) {
		this.assets = assets;
	}

	public LocalDate getDate() {
		return reqDate;
	}

	public void setDate(LocalDate reqDate) {
		this.reqDate = reqDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@Override
	public String toString() {
		return "AssetRequest [id=" + assetReqId + ", assets=" + assets + ", Request date=" + reqDate + ", employee=" + employee + "]";
	}
	
}
