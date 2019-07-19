public abstract class Flowers {
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    protected int getPrice() {
        return price;
    }

    public String getTitle(){
        return this.getClass().getSimpleName();
    }
}
