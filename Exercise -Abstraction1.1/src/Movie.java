public class Movie extends Product{

    private String directot;

    public Movie() {

    }

    public Movie(String name, double price, String directot) {
        super(name, price);
        this.directot = directot;
    }

    public String getDirectot() {
        return directot;
    }

    public void setDirectot(String directot) {
        this.directot = directot;
    }

  @Override
    public double getDiscount(double discountPercentage) {
        return getPrice() - (getPrice() * (discountPercentage / 100));
    }

}
