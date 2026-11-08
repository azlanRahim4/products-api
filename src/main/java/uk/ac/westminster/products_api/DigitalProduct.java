
package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {

    private double discountedPrice;
    private String downloadUrl;
    private double fileSizeMB;

    // No-arg constructor
    public DigitalProduct() {
    }

    // Full constructor
    public DigitalProduct(Long id, String name, double price,
                          String downloadUrl, double fileSizeMB) {

        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String getSummary() {
        return "Digital: " + getName() + " | download: " + downloadUrl;
    }


    @Override
    public void applyDiscount(double rate) {
        this.discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }


}
