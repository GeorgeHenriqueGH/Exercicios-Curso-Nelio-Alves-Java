package classes;

public class Caixa extends Stock {
    public int PriceStock(int stock) {
        if(stock >= 100) {
            qtdProduct += priceProduct + descont;
        } else if(stock <= 50) {
            qtdProduct += priceProduct + -descont;
        }
        return qtdProduct;
    }

    @Override
    public String toString() {
        return "Name product: "
               + nameProduct
               + ",\nPrice Product: "
               + priceProduct
               + ",\nQuantitie Product: "
               + qtdProduct
               + ",\nDescont: "
               + descont;
    }    
}
