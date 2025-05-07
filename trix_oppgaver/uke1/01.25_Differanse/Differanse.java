import java.util.Scanner;

class Differanse{
    public static void main(String[] args){
        int x,y;
        Scanner user = new Scanner(System.in);
        System.out.println("Gimme a number:");
        x = user.nextInt();
        System.out.println("Good job.  Gimme another:");
        y = user.nextInt();
        int diff = x -y;
        System.out.println("The difference is "+diff);
        user.close();
    }
}