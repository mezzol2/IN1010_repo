class Student1{
    private String name;
    private int score = 0;
    private int numQuizes = 0;

    public Student1(String n){
        name = n;
    }

    public String hentNavn(){
        return name;
    }

    public void leggTilQuizScore(int s){
        score += s;
        numQuizes++;
    }

    public int hentTotalScore(){
        return score;
    }

    public double hentGjennomsnittligScore(){
        if (numQuizes!=0){
            return score / numQuizes;
        } else{
            return 0;
        }
    }
}