#!/bin/sh
# This script is supposed to be copied into a Dockerfile, not run directly.
mkdir descriptor
protoc \
  --proto_path=. \
  --include_imports \
  --include_source_info \
  --descriptor_set_out=descriptor/endpoints.pb \
  ./proto/**/*.proto