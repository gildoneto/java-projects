# Section 6 - Control Flow

## The Switch Statement

```java
switch(value) {
    case x:
        // Code for value == x
        break;
    case y:
        // Code for value == y
        break;
    default:
        // Code for value not equal to x or y
}
```

### Switch Value Types

| Valid Switch Value Types                |
|-----------------------------------------|
| `byte`, `short`, `int`, `char`          |
| `Byte`, `Short`, `Integer`, `Character` |
| `String`                                |
| `enum`                                  |

**Important:** Cannot use `long`, `float`, `double` or `boolean` or their wrappers.

### Fall through in switch statement

Once a switch case label matches the switch variable, no more cases are checked.
Any code after the case label where there was a match found, will be executed, until a break statement, or the end of the switch statement occurs.
Without a break statement, execution will continue to fall through any case labels declared below the matching one, and execute each case's code.

## Enhanced Switch Statement

**Traditional Switch Statement**:

```java
switch (switchValue) {
    case 1:
        System.out.println("Value was 1");
        break;
    case 2:
        System.out.println("Value was 2");
        break;
    case 3: case 4: case 5:
        System.out.println("Was a 3, 4 or 5");
        System.out.println("Actually it was a " + switchValue);
        break;
    default:
        System.out.println("Was not 1, 2, 3, 4 or 5");
        break;
}
```

**Enhanced Switch Statement**:

```java
switch (switchValue) {
    case 1 -> System.out.println("Value was 1");
    case 2 -> System.out.println("Value was 2");
    case 3, 4, 5 -> {
        System.out.println("Was a 3, 4 or 5");
        System.out.println("Actually it was a " + switchValue);
    }
    default -> System.out.println("Was not 1, 2, 3, 4 or 5");
}
```

**Traditional Switch Statement used in a method, returning values**:

```java
switch(month) {
    case "JANUARY":
    case "FEBRUARY":
    case "MARCH":
        return "1st";
    case "APRIL":
    case "MAY":
    case "JUNE":
        return "2nd";
    case "JULY":
    case "AUGUST":
    case "SEPTEMBER":
        return "3rd";
    case "OCTOBER":
    case "NOVEMBER":
        return "4th";
}
return "bad";
```

**Enhanced Switch Expression**:

```java
return switch(month) {
    case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
    case "APRIL", "MAY", "JUNE" -> "2nd";
    case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
    case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
    default -> "bad";
};
```

### When to use yield in a switch

Your switch statement is being used as a switch expression returning a value.
Your case label uses a code block, with opening and closing curly braces.


| This code | is implicitly translated to |
|-----------|-----------------------------|
| `1st`     | `-> { yield "1st"; }`       |

## Looping

Looping lets us execute the code a multiple number of times.
Java supports several statements for looping, or executing code repetitively.

## Java supports three statements for looping 

| Statements | Explanation                                                                                              |
|------------|----------------------------------------------------------------------------------------------------------|
| `for`      | The for loop is more complex to set up but is commonly used when you are iterating over a set of values. |
| `while`    | The while loop executes until a specified condition becomes false.                                       |
| `do while` | The do while loop always executes at least one and continues until a specified condition becomes false.  |

## The for statement

The for statement is often referred to as the for loop.
It repeatedly loops something until a condition is satisfied.

```java
for(init; expression; increment) {
    // block of statements    
}
```

There are three parts to the basic for statement's declaration.

These are declared in parentheses, after the for keyword, and are separated by semicolons.

These parts are all optional and consist of the following:
* The initialization section declares or sets state, usually declaring and initializing a loop variable, before the loop begins processing.
* The expression section, once it becomes false, will end the loop processing.
* The increment section is executed after the expression is tested, and is generally the place where the loop variable is incremented.

## The break statement

A break statement transfers control out of an enclosing statement.
We've seen the break statement in the switch statement, but it can also be used in a loop.