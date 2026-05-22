package com.opstrack.backend.asset;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssetService {
    private final List<Asset> assets = new ArrayList<>();
    private long nextId = 1;

    public List<Asset> getAssets() {
        return assets;
    }

    public Asset createAsset(Asset asset) {
        asset.setId(nextId++);
        assets.add(asset);
        return asset;
    }

    public Asset getAssetById(Long id) {
        for (Asset asset : assets) {
            if (asset.getId().equals(id)) {
                return asset;
            }
        }
        return null;
    }

    public Asset updateAsset(Long id, Asset updatedAsset) {
        for (Asset asset : assets) {
            asset.setAssetCode(updatedAsset.getAssetCode());
            asset.setType(updatedAsset.getType());
            asset.setStatus(updatedAsset.getStatus());
            asset.setIpAddress(updatedAsset.getIpAddress());
            asset.setLocation(updatedAsset.getLocation());
            return asset;
        }
        return null;
    }

}