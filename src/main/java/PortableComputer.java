public class PortableComputer extends Computerlmpl {
    Keyboard keyboard = new Keyboard();
    Display display = new Display();

    public String istherekeyboard() {
        return keyboard.getConnection();
    }

    public String istheredisplay() {
        return display.getConnection();
    }

}
