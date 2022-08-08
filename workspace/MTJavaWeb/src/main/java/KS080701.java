public class KS080701{
	static int knapSack (int weightCap, int weights[], int values[], int i)
    {        
        if (i == 0 || weightCap == 0) {
            return 0;
        }
 
        else if (weights[i - 1] > weightCap) {
            return knapSack(weightCap, weights, values, i - 1);
 
        } else {
            return Math.max(
                   values[i - 1] + knapSack(weightCap - weights[i - 1], weights, values, i - 1),
                   knapSack(weightCap, weights, values, i - 1));
        }
    }
}