FROM golang:alpine

WORKDIR /
COPY scripts/golang/prepare_golang.sh .
RUN sh prepare_golang.sh

WORKDIR /output
COPY ./proto/ ./proto/
COPY go.mod .
COPY scripts/golang/generate_golang.sh .
COPY scripts/golang/generate_descriptor.sh .
RUN sh generate_golang.sh
RUN sh generate_descriptor.sh