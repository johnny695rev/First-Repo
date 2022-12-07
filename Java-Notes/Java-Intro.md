# Java
Java is well known and able to scale.
- Java is **strongly typed**
    - Once a data type is set, it can not be changed.
- Java is **statically typed**
    - you must declare the data type youa re working with every time you create data.
- Memory is automatically managed.
- Write once, run anywhere
    -any machine with JRE/JVM can run a java application

## JDK, JRE, JVM
The Java Development Kit (JDK) contains the libraries and tools needed to write Java applications. The java compiler turns our source code (.java) into byte code (.class). It also provides a debugger.

A Java Runtime Environment (JRE) is provided with the JDK when downloaded. A JRE is needed to run a Java application. The JRE contains the necessary runtime libraries for execution. The Java Virtual machine is contained in the JRE. This ensures your code will run on your machine.

The JVM takes the byte code (.class) and turns it into data that is understandable by your OS.

javac HelloWorld.java
//compiles
java HelloWorld
//runs .class file

## Interfaces
Classes are like blueprints, Interfaces are like contracts. Classes and implement multiple interfaces. Only a single class can be extended.