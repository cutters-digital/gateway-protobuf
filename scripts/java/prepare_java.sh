#!/bin/sh
# This script is supposed to be copied into a Dockerfile, not run directly.
apk --no-cache add curl
apk add libc6-compat

curl -LO https://github.com/protocolbuffers/protobuf/releases/download/v25.1/protoc-25.1-linux-x86_64.zip
unzip protoc-25.1-linux-x86_64.zip -d /usr

curl -LO https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.64.0/protoc-gen-grpc-java-1.64.0-linux-x86_64.exe
mv protoc-gen-grpc-java-1.64.0-linux-x86_64.exe protoc-gen-grpc-java
chmod 777 protoc-gen-grpc-java