simple website for make notes

Set up
creating a container with postgres
docker run --name postgresqq -p 5432:5432 -e POSTGRES_PASSWORD=my_password -e POSTGRES_USER=lme -e POSTGRES_DB=mydb -d postgres
building a project
./gredlew build
start
./gredlew bootrun