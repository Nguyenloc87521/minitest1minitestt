package PACKAGE_NAME;public class lc367 {
      public boolean isPerfectSquare(int num) {

        if(num < 0){
            return false;
        }
        for (int i = 0;   i<=num/i; i++) {
            if (i*i==num){
                return true;
            }
        }
        return false;
    }
}
