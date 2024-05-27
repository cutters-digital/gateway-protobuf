FROM golang:alpine

WORKDIR /
# Up to date as of 27th of May 2024.
RUN apk --no-cache add curl
RUN curl -LO https://github.com/protocolbuffers/protobuf/releases/download/v25.1/protoc-25.1-linux-x86_64.zip
RUN unzip protoc-25.1-linux-x86_64.zip -d /usr
RUN go install google.golang.org/protobuf/cmd/protoc-gen-go@v1.28
RUN go install google.golang.org/grpc/cmd/protoc-gen-go-grpc@v1.2

WORKDIR /output
# Remember to set build context to project root.
COPY ./proto/ ./proto/
COPY scripts/generate_golang.sh .
RUN sh generate_golang.sh