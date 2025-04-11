class Triangel{
    public static void main(String[] args) {
        triangel(2, 10);
    }

    static void triangel(int m, int n) {
        for (int i = 1; i<= m;i++){
            System.out.print('*');
        }
        System.out.print("\n");

        if (m + 1 <= n){
            triangel(m+1, n);
        }

        for (int i = 1; i<=m;i++){
            System.out.print('*');
        }
        System.out.print("\n");
    }    
}