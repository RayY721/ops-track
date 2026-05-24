package com.opstrack.backend.asset;

import org.springframework.stereotype.Service;

import com.opstrack.backend.exception.AssetNotFoundException;

// import java.util.ArrayList;
import java.util.List;

@Service
public class AssetService {
    // private final List<Asset> assets = new ArrayList<>();
    // private long nextId = 1;
	private final AssetRepository assetRepository;

	public AssetService(AssetRepository assetRepository) {
		this.assetRepository = assetRepository;
	}

	public List<Asset> getAllAssets() {
		return assetRepository.findAll();
	}

    public Asset createAsset(Asset asset) {
        // asset.setId(nextId++);
        // assets.add(asset);
        // return asset;
		return assetRepository.save(asset);
    }

	public Asset getAssetById(Long id) {
		// for (Asset asset : assets) {
		//     if (asset.getId().equals(id)) {
		//         return asset;
		//     }
		// }
		// return null;
		// return assetRepository.findById(id).orElse(null);
		return assetRepository.findById(id).orElseThrow(() -> new AssetNotFoundException(id));
	}

	public Asset updateAsset(Long id, Asset updatedAsset) {
		// for (Asset asset : assets) {
		//     asset.setAssetCode(updatedAsset.getAssetCode());
		//     asset.setType(updatedAsset.getType());
		//     asset.setStatus(updatedAsset.getStatus());
		//     asset.setIpAddress(updatedAsset.getIpAddress());
		//     asset.setLocation(updatedAsset.getLocation());
		//     return asset;
		// }
		// return null;
		Asset asset = assetRepository.findById(id)
				.orElseThrow(() -> new AssetNotFoundException(id));

		asset.setAssetCode(updatedAsset.getAssetCode());
		asset.setType(updatedAsset.getType());
		asset.setStatus(updatedAsset.getStatus());
		asset.setIpAddress(updatedAsset.getIpAddress());
		asset.setLocation(updatedAsset.getLocation());

		return assetRepository.save(asset);
	}


}
