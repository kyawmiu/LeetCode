class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
        return false;
    }
    char [] a=s.toCharArray();
    char [] b=t.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
    if(Arrays.equals(a, b)){
        return true;
    }else{
        return false;
    }
    }
}