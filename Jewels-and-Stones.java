class Solution {
    public int numJewelsInStones(String J, String S) {
        
        if (J == null || J.length() == 0) {
            return 0;
        }
        
        int counter = 0;
        for(int i=0; i<S.length(); i++){
            for(int k=0; k<J.length(); k++){
                if(J.charAt(k) == S.charAt(i)){
                    counter++;
                    break;
                }
            }
        }
        
        return counter;
    }
}
