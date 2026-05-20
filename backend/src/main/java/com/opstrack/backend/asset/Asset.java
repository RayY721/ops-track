package com.opstrack.backend.asset;

public class Asset {
    private Long id;
    private String assetCode;
    private String type;
    private String status;
    private String ipAddress;
    private String location;

    public Asset() {
    }

    public Asset(Long id, String assetCode, String type, String status, String ipAddress, String location) {
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
