## Java 

* we create a file "first.java"
* we give this file to compiler javac (for compilation)
* javac converts this to "first.class"
* When we want to run this file we run it as "java first" (for Running)

<img src="G:\Java\Tutorial\images\javac.JPG" alt="javac" style="zoom:70%;" />

```java
import java.lang.* 
class firstprogram
{
    public static void main (String args[])
    {
        System.out.print("Hello World")
    }
}
// save this as first.java
```

### <font face="calibri"> Skeleton of  this Java Program</font>

* every program in java is within a class even if you don't write it it automatically calls the class.
* main function returning nothing (void)
* SOP system.out.print - to print 
* When we compile the java file if it is error free it generate the byte file .class
* "java filename" - converts the byte code to machine code and run the file.
* JVM should be able to see that main function so it has to be public 
* If we want to use something of a class without declaring any object that has to be declared as static
* JVM will call firstprogram.main()
* System Class out object print method. Class name with Capital Letter
* import java.lang.*  has System Class
* when compiling - give the filename while running give the class name

```java
public class secondprogram
...
        System.out.print("Hello World");
        System.out.print(args[0]);
...
/*
G:\Java\myprog>javac secondprog.java
secondprog.java:2: error: class secondprogram is public, should be declared in a file named secondprogram.java
public class secondprogram
*/
```

* When declaring the class as **public** the filename should match the **class name**

```java
   public class secondprog
    ...
        System.out.print("Hello World");
		System.out.print(args[0]);
	...
/*
G:\Java\myprog>javac secondprog.java
G:\Java\myprog>java secondprog

Hello WorldException in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at secondprog.main(secondprog.java:7)

G:\Java\myprog>java secondprog PrintThis
Hello WorldPrintThis
*/

```

* Whatever given in main along with string is the command line argument that will be passed while running java file

### how to read data from keyboard

* A class called scanner is used in java to read data from various sources
* scanner class is present in util package, provided from java v5 onwards
* import java.util.*

```java
/*nextInt() - reads integer
nextFloat() - float
nextDouble() - double
next() - to read a string or word
nextLine() - multiple words
nextBype() - 
nextBoolean() - For boolean data type
*/  
		Scanner s = new Scanner(System.in);
		// s is the object of scanner
		int a,b,c;
		System.out.print("Enter Two Numbers");
```

