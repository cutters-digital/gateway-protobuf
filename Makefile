compile_go:
	@echo "---{START: compile_go}---"
	docker build -f golang.Dockerfile -t protoc-golang .
	docker create --name temp-go protoc-golang
	docker cp temp-go:/output/golang/ .
	docker rm -f temp-go
	go mod tidy
	@echo "---{END: compile_go}---"

compile_swift:
	@echo "compile_swift: Not yet implemented."

compile_android:
	@echo "compile_android: Not yet implemented."

compile_all:
	@echo "---{END: compile_all}---"

.PHONY: all
.SILENT: all