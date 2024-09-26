#!/bin/sh
# This script is supposed to be copied into a Dockerfile, not run directly.
#apt-get update && apt-get install git && apt-get install curl
apt-get update && apt-get install curl

protocVersion=28.2
curl -LO https://github.com/protocolbuffers/protobuf/releases/download/v${protocVersion}/protoc-${protocVersion}-linux-x86_64.zip
unzip protoc-${protocVersion}-linux-x86_64.zip -d /usr

swiftPluginVersion=1.23.1
curl -LO https://github.com/grpc/grpc-swift/releases/download/${swiftPluginVersion}/protoc-grpc-swift-plugins-linux-x86_64-${swiftPluginVersion}.zip
unzip protoc-grpc-swift-plugins-linux-x86_64-${swiftPluginVersion}.zip -d /usr/bin

# https://github.com/grpc/grpc-swift/issues/1171#issuecomment-1837830326
echo '/usr/lib/swift/linux' > /etc/ld.so.conf.d/swift.conf
ldconfig /usr/local/lib