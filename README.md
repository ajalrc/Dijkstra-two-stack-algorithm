# Dijkstra-two-stack-algorithm (numerical input has to be inside the brackets like (2+3) in the string format.)
This algorithm works with 4 basic steps:
1. If value push on the value stack
2. If operator then push onto the operator stack
3. If right parenthesis then pop operator and two values;push thre result of applying that operator to those values onto the operand stack
4. If left parenthesis then ignore.
