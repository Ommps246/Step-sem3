public class WarehouseInventoryBalancer {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        if (sectionA.length != sectionB.length) {
            System.out.println("Error: both sections must have the same number of items.");
            return;
        }

        int totalA = 0;
        int totalB = 0;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            totalB += sectionB[i];
        }

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        int highest = sectionA[0];
        String highestSection = "Section A";
        int highestIndex = 0;

        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > highest) {
                highest = sectionA[i];
                highestSection = "Section A";
                highestIndex = i;
            }
            if (sectionB[i] > highest) {
                highest = sectionB[i];
                highestSection = "Section B";
                highestIndex = i;
            }
        }

        System.out.println("Section A Total: " + totalA
                + " | Section B Total: " + totalB
                + " | Status: " + status
                + " | Highest Quantity: " + highest
                + " (" + highestSection + ", Item " + (highestIndex + 1) + ")");
    }

    public static void main(String[] args) {
        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};
        System.out.println("sectionA = {20, 15, 30}, sectionB = {25, 10, 30}");
        analyzeInventory(sectionA, sectionB);
        System.out.println();

        int[] altA = {40, 12, 8};
        int[] altB = {5, 9, 11};
        System.out.println("sectionA = {40, 12, 8}, sectionB = {5, 9, 11}");
        analyzeInventory(altA, altB);
    }
}
