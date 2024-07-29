# Serenity JUnit Screenplay Starter project

Get started quickly with Serenity BDD and JUnit 5 with this simple starter project. 

## Get the code

Git:

    git clone https://github.com/serenity-bdd/serenity-junit-screenplay-starter
    cd serenity-junit-screenplay-starter


Or simply [download a zip](https://github.com/serenity-bdd/serenity-junit-screenplay-starter/archive/master.zip) file.

## Use Maven

Open a command window and run:

    mvn clean verify
    desde cucumber 6 el cucumber.options cambio de nombre a cucumber.filter.tags
    mvn verify -D cucumber.filter.tags="@login2"
    mvn verify -D cucumber.filter.tags="@login1"


## Use Gradle

Open a command window and run:

    gradlew test 
    gradle clean test  -D cucumber.filter.tags="@Login1"


## Viewing the reports

Both of the commands provided above will produce a Serenity test report in the `target/site/serenity` directory. Go take a look!

## Tailoring the project to your needs

# Prueba_probar
