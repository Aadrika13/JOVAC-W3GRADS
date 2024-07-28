package CodingMarathon;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {1,2,1};
        System.out.println(totalFruit(fruits));
    }
    public static int totalFruit(int[] fruits) {
        int max = 0;
        int lastFruit = -1;
        int secondLastFruit = -1;
        int lastFruitCount = 0;
        int currentCount = 0;
        for (int fruit : fruits) {
            if (fruit == lastFruit || fruit == secondLastFruit) {
                currentCount++;
            } else {
                currentCount = lastFruitCount + 1;
            }
            if (fruit == lastFruit) {
                lastFruitCount++;
            } else {
                lastFruitCount = 1;
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }
            max = Math.max(max, currentCount);
        }
        return max;
    }
}
