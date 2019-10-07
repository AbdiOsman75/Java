public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double twoNumber) {
        int firstHundred = (int) (firstNumber * 1000);
        int twoHundred = (int) (twoNumber * 1000);
        if (firstHundred == twoHundred) {
            return true;
        } else {
            return false;
        }
    }
}
