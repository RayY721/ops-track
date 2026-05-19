# Architecture

## Overview

OpsTrack uses a simple three-layer client-server architecture:

The frontend is responsible for user interaction.
The backend is responsible for business logic and API handling.
The database is responsible for storing operational data.

---

## Frontend

Technology:
- React

Responsibilities:
- Display assets and incidents
- Create and update incidents
- Show maintenance logs
- Display operational status

---

## Backend

Technology:
- Spring Boot

Responsibilities:
- REST API handling
- Business logic
- Workflow rule execution
- Database access
- Operational state management

---

## Database

Technology:
- PostgreSQL

Responsibilities:
- Store assets
- Store incidents
- Store maintenance logs
- Store spare part inventory
- Maintain entity relationships

---

## Data Flow Example

When a user creates a critical incident:

- The user submits the incident from the frontend.
- The frontend sends a request to the backend.
- The backend creates the incident.
- The backend applies the workflow rule and updates the asset status to MAINTENANCE.
- The backend stores the changes in the database.
- The frontend receives the updated result and displays it to the user.

---

## Current Scope

The first implementation will focus on the backend and database.
The frontend will be added after the core backend APIs are working.

---

## Planned Deployment

Frontend
↓
Backend API
↓
PostgreSQL Database

Docker deployment may be added in future versions.