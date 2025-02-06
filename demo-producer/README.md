# Run kafka server with Zookeeper

## Table of Contents
1. [Introduction](#introduction)
2. [Prerequisites](#prerequisites)
3. [Installing Docker](#installing-docker)
4. [Run Kafka Using Docker Compose](#run-kafka-using-docker-compose)

## Introduction
This guide provides instructions on how to run Docker containers and manage them using Docker Compose.

## Prerequisites
- A machine with Docker installed.
- Basic knowledge of command line usage.

## Installing Docker
Follow the official Docker installation guide for your operating system:
- [Docker Installation Guide](https://docs.docker.com/get-docker/)

## Run Kafka Using Docker Compose
Here are commands to get you started up Kafka with Docker Compose:

- **Before running this command, you must ensure that you are in the demo-producer folder**
  ```bash
  docker-compose -f kafka-docker-compose.yml -p kafka up -d
  ```
