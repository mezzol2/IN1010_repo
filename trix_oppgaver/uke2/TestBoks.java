class TestBoks{
    public static void main(String[] args){
        Boks boks1 = new Boks(1, 2, 3);
        Boks boks2 = new Boks(4, 5, 6);

        if (boks1.beregnVolum()==6){
            System.out.println("Success 1");
        } else{
            System.out.println("Fail 1");
        }

        if (boks2.beregnVolum()==120){
            System.out.println("Success 2");
        }else{
            System.out.println("Fail 2");
        }

        //4+6+12
        if (boks1.beregnAreal()==22){
            System.out.println("Success 3");
        }else{
            System.out.println("Fail 3");
        }

        //40+48+60
        if (boks2.beregnAreal()==148){
            System.out.println("Success 4");
        }else{
            System.out.println("Fail 4");
        }
    }
}