#!/bin/sh
# This script is supposed to be copied into a Dockerfile, not run directly.
mkdir generated

protoc ./proto/**/*.proto \
  --swift_opt=Visibility=Public \
  --swift_out=./generated \
  --grpc-swift_opt=Visibility=Public \
  --grpc-swift_out="Client=true,TestClient=false,Server=false:./generated"

mv generated/proto generated/swift