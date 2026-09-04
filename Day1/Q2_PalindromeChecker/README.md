# Day 1 — Problem 2: Palindrome Checker (3 Approaches)

**Scenario:** The QA Text Verification Toolkit

Verifies a text three independent ways — iterative, recursive, array reversal —
and confirms all three agree.

**Method signatures:**
- `boolean isPalindromeIterative(String text)`
- `boolean isPalindromeRecursive(String text)`
- `boolean isPalindromeArrayReversal(String text)`

## Run
```bash
javac PalindromeChecker.java
java PalindromeChecker
```

## Sample output
```
Input: "madam"
Iterative: Palindrome | Recursive: Palindrome | Array Reversal: Palindrome
All three approaches agree: true

Input: "hello"
Iterative: Not Palindrome | Recursive: Not Palindrome | Array Reversal: Not Palindrome
All three approaches agree: true
```

**Concepts:** Loops, recursion, array manipulation, string comparison.
