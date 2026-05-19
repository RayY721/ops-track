# Entity Relationship

## Core Entities

### Asset
Represents a physical device in the operation site, such as a robot, workstation, charger, or network device.

### Incident
Represents an abnormal event, failure, or issue linked to an asset.

### MaintenanceLog
Represents one investigation, toubleshooting, repair attempt, or handover note related to an incident.

### SparePart
Represents a type of spare part.

### SparePartUsage
Represents the usage of a spare part during a maintenance action.

## Relationships

```text
Asset 1 --- N Incident
Incident 1 --- N MaintenanceLog
MaintenanceLog 1 --- N SparePartUsage
SparePart 1 --- N SparePartUsage

One spare part type can be used in multiple maintenance logs.
One maintenance log can use multiple spare parts.