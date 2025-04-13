class GreatestCommonDivisor{
    public static void main(String[] args) {
        int a = 18*3;
        int b = 18*2;
        System.out.println(gcd(a, b));
        System.out.println(gcdIterativ(a, b));
    }

    public static int gcd(int a, int b){
        if (a < b){
            int temp = a;
            a = b;
            b = temp;
        }

        int c = a%b;
        if (c ==0){
            return b;
        }

        return gcd(b, c);
    }

    static int gcdIterativ(int a, int b){
        if (a < b){
            int temp = a;
            a = b;
            b = temp;
        }

        int c = a%b;
        while (c != 0){
            a=b;
            b=c;
            c = a%b;
        }

        return b;
    }
}