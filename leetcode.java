class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long s = 0 ;
        int ans =0;
        for( int i : chalk){
            s+=i;
        }
        k%=s;
        for( int i =0 ; i < chalk.length;i++){
            if(k<chalk[i]){
                 return i ;
            }else{
                k-=chalk[i];
            }
        }
        return -1;
    }
}