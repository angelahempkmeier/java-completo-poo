package entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(){}

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public Double priceTag() {
        return super.priceTag() + 20.0;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
}
