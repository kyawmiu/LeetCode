class Solution {
   public  boolean isAnagram(String s, String t) {
    HashMap<Character,Integer> map1= consists(s);
    HashMap<Character,Integer> map2= consists(t);

	return map1.equals(map2);
    }

public  HashMap<Character,Integer> consists(String a){
	
	HashMap<Character,Integer> map= new HashMap<>();
	for (int i = 0; i < a.length(); i++) {
		if(map.containsKey(a.charAt(i))==true) {
			int temp=map.get(a.charAt(i))+1;
			map.put(a.charAt(i), temp);
		}else {
			map.put(a.charAt(i), 1);
		}
		
		
	}
	return map;
}
}