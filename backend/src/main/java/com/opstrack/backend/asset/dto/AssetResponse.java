package com.opstrack.backend.asset.dto;

public class AssetResponse {
	private Long id;
	private String assetCode;
	private String type;
	private String status;
	private String ipAddress;
	private String location;

	public AssetResponse(Long id, String assetCode, String type, String status, String ipAddress, String location) {
		this.id = id;
		this.assetCode = assetCode;
		this.type = type;
		this.status = status;
		this.ipAddress = ipAddress;
		this.location = location;
	}

	public Long getId() {
		return id;
	}

	public String getAssetCode() {
		return assetCode;
	}

	public String getType() {
		return type;
	}

	public String getStatus() {
		return status;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public String getLocation() {
		return location;
	}
	
}