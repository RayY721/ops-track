package com.opstrack.backend.asset;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/assets")
public class AssetController {
    private final List<Asset> assets = new ArrayList<>();
    private long nextId = 1;

    @GetMapping
    public List<Asset> getAssets() {
        return assets;
    }

    @PostMapping
    public Asset createAsset(@RequestBody Asset asset) {
        asset.setId(nextId++);
        assets.add(asset);
        return asset;
    }
}