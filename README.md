# zaiCodeChallenges

1. install tomcat and postgreSQL on local machine
2. create a DB scheme 'weather' in postgreSQL
3. create a table 'weather' by following script
```sh
CREATE TABLE weather (
	id serial PRIMARY KEY,
	cityName VARCHAR ( 50 ) NOT NULL,
	windSpeed VARCHAR ( 50 ) NOT NULL,
	temperatureDegrees VARCHAR ( 50 ) NOT NULL
);
```
4. build the project by maven
5. deploy the eliotInterview.war file to tomcat
6. calling the service via 
```sh
http://localhost:8080/v1/weather?city=Melbourne
```

# TradeOff items
due to this project is target to complete within 3 hours. therefore, the trade off is following:
- API call error handling, e.g: error message return
- application logging
- Resttemplate detail configureation, e.g: timeout
