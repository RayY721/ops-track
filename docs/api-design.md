# API Design

## Asset APIs

### GET /assets
Get all assets.

### GET /assets/{id}
Get asset details.

### POST /assets
Create a new asset.

### PATCH /assets/{id}
Update asset status or information.

---

## Incident APIs

### GET /incidents
Get all incidents.

### GET /incidents/{id}
Get incident details.

### POST /incidents
Create a new incident linked to an asset.

### PATCH /incidents/{id}
Update incident status or information.

---

## Maintenance Log APIs

### GET /incidents/{id}/logs
Get maintenance logs for an incident.

### POST /incidents/{id}/logs
Create a maintenance log.

---

## Spare Part APIs

### GET /spare-parts
Get spare part inventory.

### POST /spare-parts
Create a spare part.

### PATCH /spare-parts/{id}
Update spare part information.