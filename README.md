# White_Validations

This Library will help you (Developers) to perform basic generic validations for all of your standard 
methods throwing your custom exceptions and/or custom messages of errors and useful information for your callers.

### What is this repository for? ###

* Quick summary
You can import all of the validators to your class so far has implemented its first method. 
The caller can just import all the validations on to his/her own classes with a static import and use them as local. 
For example:<br>
```java
 	void myMethod(String myParam){
  	    notNullValidation("This parameter must not be null because is vital to complete my process",myParam);
  	    //My process definition
 	}
```
you can also do this:
<code>
> > 	    notNullValidation("This parameter must not be null because is vital to complete my process",MyProjectException.class,parameter1,parameter2);
</code>
And the library will encapsulate the exception (if thrown) under your specified exception.
the methods accept, any number of parameters or collections
* Version
2.0.0

### How do I get set up? ###

* Summary of set up
look for the library on maven (["white-sdev + White_Validations"](https://mvnrepository.com/artifact/com.github.white-sdev/White_Validations)) and import the library into your project
by including it in your POM. [2.0 version](https://mvnrepository.com/artifact/com.github.white-sdev/White_Validations/2.0.0)
```XML
<!-- https://mvnrepository.com/artifact/com.github.white-sdev/White_Validations -->
<dependency>
    <groupId>com.github.white-sdev</groupId>
    <artifactId>White_Validations</artifactId>
    <version>2.0.0</version>
</dependency>
```



Alternatively you can manually import the .jar file into your project.
* Configuration
the code:
>  import static org.white_sdev.white_validations.parameters.ParameterValidator.*;
will import all validations into your workspace (Classes).
* Dependencies
this library uses lombok to log errors and general logs.
* Database configuration
None
* Deployment instructions
No need for those :)

### Contribution guidelines ###

* Writing tests
Please follow the pattern
* Code review
Request if needed
* Other guidelines
Ask for the code standard to use as guidelines and reflect them in here.

### Who do I talk to? ###

* Repo owner or admin
owner - 
current main developer - obed.vazquez@gmail.com
* Other community or team contact
Please contact me if you want to help, I'm developing and mantaining and supporting in general this project on my own with no help or support of anyone and any tip, comment, change or help in general is well received.

