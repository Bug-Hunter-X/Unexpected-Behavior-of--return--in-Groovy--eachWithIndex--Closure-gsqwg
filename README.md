# Groovy `eachWithIndex` Return Behavior

This example demonstrates a common pitfall in Groovy when using the `return` statement within an `eachWithIndex` closure. The `return` statement only exits the closure, not the enclosing method, which can be unexpected and lead to errors.

The `bug.groovy` file contains code that showcases this behavior. The `bugSolution.groovy` file presents a corrected version using a more appropriate approach for early termination.

## How to reproduce the bug:
1. Run `bug.groovy` using a Groovy interpreter or IDE.
2. Observe that the line "This line will always execute" is printed, even though the condition `item == "stop"` is met.

## Understanding the solution:
The solution replaces `return` with a more appropriate approach like using a flag or `break` to prematurely exit the loop and subsequently control the flow of execution within the `myMethod`. 
