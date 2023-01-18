package entities;

import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactoryDate;

    public UsedProduct(){

    }
    public UsedProduct(String name, Double price, Date manufactoryDate) {
        super(name, price);
        this.manufactoryDate = manufactoryDate;
    }

    public Date getManufactoryDate() {
        return manufactoryDate;
    }

    public void setManufactoryDate(Date manufactoryDate) {
        this.manufactoryDate = manufactoryDate;
    }
}
