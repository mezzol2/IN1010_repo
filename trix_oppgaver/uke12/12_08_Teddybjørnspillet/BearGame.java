class BearGame{
    public static void main(String[] args) {
        int n = 27570;
        System.out.println(teddy(n));
    }

    static boolean teddy(int n){
        String path = n+"";
        return teddyRekursiv(n, path);
    }
    
    static boolean teddyRekursiv(int n, String path){
        //Check if 42
        if (n == 42){
            System.out.println(path);
            return true;
        }

        //Check if less than 1
        if(n<1 || path.contains(" "+n+" ")){
            System.out.println(path);
            return false;
        }

        //Check if divisible by 2
        if (n%2 == 0){
            if (teddyRekursiv(n/2,path+" "+(n/2))){
                return true;
            }
        }

        //Check if divisible by 3 or 4
        if (n%3 == 0 || n%4==0){
            //product of last two digits
            int product = (n%10)*((n%100)/10);
            if (teddyRekursiv(n - product,path+" "+(n-product))){
                return true;
            }
        }

        //Check if divisible by 5
        if (n%5 == 0){
            if (teddyRekursiv(n-42,path+" "+(n-42))){
                return true;
            }
        }

        return false;
    }
}