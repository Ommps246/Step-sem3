# Week 1 Assignment — Problem 4: The Warehouse Inventory Balancer

Totals the stock in Section A and Section B, reports whether they are balanced,
and locates the single highest-quantity item across the whole warehouse.

**Method signature:** `void analyzeInventory(int[] sectionA, int[] sectionB)`

## Run
```bash
javac WarehouseInventoryBalancer.java
java WarehouseInventoryBalancer
```

## Sample output
```
sectionA = {20, 15, 30}, sectionB = {25, 10, 30}
Section A Total: 65 | Section B Total: 65 | Status: Balanced | Highest Quantity: 30 (Section A, Item 3)
```

**Concepts:** Arrays, loops, sum accumulation, conditional comparison, tracking a maximum with its index.
