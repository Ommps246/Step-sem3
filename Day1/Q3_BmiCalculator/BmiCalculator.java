public class BmiCalculator {

    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void printWellnessReport(double[] heights, double[] weights) {
        System.out.println("============== WELLNESS REPORT ==============");
        System.out.printf("%-10s %-12s %-12s %-8s %s%n",
                "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            System.out.printf("%-10d %-12.2f %-12.1f %-8.2f %s%n",
                    (i + 1), heights[i], weights[i], bmi, getBmiStatus(bmi));
        }
        System.out.println("---------------------------------------------");
    }

    public static void main(String[] args) {
        double[] heights = {1.75, 1.60, 1.82, 1.68, 1.55, 1.90, 1.72, 1.58, 1.66, 1.78};
        double[] weights = {70.0, 90.0, 78.5, 52.0, 45.0, 105.0, 68.0, 61.0, 88.0, 74.5};

        printWellnessReport(heights, weights);
    }
}
