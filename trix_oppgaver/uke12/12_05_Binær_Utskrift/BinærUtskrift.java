class BinærUtskrift{
    public static void main(String[] args) {
        int n = 19;
        skrivUtBinær(n);
    }

    static void skrivUtBinær(int n){
        //base case
        if (n == 0){
            System.out.print("0");
            return;
        }

        //continue?
        if (n >= 2){
            skrivUtBinær(n/2);
        }
        //print the modulo
        System.out.print(n % 2);
    }
}