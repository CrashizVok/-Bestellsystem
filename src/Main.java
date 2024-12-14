public class Main {
    public static void main(String[] args) {
        Rendeles rendeles = new Rendeles();

        Etel pizza = new Etel("Pizza", 2500);
        Ital cola = new Ital("Cola", 500, "Nagy");

        rendeles.addEtel(pizza);
        rendeles.addEtel(cola);

        rendeles.pushRendeles();
        System.out.println("Teljes ár: " + rendeles.osszeg() + " Ft");
    }
}
