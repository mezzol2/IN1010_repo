class TestStudent{
    public static void main(String[] args){
        Student1 joakim = new Student1("Joakim");
        Student1 kristin = new Student1("Kristin");
        Student1 dag = new Student1("Dag");

        joakim.leggTilQuizScore(10);
        joakim.leggTilQuizScore(10);

        kristin.leggTilQuizScore(5);
        kristin.leggTilQuizScore(5);

        dag.leggTilQuizScore(20);
        dag.leggTilQuizScore(20);

        System.out.println("name: "+joakim.hentNavn()+", total score: "+joakim.hentTotalScore()+", avg score: "+joakim.hentGjennomsnittligScore());
        System.out.println("name: "+kristin.hentNavn()+", total score: "+kristin.hentTotalScore()+", avg score: "+kristin.hentGjennomsnittligScore());
        System.out.println("name: "+dag.hentNavn()+", total score: "+dag.hentTotalScore()+", avg score: "+dag.hentGjennomsnittligScore());
    }
}