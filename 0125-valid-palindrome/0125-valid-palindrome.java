class Solution {
    public boolean isPalindrome(String s) {
         String a="";
       
       for( char j: s.toCharArray()) {
    	   if(Character.isAlphabetic(j) || Character.isDigit(j)) {
    		   a+=j;
    	   }
       }
       a=a.toLowerCase();
       int frontPointer=0;
       int backPointer=a.length()-1;
     
       while(frontPointer<=backPointer) {
    	   
    	 
    	   if(a.charAt(frontPointer)!= a.charAt(backPointer)) {
    		   return false;
    	   }
    	   frontPointer+=1;
    	   backPointer-=1;
       }
       
		return true;
    }
}