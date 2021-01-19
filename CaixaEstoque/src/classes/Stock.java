package classes;

public abstract class Stock {
    
    protected String nameProduct;
    protected int qtdProduct;
    
    protected double priceProduct;
    protected double descont;

    public String getNameProduct() { return nameProduct; }
    public void setNameProduct(String nameProduct) { nameProduct = this.nameProduct; }

    public int getQtdProduct() { return qtdProduct; }
    public void setQtdProduct(int qtdProduct) { qtdProduct = this.qtdProduct; } 

    public double PriceInterest() {
        return priceProduct += descont;
    }

    public double Price() {
        return priceProduct -= -descont;
    }

}