package app;

import java.util.Scanner;

public class OptimizedPrimeFactorization extends Thread {
    @Override
    public void run() {
        int n = 2;
        int max = 500;
        while (n<max){
            //tim SNT
            if(n == 2){
                System.out.println(n);
            }else{
                boolean check = true;
                for(int i = 2; i < Math.sqrt(n); i++ ){
                    if (n%i == 0){
                        // ko phai so nt
                        check = false;
                        break;
                    }
                }
                if (check) System.out.println(n);
            }
            n++;
        }
        try {
            Thread.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
