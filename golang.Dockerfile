FROM golang:alpine

WORKDIR /
COPY scripts/golang/prepare_golang.sh .
RUN sh prepare_golang.sh

WORKDIR /output
# Remember to set build context to project root.
COPY ./proto/ ./proto/
COPY scripts/golang/generate_golang.sh .
COPY scripts/golang/generate_descriptor.sh .
RUN sh generate_golang.sh
RUN sh generate_descriptor.sh