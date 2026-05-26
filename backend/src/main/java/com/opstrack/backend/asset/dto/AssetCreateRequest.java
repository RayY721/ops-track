package com.opstrack.backend.asset.dto;

import jakarta.validation.constraints.NotBlank;

public class AssetCreateRequest {
	@NotBlank
	private String assetCode;
	@NotBlank
	private String type;
	@NotBlank
	private String status;
	private String ipAddress;
	private String location;

	public AssetCreateRequest() {

	}

	public String getAssetCode() {
		return assetCode;
	}

	public void setAssetCode(String assetCode) {
		this.assetCode = assetCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}