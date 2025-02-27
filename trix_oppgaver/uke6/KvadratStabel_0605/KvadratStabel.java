class KvadratStabel {
    private Node first = null;

    private class Node{
        Kvadrat thisKvadrat;
        Node nextNode = null;

        Node(Kvadrat thisKvadrat){
            this.thisKvadrat = thisKvadrat;
        }

        public Kvadrat getThisKvadrat() {
            return thisKvadrat;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node node){
            nextNode = node;
        }
    }

    public void leggPaa(Kvadrat kvadrat){
        Node newNode = new Node(kvadrat);
        
        if (first != null){
            newNode.setNextNode(first);
        }

        first = newNode;
    }

    public Kvadrat taAv(){
        if (erTom()){
            return null;
        } else{
            //try{
                Kvadrat wasFirst = first.getThisKvadrat();
                first = first.getNextNode();
                return wasFirst;
            // } catch (Exception e){
            //     System.out.println("First item not defined");
            // }
        }
    }

    public boolean erTom(){
        if (first == null){
            return true;
        } else{
            return false;
        }
    }

}
