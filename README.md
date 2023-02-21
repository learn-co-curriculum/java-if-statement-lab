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
- Simulate the game "Rock Paper Scissors".
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

#### Rock, Paper, Scissors

In this section, make use of the `Random` class to simulate two opponents
playing the game rock, paper, scissors.

Rock, paper, scissors is a game played between two opponents. They each play
a different sign that represents a rock, paper, or scissors. The rules of the
game goes as follows:

- Rock beats scissors.
- Paper beats rock.
- Scissor beats paper.
- If opponents play the same sign, then it results in a tie.

Assume that we can represent rock as the integer `0`, paper as the integer `1`,
and scissors as the integer `2`.

- Use the `nextInt()` method to generate a pseudorandom `int` value from 0 - 2
  inclusive to represent two opponents playing the game.
- Use a chained conditional statement to determine what each opponent plays.
  - You _must_ tell the user what each opponent plays.
    - If opponent 1 plays rock, print "Opponent 1 plays rock."
    - If opponent 1 plays paper, print "Opponent 1 plays paper."
    - If opponent 1 plays scissors, print "Opponent 1 plays scissors."
  - You _must_ tell the user which opponent won or if it was a tie.
    - If both opponents play the same sign, print "The opponents tie!"
    - If opponent 1 wins, print "Opponent 1 won!"
    - If opponent 2 wins, print "Opponent 2 won!"
  - You _must_ make use of conditionals (`if` statements, `if-else` statements,
    or `if-else if-else` statements).
  - Hint: It is recommended to use a **chained conditional**. This is when we
    have an `if` statement, `else if` statements, and an `else` statement.

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
Opponent 1 played scissors.
Opponent 2 played paper.
Opponent 2 won!
```

Example Output #2:

```text
The coin landed on tails
Opponent 1 played paper.
Opponent 2 played paper.
The opponents tied!
```

Example Output #3:

```text
The coin landed on heads
Opponent 1 played paper.
Opponent 2 played rock.
Opponent 1 won!
```

Remember, the output here does not have to _exactly_ match your output since we
are generating pseudorandom values. But it should have similar messages regarding
the two games.

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
