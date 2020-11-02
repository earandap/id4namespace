## Build and run the service locally

1. Install the OpenJDK 11. You could use this tool https://sdkman.io/install. 

2. Run the application `./gradlew bootRun`

3. Test the API `curl --location --request GET 'http://localhost:8080/api/namespace/{NAMESPACE}/id'`

You can see the exposed API by the service in this URL http://localhost:8080/swagger-ui.html


## Build and run a docker image

1. `./gradlew jibDockerBuild`

