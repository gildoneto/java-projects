# Java 17 Masterclass

## Java Keywords

ReservedKeyword:
(one of)
```java
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

```java
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