class Solution {
    public boolean isPalindrome(int x) {
        // List<Intefer> s = new ArrayList<>();
        if(x<0) return false;
        int reverse = 0;
        int y = x;
        while(x>0){
            int temp = x % 10;
            reverse = reverse*10+temp;
            x = x/10;
        }
        if(reverse != y){
            return false;
        }else{
            return true;
        } 
    }
}