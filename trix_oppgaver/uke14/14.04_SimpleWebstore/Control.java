class Control{
    View view;
    Model model;
    
    Control(){
        model = new Model();
        model.initializeHashMap();
        view = new View(this);
    }

    public void startup(){
        view.setProduct(getVisibleProduct(), model.getPrice(getVisibleProduct()));
        view.packAndMakeVisible();
    }

    public String getVisibleProduct(){
        return model.getFirstProduct();
    }

    public void nextProduct(){
        String nextProduct = model.getNextProduct();
        view.setProduct(nextProduct, model.getPrice(nextProduct));
    }

    public void previousProduct(){
        String previousProduct = model.getPreviousProduct();
        view.setProduct(previousProduct, model.getPrice(previousProduct));
    }

    public void buyProduct(){
        model.addToCart();
        view.updateCart(model.getNumProductsInCart());
    }

    public void pay(){
        model.pay();
    }
}