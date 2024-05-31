# gateway-protobuf

This repository is the 'Single Source of Truth' for the gRPC / Protocol Buffers (protobuf) and their compiled files.

### Used by: 
- [Android App](https://github.com/shortcut/cutters-app-android)
- [iOS App](https://github.com/shortcut/cutters-ios)
- [API Gateway](https://github.com/cutters-digital/cutters-backend-gateway)

### Requirements:
- [Make](https://www.gnu.org/software/make/)
- [Docker](https://docs.docker.com/desktop/)

### Development:
1. Go to the proto directory at the project root.
2. Work on the proto files. (Remember `option go_package`) 
3. Run `make compile_all` in your terminal when done. (Needs to be run from the project root).

### Deployment:
1. Push commits or merge branches onto origin/main.
2. Create a [semver](https://semver.org/) tag [here](https://github.com/cutters-digital/gateway-protobuf/releases/new).

### Importing:
How to import the compiled files to your project.
- #### Golang:
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla congue massa vel justo dapibus viverra. 
        Cras ut turpis mauris. Vestibulum condimentum enim et eros finibus rutrum.

- #### iOS:
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla congue massa vel justo dapibus viverra. 
        Cras ut turpis mauris. Vestibulum condimentum enim et eros finibus rutrum.

- #### Android:
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla congue massa vel justo dapibus viverra. 
        Cras ut turpis mauris. Vestibulum condimentum enim et eros finibus rutrum.