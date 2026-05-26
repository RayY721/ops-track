package com.opstrack.backend.asset;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.opstrack.backend.asset.dto.AssetCreateRequest;
import com.opstrack.backend.asset.dto.AssetResponse;

//import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;

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
	public List<AssetResponse> getAllAssets() {
		return assetService.getAllAssets();
	}

    @PostMapping
    public ResponseEntity<AssetResponse> createAsset(@Valid @RequestBody AssetCreateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(assetService.createAsset(request));
    }

    @GetMapping("/{id}")
    public AssetResponse getAssetById(@PathVariable Long id) {
        return assetService.getAssetById(id);
    }

    @PatchMapping("/{id}")
    public AssetResponse updateAsset(@PathVariable Long id, @RequestBody Asset asset) {
        return assetService.updateAsset(id, asset);
    }

}