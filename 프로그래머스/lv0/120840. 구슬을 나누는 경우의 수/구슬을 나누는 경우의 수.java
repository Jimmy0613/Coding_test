import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        if(balls==share)
            return BigInteger.valueOf(1);

        //n!
       BigInteger nf = BigInteger.valueOf(balls);
        for(int i = balls-1; i>=(share+1); i--){
         nf = nf.multiply(BigInteger.valueOf(i));
      }
        
        //(n-m)!
        BigInteger nmf = BigInteger.valueOf(balls-share);
      for(int i = balls-share-1; i>=1; i--){
          nmf = nmf.multiply(BigInteger.valueOf(i));
       }
       
        return nf.divide(nmf);
    }
}