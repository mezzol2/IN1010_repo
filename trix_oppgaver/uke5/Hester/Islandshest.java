class Islandshest extends Hest implements KanToelte, KanPasse{

    Islandshest(String navn, int alder){
        super(navn, alder);
    }
    
    @Override
    public void toelt() {
        System.out.println("Oh lawd, he trottin'!");
    }

    @Override
    public void pass(){
        System.out.println("The horse is passing?  Idfk");
    }
    
}