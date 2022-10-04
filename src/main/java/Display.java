public class Display {
    private String connection;

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }
    public Display() {
        setConnection("Display is connected to your device");
    }


}
