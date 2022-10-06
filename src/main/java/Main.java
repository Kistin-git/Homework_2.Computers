import java.io.InvalidObjectException;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        //some micro change to create a pull request
        Computer[] Computer = new Computer[6];

        Notebook notebook = new Notebook("intel i7", "16gb ssd", "250gb");
        Server server = new Server("intel i5", "8gb ssd", "300gb");
        Desktop desktop = new Desktop("intel i7", "16gb ssd", "700gb","RTX2000");
        Netbook netbook = new Netbook("intel i7", "8gb ssd", "250gb");
        Monoblock monoblock = new Monoblock("intel i5", "8gb ssd", "120gb");
        Nettop nettop = new Nettop("intel i7", "4gb ssd", "330gb");

        Computer[0] = notebook;
        Computer[1] = netbook;
        Computer[2] = nettop;
        Computer[3] = monoblock;
        Computer[4] = server;
        Computer[5] = desktop;

        for (int i = 0; i < 6; i++) {
            Computer[i].turnon();
            Computer[i].internetconnect();
            Computer[i].turnoff();
        }


    }
}