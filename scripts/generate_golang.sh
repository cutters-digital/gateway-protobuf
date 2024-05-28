#!/bin/sh
# This script is supposed to be copied into a Dockerfile, not run directly.
protoc \
  --go_out=. --go_opt=module=github.com/cutters-digital/gateway-protobuf \
  --go-grpc_out=. --go-grpc_opt=module=github.com/cutters-digital/gateway-protobuf \
  ./proto/**/*.proto

mkdir descriptor

protoc \
  --proto_path=. \
  --include_imports \
  --include_source_info \
  --descriptor_set_out=descriptor/endpoints.pb \
  ./proto/**/*.proto