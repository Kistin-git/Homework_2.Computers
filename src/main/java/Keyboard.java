public class Keyboard {

    private String connection;

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }
    public Keyboard() {
        setConnection("Keyboard is connected to your device");
    }


}
