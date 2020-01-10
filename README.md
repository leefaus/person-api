# Person API

## Dependencies
- Java Runtime
- Maven 
  - **MAC** - `brew install maven`
- Docker Hub ID - _DID_

## Build Locally
`git clone https://github.com/leefaus/person-api`

`cd person-api`

`mvn package`

`docker build -t {DID}/person-api .`

`cd target`

`docker run -e JARFILE=person-0.0.1-SNAPSHOT.jar -it {DID}/person-api`

`docker login --username={DID} --email=youremail@company.com`

`docker push {DID}/person-api`