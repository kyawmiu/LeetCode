class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> answer= new HashMap<>();
		
		 for(String str : strs ) {
			 char [] temp= str.toCharArray();
			 Arrays.sort(temp);
			 String sorted=String.valueOf(temp);
			
			 if(!answer.containsKey(sorted)) {
				 answer.put(sorted, new ArrayList<>());
			 }
			 
			 answer.get(sorted).add(str);
		 }
		
		
		 return new ArrayList<>(answer.values());
    }
}