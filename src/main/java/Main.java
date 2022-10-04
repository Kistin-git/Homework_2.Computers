import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Computer[] Computer = new Computer[6];
        Notebook notebook = new Notebook();
        Server server = new Server();
        Desktop desktop = new Desktop();
        Netbook netbook = new Netbook();
        Monoblock monoblock = new Monoblock();
        Nettop nettop = new Nettop();
        Computer[1] = notebook;
        Computer[2] = netbook;
        Computer[3] = nettop;
        Computer[4] = monoblock;
        Computer[5] = server;
        Computer[0] = desktop;
        for (int i = 0; i < 6; i++) {
            Computer[i].turnon();
            Computer[i].internetconnect();
            Computer[i].turnoff();
        }







        notebook.turnon();
        notebook.internetconnect();
        notebook.turnoff();


    }
}