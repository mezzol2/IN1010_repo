class Forkurs{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int num1 = 1;
        int num2 = 2;
        int num3 = num1 + num2;
        System.out.println(num3);
        for (int i = 0; i < 5; i++){
            System.out.println("Hei paa deg!");
        }
        int[] myArray = new int[num3];
        for (int i = 0; i < num3; i++){
            myArray[i] = i;
            System.out.println(myArray[i]);
        }
    }
}