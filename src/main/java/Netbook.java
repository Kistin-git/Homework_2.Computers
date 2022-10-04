public class Netbook extends PortableComputer {
    public Netbook () {
        setCPU("intel i7");
        setHDD("ssd 300gb");
        setOZU("4gb");
        setName("Netbook");
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
