# Build the docker image and load it in kind k8s cluster

### Generate the jar 
```
./mvnw install
```
### Build the image
```
./mvnw spring-boot:build-image
```
### Run locally with docker
```
docker run -p 8080:8080 demo:0.0.1-SNAPSHOT
```
### Run some sample requests
```
curl localhost:8080/actuator/health
curl localhost:8080/greetings
```

### Load local image in kind to make it available in kind kubernetes cluster
```
kind load docker-image demo:0.0.1-SNAPSHOT
```