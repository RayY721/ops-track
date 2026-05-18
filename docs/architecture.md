# Architecture

## Overview

OpsTrack uses a simple three-layer architecture:

```md
React Frontend
      ↓
Spring Boot REST API
      ↓
PostgreSQL Database
```
The frontend is responsible for user interaction.
The backend is responsible for business logic and API handling.
The database is responsible for storing operational data.

## Frontend

The frontend will be built with React.

Responsibilities:

- Display assets, incidents, maintenance logs, and spare parts
- Allow users to create and update incidents
- Allow users to add maintenance logs
- Show non-online assets and their open incidents

## Backend

The backend will expose REST APIs for the frontend.

Responsibilities:

- Receive requests from the frontend
- Validate input data
- Apply workflow rules
- Read and write data from the database
- Return structured responses to the frontend

## Database

The database will use PostgreSQL.

Responsibilities:

- Store assets
- Store incidents
- Store maintenance logs
- Store spare parts
- Store spare part usage records
- Preserve relationships between entities

## Data Flow Example

When a user creates a critical incident:

- The user submits the incident from the frontend.
- The frontend sends a request to the backend.
- The backend creates the incident.
- The backend applies the workflow rule and updates the asset status to MAINTENANCE.
- The backend stores the changes in the database.
- The frontend receives the updated result and displays it to the user.

## Current Scope

The first implementation will focus on the backend and database.

The frontend will be added after the core backend APIs are working.