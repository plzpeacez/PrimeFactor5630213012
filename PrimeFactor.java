public class PrimeFactor {

    public static void main(String[] args) {

        int input;
        int primeFactor;

        input = Integer.parseInt(args[0]);
        for(int i=2 ; i<=input ; i++) {
            while(input % i == 0) {
                primeFactor = i;
                input /= primeFactor;
                System.out.print(primeFactor);
                if(input >= primeFactor) {
                    System.out.print(" X ");
                }
            }
        }
    }

}
