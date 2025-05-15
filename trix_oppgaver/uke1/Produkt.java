import java.util.Scanner;

class Produkt{
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Value for x:");
        int x = user.nextInt();
        System.out.println("Value for y:");
        int y = user.nextInt();
        System.out.println("Product of x and y is: "+(x*y));
        int diff = x-y;
        if (diff > 0){
            System.out.println("x - y gives the positive number: "+diff);
        } else if (diff < 0){
            System.out.println("x - y gives the negative number: "+diff);
        } else System.out.println("x and y are the same number");

        user.close();
    }
}