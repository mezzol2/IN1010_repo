class Control{
    private View view;
    private Model model;

    Control(){
        model = new Model();
        view = new View(this);
    }

    public void countUp(){
        model.countUp();
        String newCount = Integer.toString(getCount());
        view.updateCount(newCount);
    }

    public int getCount(){
        return model.getCount();
    }
}