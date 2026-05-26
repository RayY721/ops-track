package com.opstrack.backend.asset;

import org.springframework.stereotype.Service;

import com.opstrack.backend.asset.dto.AssetCreateRequest;
import com.opstrack.backend.asset.dto.AssetResponse;
import com.opstrack.backend.exception.AssetNotFoundException;

// import java.util.ArrayList;
import java.util.List;

@Service
public class AssetService {
    // private final List<Asset> assets = new ArrayList<>();
    // private long nextId = 1;
	private final AssetRepository assetRepository;

	private AssetResponse toResponse(Asset asset) {
		return new AssetResponse(
				asset.getId(),
				asset.getAssetCode(),
				asset.getType(),
				asset.getStatus(),
				asset.getIpAddress(),
				asset.getLocation()
			);
	}

	public AssetService(AssetRepository assetRepository) {
		this.assetRepository = assetRepository;
	}

	public List<AssetResponse> getAllAssets() {
		return assetRepository.findAll().stream()
				.map(this::toResponse).toList();
	}

    public AssetResponse createAsset(AssetCreateRequest request) {
		Asset asset = new Asset();

		asset.setAssetCode(request.getAssetCode());
		asset.setType(request.getType());
		asset.setStatus(request.getStatus());
		asset.setIpAddress(request.getIpAddress());
		asset.setLocation(request.getLocation());

		Asset savedAsset = assetRepository.save(asset);
		return toResponse(savedAsset);
    }

	public AssetResponse getAssetById(Long id) {
		return toResponse(assetRepository.findById(id).orElseThrow(() -> new AssetNotFoundException(id)));
	}

	public AssetResponse updateAsset(Long id, Asset updatedAsset) {

		Asset asset = assetRepository.findById(id)
				.orElseThrow(() -> new AssetNotFoundException(id));

		asset.setAssetCode(updatedAsset.getAssetCode());
		asset.setType(updatedAsset.getType());
		asset.setStatus(updatedAsset.getStatus());
		asset.setIpAddress(updatedAsset.getIpAddress());
		asset.setLocation(updatedAsset.getLocation());

		return toResponse(assetRepository.save(asset));
	}

}
