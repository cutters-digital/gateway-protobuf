FROM --platform=linux/amd64 alpine:latest

WORKDIR /
COPY scripts/java/prepare_java.sh .
RUN sh prepare_java.sh

WORKDIR /output
COPY ./proto/ ./proto/
COPY scripts/java/generate_java.sh .
RUN sh generate_java.sh