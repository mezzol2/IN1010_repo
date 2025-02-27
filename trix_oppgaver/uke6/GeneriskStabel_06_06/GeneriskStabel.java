class GeneriskStabel <T> {
    private Node first = null;

    private class Node{
        T thisT;
        Node nextNode = null;

        Node(T thisT){
            this.thisT = thisT;
        }

        public T getThisT() {
            return thisT;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node node){
            nextNode = node;
        }
    }

    public void leggPaa(T t){
        Node newNode = new Node(t);
        
        if (first != null){
            newNode.setNextNode(first);
        }

        first = newNode;
    }

    public T taAv(){
        if (erTom()){
            return null;
        } else{
            //try{
                T wasFirst = first.getThisT();
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
