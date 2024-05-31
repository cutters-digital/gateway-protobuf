#!/bin/sh
# This script is supposed to be copied into a Dockerfile, not run directly.
protoc \
  --go_out=. --go_opt=module=github.com/cutters-digital/gateway-protobuf \
  --go-grpc_out=. --go-grpc_opt=module=github.com/cutters-digital/gateway-protobuf \
  ./proto/**/*.proto

go mod tidy