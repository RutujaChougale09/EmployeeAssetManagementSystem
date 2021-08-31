package capgemini.emp_asset.entity;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="assetAllocation1")
public class AssetAllocation {
	
	@Id
	private Integer assetAllocationId;
	
	@OneToOne
	private AssetRequest assetReq;
	
	private LocalDate allocationDate;

	//Constructors
	
	public AssetAllocation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssetAllocation(Integer assetAllocationId, AssetRequest assetReq, LocalDate allocationDate) {
		super();
		this.assetAllocationId = assetAllocationId;
		this.assetReq = assetReq;
		this.allocationDate = allocationDate;
	}

	//Getters and Setters
	
	public Integer getassetAllocationId() {
		return assetAllocationId;
	}

	public void setAssetAllocationId(Integer assetAllocationId) {
		this.assetAllocationId = assetAllocationId;
	}

	public AssetRequest getAssetReq() {
		return assetReq;
	}

	public void setAssetReq(AssetRequest assetReq) {
		this.assetReq = assetReq;
	}

	public LocalDate getDate() {
		return allocationDate;
	}

	public void setDate(LocalDate allocationDate) {
		this.allocationDate = allocationDate;
	}
	
	@Override
	public String toString() {
		return "AssetAllocation [id=" + assetAllocationId + ", assetReq=" + assetReq + ", Request date=" + allocationDate + "]";
	}

	 
	
}
