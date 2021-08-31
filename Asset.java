package capgemini.emp_asset.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="asset1")
public class Asset {

	@Id
	//@Column(name="asset_Id",nullable=false,unique=true)
	private Integer assetId;
	private String type;
	private String description;
	
	

	public Asset(Integer assetId, String type, String description) {
		super();
		this.assetId = assetId;
		this.type = type;
		this.description = description;
		
	}

	public Asset() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getAssetId() {
		return assetId;
	}

	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "Asset [assetId=" + assetId + ", type=" + type + ", description=" + description + "]";
	}
	
	
	
}
