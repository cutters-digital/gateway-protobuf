compile_go:
	@echo "---{START: compile_go}---"
	@docker build -f golang.Dockerfile -t protoc-golang .
	@rm -rf golang # Clean up orphaned files.
	@-docker rm -f temp-go # Safeguard against leftover tagged image.
	@docker create --name temp-go protoc-golang
	@docker cp temp-go:/output/golang/ .
	@docker cp temp-go:/output/descriptor/ .
	@docker rm -f temp-go
	@go mod tidy
	@echo "---{END: compile_go}---"

compile_swift:
	@echo "---{START: compile_swift}---"
	@docker build -f swift.Dockerfile -t protoc-swift .
	@rm -rf swift # Clean up orphaned files.
	@-docker rm -f temp-swift # Safeguard against leftover tagged image.
	@docker create --name temp-swift protoc-swift
	@docker cp temp-swift:/output/generated/swift .
	@docker rm -f temp-swift
	@echo "---{END: compile_swift}---"

compile_android:
	@echo "---{START: compile_android}---"

compile_all: compile_go compile_swift
	@echo "---{END: compile_all}---"

.PHONY: all
.SILENT: all