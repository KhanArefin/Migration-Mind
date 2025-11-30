# Migration-Mind

First Install nodejs and java version 17+

second download apache maven
https://maven.apache.org/download.cgi

extract the zip and copy the apache-maven-3.9.11 paste in program files

apache-maven-3.9.11/bin copy path and paste in env

add system var_name MAVEN_HOME = path of the main folder not bin

check version from terminal mve -version
if shows version all good


download the git repo

go to the folder in vscode 
open two terminal 
in one run 
cd frontend
npm install
npm run dev

in another 
cd backend
mvn clean package -DskipTests
mvn spring-boot:run
