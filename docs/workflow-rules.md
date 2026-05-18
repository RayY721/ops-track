# Workflow Rules

## 1. Asset Status

Assets can have the following statuses:

- ONLINE: the asset is available for production
- MAINTENANCE: the asset has been removed from production and is waiting for investigation or repair
- UNKNOWN: the asset status is not confirmed

## 2. Incident Severity

Incidents can have the following severity levels:

- LOW: minor issue, does not affect production
- MEDIUM: issue requires attention but asset may continue operating
- CRITICAL: severe issue requiring immediate removal from production

## 3. Incident Status

Incidents can have the following statuses:

- OPEN: the issue has been reported
- IN_PROGRESS: investigation or repair is ongoing
- BLOCKED: progress is blocked, for example due to missing spare parts or external support
- RESOLVED: the technical issue has been fixed
- CLOSED: the issue has been verified and closed

## 4. Automatic Asset Status Update

If a CRITICAL incident is created for an ONLINE asset, the asset status should automatically change to MAINTENANCE&REPAIR.

If all incidents linked to an asset are CLOSED, the asset status should automatically return to ONLINE.

If an asset still has at least one OPEN, IN_PROGRESS, or BLOCKED incident, the asset should not automatically return to ONLINE.

## 5. Maintenance Handover Rule

Every maintenance action should be recorded as a MaintenanceLog.

A MaintenanceLog should include:
- the incident it belongs to
- the person who performed the action
- what was checked or repaired
- the result of the action
- whether any spare parts were used

## 6. Spare Part Usage Rule

If a maintenance action uses a spare part, the system should create a SparePartUsage record.

The SparePartUsage record should include:
- the maintenance log
- the spare part
- the quantity used

In a later version, the spare part inventory quantity should be automatically reduced when a spare part is used.

## 7. Non-Online Asset View

When users filter assets by non-online status, the system should show:
- asset information
- current status
- open or blocked incidents linked to the asset
- latest maintenance log if available