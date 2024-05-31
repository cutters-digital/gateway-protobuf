#!/bin/sh
# This script is supposed to be copied into a Dockerfile, not run directly.
mkdir java
protoc ./proto/**/*.proto \
  --plugin=protoc-gen-grpc-java=/protoc-gen-grpc-java \
  --grpc-java_out=./java