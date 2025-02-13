class PasoFino extends Hest implements KanToelte{

    PasoFino(String navn, int alder){
        super(navn, alder);
    }
    
    @Override
    public void toelt() {
        System.out.println("Oh lawd, he trottin'!");
    }
    
}