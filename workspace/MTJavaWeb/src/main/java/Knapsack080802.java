
public class Knapsack080802 {

    static int knapSack(int weightCap, int weights[], int values[], int i)
    {
        int index, weight;
        int matrix[][] = new int[i + 1][weightCap + 1];

        for (index = 0; index <= i; index++) {
            for (weight = 0; weight <= weightCap; weight++) {

            }
        }
        return matrix[i][weightCap];
    }

    public static void main(String[] args) {
        int values[] = new int[] { 70, 20, 39, 37, 7, 5, 10 };
        int weights[] = new int[] { 31, 10, 20, 19, 4, 3, 6 };
        int weightCap = 50;
        int i = values.length;
        Knapsack080802 myNapsack = new Knapsack080802();
        System.out.println(myNapsack.knapSack(weightCap, weights, values, i));
    }
}