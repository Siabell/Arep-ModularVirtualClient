# Arep-ModularVirtualClient


This application implements a client using threads, this client  can connect to a url and print the response from that url on the screen. 


## Getting Started

 In order to use this project, first clone this repository or download the project.

Then access the address where the project is located and execute the following commands

```
mvn compile
mvn package
mvn install
```
In order to generate the documentation of the project use the command 

```
mvn javadoc:javadoc
```
This command will generate the documentation in the folder 
```
 /target/site/apidocs/
 ```
To run the project go to "target" folder
```
java -jar  ClientFromAWSToHeroku-1.0-SNAPSHOT.jar urlAddress numberOfThreads
```
An example with google.com and 1 thread:

```
java -jar  ClientFromAWSToHeroku-1.0-SNAPSHOT.jar http://google.com 1
```

### Prerequisites

You will need maven java installed on your machine to employ this program

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Heroku](https://www.heroku.com/) - Deploy Enviroment
* [Java](https://www.java.com/es/download/) - Programming language


## Authors

* **Valentina Siabatto** - *Escuela Colombiana de Ingeniería Julio Garavito* 

See also the list of [contributors](https://github.com/Siabell/AREP-lab1-introduccion/graphs/contributors) who participated in this project.

## License

This project is licensed under the GNU General Public License v3.0 - see the [LICENSE.md](LICENSE.md) file for details


