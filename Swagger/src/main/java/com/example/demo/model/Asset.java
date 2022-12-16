package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "asset_info")

public class Asset {
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name ="AssetType" )
	private String AssetType;
	@Column(name ="Brand" )
	private String Brand ;
	@Column(name ="ModelName" )
	private String ModelName;
	@Column(name ="SerialNumber" )
	private String SerialNumber;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAssetType() {
		return AssetType;
	}
	public void setAssetType(String assetType) {
		AssetType = assetType;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModelName() {
		return ModelName;
	}
	public void setModelName(String modelName) {
		ModelName = modelName;
	}
	public String getSerialNumber() {
		return SerialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}
	@Override
	public String toString() {
		return "AssestManage [id=" + id + ", AssetType=" + AssetType + ", Brand=" + Brand + ", ModelName=" + ModelName
				+ ", SerialNumber=" + SerialNumber + "]";
	}

	
	
}
