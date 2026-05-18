## Asset

id
assetCode
type
status
ipAddress
location
createdAt
updatedAt

## Incident

id
assetId
title
description
severity
status
createdAt
updatedAt

## MaintenanceLog

id
incidentId
author
action
result
createdAt

## SparePart

id
partNumber
name
quantity
location
minimumThreshold

## SparePartUsage

id
maintenanceLogId
sparePartId
quantityUsed