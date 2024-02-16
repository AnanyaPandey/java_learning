# Java

## Module 1 

### Variables, Expressions,  Jshell 

<p>Java shell is  used as REPL gets immediate feedback on the java commands that is run like an interpreter rather then compiling the code and running it. Some of the commands are as follows</p>

* /help - to get help in Jshell
* /list - to see the list of commands that are run recently
* /var - to see the list of variables

### Variables

* Primitive Data Type
  * Numbers(Integers)
    * Byte: 127 to 127
    * Short: -32756 to 32756
    * Int: 
    * Long
    * Double
  * Boolean: True False
* Non Primitive Data Types
  * Arrays
  * Strings

``` java
int Int_var = 5;
System.out.print(Int_var);
System.out.print(Integer.MIN_VALUE); 
System.out.print(Integer.MAX_VALUE);
// to print multiple things in a single pring
//+ is used to combine the strings - integer is printed as string
System.out.print("Min value for an interger is: " + Integer.MAX_VALUE);

//printing in multiple lines of Jshell
jshell> System.out.print(
   ...> "Range of integer is :"
   ...> +Integer.MIN_VALUE+
   ...> " to "
   ...> +Integer.MAX_VALUE);    
// useful if we are writing long expression

```

Class - class a building block of object oriented programming. everything in a programming language is a class or object. 

Wrapper class  - Java uses wrapper class for primitive data types

* wrapper class provide simple operation which provide info about primitive data type which cannot be saved in variable itself.
* MAX_VALUE and MIN_VALUE are some elements of Integer data type

![wrapperclass](G:\Java\Tutorial\images\wrapperclass.JPG)

This element can be used for any other wrapper class. If we try to save a larger number in a data type it will be overflow

```java
jshell> int my = Integer.MAX_VALUE + 1
my ==> -2147483648
    // this showcases overflow, reverse will also be true for MIN
    // that we called underflow.
int new = 2147483648
|  Error:
|  integer number too large
// on giving direct numeric value it gives error on giving an expression it tries to assign it.
    
```

