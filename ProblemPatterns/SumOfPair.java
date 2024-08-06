package ProblemPatterns;

public class SumOfPair {
    public static void main(String[] args){
        SumOfPair sol = new SumOfPair();
        int[] result = sol.search(new int[]{1,2,3,4,6},6);
        System.out.println(result[0]+","+ result[1]);
        result = sol.search(new int[]{2,5,9,11},11);
        System.out.println(result[0]+","+ result[1]);
        
    }

    private int[] search(int[] arr, int targetSum) {
        int left = 0; int right = arr.length-1;
        while(left <right){
            int currentSum = arr[left] + arr[right];
            if(currentSum == targetSum){
                return new int[]{left,right};
            }
            if(targetSum > currentSum){
                left++;
            }else{
                right --;
            }
        }
        return new int[]{-1,-1};        
    }  
}
