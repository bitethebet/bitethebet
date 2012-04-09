Welcome to BITE THE BET project.

Running instruction:
mvn clean install
mvn gae:run 

-jrebel-
set REBEL_HOME environment variable
Windows: set REBEL_HOME=path to jrebel home directory
Unix: export REBEL_HOME=path to jrebel home directory
mvn gae:run -P jrebel

DEPENDENCIES:
LOGBACK (http://logback.qos.ch/documentation.html)