# Java 17 Masterclass

## Java Keywords

ReservedKeyword:
(one of)
```
abstract   continue   for          new         switch
assert     default    if           package     synchronized
boolean    do         goto         private     this
break      double     implements   protected   throw
byte       else       import       public      throws
case       enum       instanceof   return      transient
catch      extends    int          short       try
char       final      interface    static      void
class      finally    long         strictfp    volatile
const      float      native       super       while
_ (underscore)
```

ContextualKeyword:
(one of)

```
exports      opens      requires     uses
module       permits    sealed       var
non-sealed   provides   to           with
open         record     transitive   yield
```

Link: [Java Keywords](https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.9)

## Java’s Code Units

Writing code is similar to writing a document. It consists of special hierarchical units, which together form a whole.
These are:

**The Expression** – An expression computes to a single value.
**The Statement** – Statements are stand alone units of work.
And **Code Blocks** – A code block is a set of zero, one, or more statements, usually grouped together in some way to achieve a single goal.

## Methods

A method declares executable code that can be invoked, passing a fixed number of values as arguments.
A method is a way of reducing code duplication.
A method can be executed many times with potentially different results, by passing data to the method in the form of arguments.

This method has a name, but takes no data in, and returns no data from the method (which is what the special word `void` means in this declaration).

```java
public static void methodName() {
    // Method statements from method body
}
```

To execute a method, we can write a statement in code, which we say is calling, or invoking, the method.
For a simple method like calculateScore, we just use the name of the method, where we want it to be executed, followed by parentheses, and a semi-colon to complete the statement.
So for this example, the calling statement would look like the code shown here:

```java
calculateScore();
```

### Structure of the Method

Where we previously had empty parentheses after the method name, we now have method parameters in the declaration.

```java
public static void methodName(p1type p1, p2type p2, {more}) {
    // Method statements from the method body
}
```

### Parameters or Arguments?

Parameters and arguments are terms that are often used interchangeably by developers.
But technically, a parameter is the definition as shown in the method declaration, and the argument will be the value that's passed to the method when we call it.

### Executing a Method with parameters

To execute a method that's defined with parameters, you have to pass variables, values, or expressions that match the type, order and number of the parameters declared.
In the calculateScore example, I declared the method with four parameters, the first; a boolean, and the other three of int data types.
So we have to pass first a boolean, and then 3 int values as shown in this statement:

```java
calculateScore(true, 800, 5, 100);
```
I can't pass the boolean type in any place, other than as the first argument, without an error.