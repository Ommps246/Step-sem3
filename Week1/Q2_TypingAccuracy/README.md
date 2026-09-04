# Week 1 Assignment — Problem 2: The Typing Speed Test Accuracy Checker

Compares a typed attempt against the original passage character by character
and reports accuracy plus the position of the first mistake.

Accuracy = (matched characters / total characters) x 100

**Method signature:** `void checkTypingAccuracy(String original, String typed)`

## Run
```bash
javac TypingAccuracyChecker.java
java TypingAccuracyChecker
```

## Sample output
```
Original: "hello world" | Typed: "hello worlt"
Matched: 10/11 | Accuracy: 90.91% | First Mismatch at position 11 ('d' vs 't')

Original: "coding" | Typed: "coding"
Matched: 6/6 | Accuracy: 100.00% | No Mismatches
```

**Concepts:** String traversal, charAt(), loops, conditional logic, percentage calculation.
