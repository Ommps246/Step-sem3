# Week 1 Assignment — Problem 3: The Traffic Signal Streak Analyzer

Scans a minute-by-minute signal log ('R', 'Y', 'G') and reports the longest
continuous streak of the same colour, so engineers know which signal to inspect.

**Method signature:** `void findLongestStreak(String signalLog)`

## Run
```bash
javac TrafficSignalStreakAnalyzer.java
java TrafficSignalStreakAnalyzer
```

## Sample output
```
Signal Log: "RRGGGYRR"
Longest Streak: 'G' repeated 3 times

Signal Log: "RRRRYYGG"
Longest Streak: 'R' repeated 4 times
```

**Concepts:** String traversal, character comparison, loops, tracking a running maximum.
