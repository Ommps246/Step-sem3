# Day 1 — Problem 1: Rock-Paper-Scissors Game

**Scenario:** The College Coding Arcade

Simulates N rounds of Rock-Paper-Scissors between a player and the computer,
records every round, and prints a scoreboard with the win percentage.

**Method signature:** `String playRound(String playerMove, String computerMove)`

## Run
```bash
javac RockPaperScissors.java
java RockPaperScissors
```

## Sample output
```
Round 1 - Player: Rock, Computer: Scissors -> Player Wins
Round 2 - Player: Paper, Computer: Paper -> Draw
Round 3 - Player: Scissors, Computer: Rock -> Computer Wins
...
Wins: 2 | Losses: 2 | Draws: 1 | Win % = 40.0%
```
*(The computer's moves are random, so the exact scoreboard changes each run.)*

**Concepts:** Random number generation, conditional logic, loops, arrays, formatted tabular output, percentage calculation.
