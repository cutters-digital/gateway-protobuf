#FROM swift
FROM --platform=linux/amd64 swift

WORKDIR /
COPY scripts/swift/prepare_swift.sh .
RUN sh prepare_swift.sh

WORKDIR /output
# Remember to set build context to project root.
COPY ./proto/ ./proto/
COPY scripts/swift/generate_swift.sh .
RUN sh generate_swift.sh