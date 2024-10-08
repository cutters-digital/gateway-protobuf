FROM --platform=linux/amd64 swift:5.10

WORKDIR /
COPY scripts/swift/prepare_swift.sh .
RUN sh prepare_swift.sh

WORKDIR /output
COPY ./proto/ ./proto/
COPY scripts/swift/generate_swift.sh .
RUN sh generate_swift.sh