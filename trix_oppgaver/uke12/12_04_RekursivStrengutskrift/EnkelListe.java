class EnkelListe {
    private Node start;

    private void skrivUtBaklengs(Node n){
        if (n.neste != null){
            skrivUtBaklengs(n.neste);
        }

        System.out.println(n.innhold);
    }

    public void settInnForan(String nyttInnhold) {
        Node ny = new Node(nyttInnhold);
        ny.neste = start;
        start = ny;
    }

    public void skrivUt() {
        if (start != null){
            skrivUtBaklengs(start);
        }

        // Node tmp = start;
        // while (tmp != null) {
        //     System.out.println(tmp.innhold);
        //     tmp = tmp.neste;
        // }
    }

    private class Node {
        private String innhold;
        private Node neste;

        Node(String s) {
            innhold = s;
        }
    }
}
