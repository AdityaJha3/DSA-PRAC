public class NthFibonacci {

    public static int fibbo(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int fibb_n=fibbo(n-1)+fibbo(n-2);

        return fibb_n;
    }
    public static void main(String[] args) {
        int i=26;

        System.out.println(fibbo(i));
    }
}

