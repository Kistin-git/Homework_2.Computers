public class PortableComputer extends Computerlmpl {
    Keyboard keyboard = new Keyboard();
    Display display = new Display();

    public String isThereKeyboard() {
        return keyboard.getConnection();
    }

    public String isThereDisplay() {
        return display.getConnection();
    }

}
