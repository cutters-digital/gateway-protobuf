#!/bin/sh
# This script is supposed to be copied into a Dockerfile, not run directly.
mkdir -p java/java
mkdir -p java/grpc
protoc ./proto/**/*.proto \
  --plugin=protoc-gen-grpc-java=/protoc-gen-grpc-java \
  --java_out=./java/java \
  --grpc-java_out=./java/grpc