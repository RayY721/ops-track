# asset-incident-platform

## Project Name

OpsTrack — Operational Incident & Asset Management Platform

## Core Target

A web-based platform for tracking assets, incidents, spare parts, and maintenance handovers in large-scale automation operations.

## Project Overview

OpsTrack is an operational incident and asset management platform designed for large-scale automation environments.

## Problem Statement

The project originated from real operational challenges observed in warehouse automation systems, where fragmented information, maintenance handovers, and scaling operational complexity created bottlenecks in troubleshooting and system operational visibility. (Repeated toubleshooting)

## Background story

The company I am working for is a fast-growing inter-logistic automation system provider. It use robot and server to bring the goods from storage to human operator. It grew fast in past 5 years, from project with less than 10 robot to more than 800 robots. Such an increase in short time rise challenge in both delivery and daily operation. It is easy to track history inforamtion for a project even within a group chat in MS Team. In the worst case, on-site personnel only need to search the keyword in the group chat to find relevent inforamtion, fragement inforamtion is relatively easy to handle. When system scale goes up to around 100 robots, things are getting more difficult but still managable. However, when the first really large scale project with 800 robots are delivered, on-site management is falling apart. Therefore, a handy operation tracking system is necessary for on-site personnel to stay sync and the operation to stay manageable. 

## MVP Scope

Core features:
- Asset management
- Incident tracking
- Spare parts tracking
- Maintenance logs

## Core Workflow

Asset >> Incident >> Maintenance Log >> Spare Part Usage

## Planned Architecture

Frontend: React
Backend: Spring Boot
Database: PostgreSQL
Deployment: Docker later

## Documentation

- [Entity Relationship](docs/entity-relationship.md)
- [Workflow Rules](docs/workflow-rules.md)
- API Design: coming soon

## Learning Goals

This project is also intended as a learning project for:
- backend engineering
- REST API design
- relational database modeling
- scalable system architecture
- frontend/backend integration

## History
Current version implemented the CRUD for asset. Basic http exceoption response is implemented. PostgreSQL is launched with docker. For the backend code, it has Asset, AssetController, AssetService and AssetRepository. Next step is add DTO, Data Transfer Object. 