package glazov;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting...");

        Shop shop = new Shop();
        shop.getCachDesks().add(new CachDesk("1", 10));
        shop.getCachDesks().add(new CachDesk("2", 13));
        shop.getCachDesks().add(new CachDesk("3", 15));
        shop.getCachDesks().add(new CachDesk("4", 17));

        shop.addClient();
        shop.addClient();
        shop.addClient();
        shop.addClient();
        shop.addClient();
        shop.addClient();
        shop.addClient();
        shop.addClient();
        shop.addClient();
        shop.serveClient("2");
        shop.addClient();
        shop.serveClient("1");
        shop.addClient();
        shop.serveClient("2");
        shop.serveClient("3");
        shop.serveClient("4");
        shop.addClient();
        shop.addClient();
        shop.addClient();
        shop.serveClient("1");
    }
}
