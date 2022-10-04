import java.io.InvalidObjectException;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Computer[] Computer = new Computer[6];

        Notebook notebook = new Notebook();
        Server server = new Server();
        Desktop desktop = new Desktop();
        Netbook netbook = new Netbook();
        Monoblock monoblock = new Monoblock();
        Nettop nettop = new Nettop();

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