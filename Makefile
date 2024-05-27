compile_go:
	@echo "Starting compile_go"



compile_swift:
	@echo "compile_swift: Not yet implemented."

compile_android:
	@echo "compile_android: Not yet implemented."

compile_all:
	@echo "Compilation started."
	docker build -t wooden-relevance .
	docker create --name temp wooden-relevance
	docker cp temp:/opus/golang/ .
	docker rm -f temp
	go mod tidy
	@echo "Compilation completed."

.PHONY: all
.SILENT: all