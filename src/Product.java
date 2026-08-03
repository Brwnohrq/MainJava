public class Produto {

    private String name;
    private String brand;
    private double price;
    private int availableStock;



    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean sellProduct(int quantity) {
        if (quantity <= 0) {
            System.out.println("It is not possible to buy that quantity.");
            return false;

        }else if (quantity <= availableStock){
            availableStock -= quantity;
            System.out.println("You sold " + quantity + " unity");
            return true;
            
        } else {
        System.out.println("You can't sell that quantity.");
    } return false;

}
}


