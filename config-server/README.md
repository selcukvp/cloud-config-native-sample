# Config Server

This is an external configuration server that stores all configuration via native profile.

## Property Definitions

Properties are defined in `resources` directory. Because we wanted them to be resolved in 
the classpath. And `resources` directory is a good place to put the properties 
for the purpose of the demo. You can also try using a directory on your local directory.

## Configuration Locations and Names

There is only one published configuration called as `foo`. In `application.yml`, it is 
declared that it is going to be resolved under the classpath.

Any client application has to use that name to access properties defined in `foo.yml`.

## More Information

You can find more information [on my tutorial](selcukbozdag.com).