# If Statement Lab

## Learning Goals

- Practice with the `Random` class.
- Practice using the `if` statement.
- Practice using chained conditionals.
- Practice debugging `if` statements and observe the control flow.

## Introduction

In this lab, practice using the `Random` class and `if` statements to simulate
a couple of games. We'll also practice debugging some more to observe the
control flow when using `if` statements.

Fork and clone this repository. When you do, you will see two files: `Lab.java`
and `BuggyLab.java`. This assignment will have you write your own program to
simulate some games along with debugging an existing program. Follow the
instructions below to see where your code should go.

## Instructions

There are three parts to this lab:

- Simulate flipping a coin.
- Simulate rolling a die.
- Debugging a program.

The first two parts are in `Lab.java` and the debugging part will be in the
`BuggyLab.java` file.

### `Lab.java` Instructions

#### Heads or Tails?

In this section, make use of the `Random` class to simulate flipping a coin.

- Use the `nextBoolean()` method to generate a pseudorandom `boolean` value.
- Use an `if` statement to determine if the coin landed on heads.
  - Assume that if the `boolean` value is `true`, that it landed on heads.
    Otherwise, it landed on tails.
  - You _must_ tell the user if it landed on heads or tails. Meaning, if it
    didn't land on heads, you _must_ tell the user it landed on tails.
    - If the coin lands on heads, print "The coin landed on heads".
    - If the coin lands on tails, print "The coin landed on tails".
  - Hint: Since the `if` statement takes in a conditional clause that evaluates
    as a boolean expression, we could just pass in the `boolean` value to the
    `if` statement like so:
    - `if (isHeads)` <-- This would look at the value of the variable,
      `isHeads`, to see if it is `true` or `false`.

Run the program after you finished completing the above instructions. It is
advised you test out this program a few times to ensure that all options are
running correctly.

You may also run the program with the IntelliJ debugger, or you can use the
Java Visualizer.

#### Rolling a Die

In this section, make use of the `Random` class to simulate rolling a die.
Remember, a die has 6 faces and each face has a number on it. The numbers range
from 1 - 6.

- Use the `nextInt()` method to generate a pseudorandom `int` value from 1 - 6.
  - Hint: Remember, a die has 6 faces. To limit the values of integers, we can
    use something like this:

    ```java
        Random random = new Random();
        int numberOfSides = 6;
        int minimum = 1;    // Since 1 is the lowest number we can roll
        int dieRoll = random.nextInt(numberOfSides) + minimum;
    ```

- Use an `if` statement to determine what number the die rolled.
  - You _must_ tell the user what number the die landed on.
    - If the die rolled a 1, print "We rolled a 1".
    - If the die rolled a 2, print "We rolled a 2".
    - If the die rolled a 3, print "We rolled a 3".
    - If the die rolled a 4, print "We rolled a 4".
    - If the die rolled a 5, print "We rolled a 5".
    - If the die rolled a 6, print "We rolled a 6".
  - You _must_ make use of conditionals (`if` statements, `if-else` statements,
    or `if-else if-else` statements).
  - Hint: It is recommended to use a **chained conditional**. This is when we
    have `if` statement, `else if` statements, and an `else` statement.

Run the program after you finished completing the above instructions. It is
advised you test out this program several times to ensure that all options are
running correctly.

You may also run the program with the IntelliJ debugger, or you can use the
Java Visualizer.

### `BuggyLab.java` Instructions

In this program, we want to determine if the user entered an even or an odd
number. A quick way to determine if the number entered was even is to perform
modulus division, `%`, like so:

`userNumber % 2 == 0`

If a number when modded with 2 evaluates to 0, then it means the number has no
remainders when divided by 2. If it evaluates to 1, then it means the number has
1 remainder and is odd.

If we were to run this program with a user input of 2, then everything works
as expected:

```text
Please enter an integer:
2
The number, 2, is even!
```

But if we run the program, as is, with a user input of 1, then notice the
program does not tell us if the number is even or odd:

```text
Please enter an integer:
1
```

We expected the program to print "The number, 1, is odd!" but it never did.

Place some breakpoints in the program and run it with the debugger to determine
and isolate the bug. Once you have found the issue, make your changes within the
buggy program. Remember, we want the program to output whether the number is
even or odd.

## Expected Output

### `Lab.java` Expected Output

Example Output #1:

```text
The coin landed on tails
We rolled a 5
```

Example Output #2:

```text
The coin landed on tails
We rolled a 1
```

Example Output #3:

```text
The coin landed on heads
We rolled a 6
```

Remember, the output here does not have to _exactly_ match your output since we
are generating pseudorandom values. But it should have similar messages with a
coin flip landing on heads or tails and a die rolling on an integer 1-6.

### `BuggyLab.java` Expected Output

Example with Even Input:

```text
Please enter an integer:
18
The number, 18, is even!
```

Example with Odd Input:

```text
Please enter an integer:
-5
The number, -5, is odd!
```
