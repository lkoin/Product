public class Main {
    public static void main(String[] args) {
        Product mleko = new Product("laciate",5,4.25,23);
        Product ser = new Product("tostowy",9,6.26, 18);
        Product woda = new Product("cisowianka",15,1.53,23);

        System.out.println(mleko);
        System.out.println(ser);
        System.out.println(woda);

        double priceWithVat = mleko.calculateWithVatPrice();
        System.out.println("Wartosc produktu to: "+ priceWithVat);
        priceWithVat = ser.calculateWithVatPrice();
        System.out.println("Wartosc produktu to: "+ priceWithVat);
        priceWithVat = woda.calculateWithVatPrice();
        System.out.println("Wartosc produktu to: "+ priceWithVat);
    }

}