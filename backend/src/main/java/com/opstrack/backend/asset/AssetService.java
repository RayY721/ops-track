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
}