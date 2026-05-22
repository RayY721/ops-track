package com.opstrack.backend.asset;

import org.springframework.web.bind.annotation.*;

//import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/assets")
public class AssetController {
//    private final List<Asset> assets = new ArrayList<>();
//    private long nextId = 1;
    private final AssetService assetService;

    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }

    @GetMapping
    public List<Asset> getAssets() {
        return assetService.getAssets();
    }

    @PostMapping
    public Asset createAsset(@RequestBody Asset asset) {
        return assetService.createAsset(asset);
    }

    @GetMapping("/{id}")
    public Asset getAssetById(@PathVariable Long id) {
        return assetService.getAssetById(id);
    }

    @PatchMapping("/{id}")
    public Asset updateAsset(@PathVariable Long id, @RequestBody Asset asset) {
        return assetService.updateAsset(id, asset);
    }
}