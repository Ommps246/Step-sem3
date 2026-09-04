# Day 1 — Problem 3: BMI Calculator for a Team

**Scenario:** The Corporate Wellness Program

Computes BMI for a team of 10 employees and prints a wellness report table.

BMI = weight / (height x height) — Underweight < 18.5, Normal 18.5-24.9, Overweight 25-29.9, Obese >= 30.

**Method signatures:** `String getBmiStatus(double bmi)`, `void printWellnessReport(double[] heights, double[] weights)`

## Run
```bash
javac BmiCalculator.java
java BmiCalculator
```

## Sample output
```
Person     Height (m)   Weight (kg)  BMI      Status
1          1.75         70.0         22.86    Normal
2          1.60         90.0         35.16    Obese
```

**Concepts:** Parallel arrays, arithmetic, conditional logic, formatted tabular output.
