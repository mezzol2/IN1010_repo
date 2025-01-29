class TestStudenter{
    public static void main(String[] args) {
        Studenter myStudenter = new Studenter();
        System.out.println(myStudenter.finnStudent("Espen Askeladd"));
        System.out.println();
        myStudenter.printStudentKeys();
        myStudenter.printStudentValues();
    }

}