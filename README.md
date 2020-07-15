# White_Validations

This Library will help you (Developers) to perform basic generic validations for all of your standard 
methods throwing your custom exceptions and/or custom messages of error and useful information for your callers.

### What is this repository for? ###

* Quick summary
Already implemented its is the first method. But you can import all of the validators to your class
The caller can just import all the validations on to its classes with a static import and use them as local. 
For example:<br>
<code>
> 	void myMethod(String myParam){
> > 	    notNullValidation(myParam,"This parameter must not be null because is vital to complete my process");
> > 	    //My process definition
> 	}
* Version
1.0

### How do I get set up? ###

* Summary of set up
look for the library on maven ("white-sdev + White_Validations" on google) and import the library into your project
by including it in your POM. Alternatively you can manually import the .jar file into your project.
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
:(
