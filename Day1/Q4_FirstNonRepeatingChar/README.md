# Day 1 — Problem 4: First Non-Repeating Character

**Scenario:** The Unique Letter Hunt Mini-Game

Finds the first character in the input that appears exactly once, using a
256-slot frequency array followed by a left-to-right scan.

**Method signature:** `char findFirstNonRepeatingChar(String text)`

## Run
```bash
javac FirstNonRepeatingChar.java
java FirstNonRepeatingChar
```

## Sample output
```
Input: "swiss"
First Non-Repeating Character: 'w'

Input: "aabbcc"
No Non-Repeating Character Found
```

**Concepts:** Character frequency counting, loops, array-based counting, early-exit scanning.
