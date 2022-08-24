public class LineSearch2D082404 {
   public static int lineSearch2D082404(String[][] haystack,String target) {
    for(int i=0;i<haystack.length;i++) {
    	for(int j=0;j<haystack[0].length;j++) {
    		if(target.equals(haystack[i][j])) {
    			System.out.println(target + " located at [" + i + "][" + j + "].");
    			return 1;
    		}
    	}
    }
    System.out.println("Couldn't find the " + target + " in the haystack.");
	return -1;
  }
   public static void main(String[] args) {
     String[][] haystack = {{"hay", "hay"}, {"hay", "hay"}, {"hay", "hay"}, {"hay", "hay"}, {"needle", "hay"}, {"hay", "hay"}};
     String target = "needle";
     lineSearch2D082404(haystack, target);
 }
}