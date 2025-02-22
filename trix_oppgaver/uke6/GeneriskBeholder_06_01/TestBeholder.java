class TestBeholder {
    public static void main(String[] args) {
        Beholder<Sirkel> circleBox = new Beholder<>();
        Sirkel circle = new Sirkel(1);

        circleBox.settInn(circle);
        System.out.println(circleBox.taUt().toString());

    }
}
