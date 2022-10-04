public class Notebook extends PortableComputer {

    public Notebook() {
            setCPU("intel i5");
            setHDD("ssd 250gb");
            setOZU("8gb");
            setName("Notebook");
    }

    @Override
    public void turnon() {
        System.out.println();
        System.out.println(getName() + " " + getCPU() + " " + getOZU() + " " + getHDD());
        System.out.println(istherekeyboard());
        System.out.println(istheredisplay());
        System.out.println("Turned on");
        System.out.println("");
    }
    @Override
    public void turnoff() {
        System.out.println(getName() + " " + getCPU() + " " + getOZU() + " " + getHDD());
        System.out.println(istherekeyboard());
        System.out.println(istheredisplay());
        System.out.println("Turned off");
        System.out.println("");
    }
    @Override
    public void internetconnect() {
        System.out.println(getName() + " " + getCPU() + " " + getOZU() + " " + getHDD());
        System.out.println(istherekeyboard());
        System.out.println(istheredisplay());
        System.out.println("Is connected to the Internet");
        System.out.println("");
    }

}
