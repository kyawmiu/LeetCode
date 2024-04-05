class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int i=0;
	       int j=numbers.length-1; 
	        int ans []={0,0};
	        
	     while(i<j){
	    	 System.out.println("i : " +i +" j: "+j);
	         if((numbers[i]+numbers[j])>target) {
	             j--;
	         }else if((numbers[i]+numbers[j])<target){
	             i++;
	         }else if(numbers[i]+numbers[j]==target){
	             ans=new int []{i+1,j+1};
	             return ans;
	         }
	     } 
	        
	    return ans;
    }
}