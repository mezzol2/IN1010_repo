class Postmann implements Runnable{
    private Postkontor postkontor;
    
    Postmann(Postkontor postkontor){
        this.postkontor = postkontor;
    }

    public void run(){
        //make 100 packages
        //deliver them 1 by 1 to postkontor

        for (int i = 0; i < 100; i++){
            if (i%3 == 0){
                Post post = new Post("Devil Fruit", "Luffy");
                postkontor.leverPost(post);
            } else if (i%2 == 0){
                Post post = new Post("The One Ring", "Bilbo Baggins");
                postkontor.leverPost(post);
            } else {
                Post post = new Post("Horcrux", "Harry Potter");
                postkontor.leverPost(post);
            }
        }
    }
}