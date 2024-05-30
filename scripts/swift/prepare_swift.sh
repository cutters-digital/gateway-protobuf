#!/bin/sh
# This script is supposed to be copied into a Dockerfile, not run directly.
#apt-get update && apt-get install git && apt-get install curl
apt-get update && apt-get install curl

curl -LO https://github.com/protocolbuffers/protobuf/releases/download/v25.1/protoc-25.1-linux-x86_64.zip
unzip protoc-25.1-linux-x86_64.zip -d /usr

curl -LO https://github.com/grpc/grpc-swift/releases/download/1.23.0/protoc-grpc-swift-plugins-linux-x86_64-1.23.0.zip
unzip protoc-grpc-swift-plugins-linux-x86_64-1.23.0.zip -d /usr/bin

# https://github.com/grpc/grpc-swift/issues/1171#issuecomment-1837830326
echo '/usr/lib/swift/linux' > /etc/ld.so.conf.d/swift.conf
ldconfig /usr/local/lib