# Config Client Service

This is a demo service showing how to retrieve properties from a Spring Cloud Config server.

## Properties

Two properties are read and used. 

1. `greet.name`: Retrieved from the Spring Cloud Config Server 
2. `config-client.magic-number`: Retrieved from the application's own properties file.

## Accessing the Properties

Properties are accessed and used in a controller called `GreetingController`.

## Running the demo

1. Build an executable jar file: `mvn clean install`
2. Run the app: `$ java -jar config-client-service-1.0-SNAPSHOT.jar`
3. Use `cURL` to make calls
    - `curl http://localhost:8080/greetings`
    - `curl http://localhost:8080/magic`

## Corner Cases
1. You will get a default value of "NA" if the Spring Cloud Config Server does not define the 
`greet.name` property.
This is defined in the controller. You can find the default value declaration inside the 
`@Value` annotation.

2. If you shutdown the config server after you run this service, the greeting name is 
going to be cached and be used for the further calls.
  
On the other hand, this is a demo project and doesn't handle all possible exceptions. 

### More Info
For more information read my tutorial on [here](selcukbozdag.com).

