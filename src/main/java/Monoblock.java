public class Monoblock extends Computerlmpl {
    public Monoblock (String cpu,String ozu,String hdd) {
        setCPU(cpu);
        setHDD(ozu);
        setOZU(hdd);
        setName("Monoblock");
    }
    Display display = new Display();
    private String isThereDisplay() {
        return display.getConnection();
    }
    @Override
    public void turnOn() {
        System.out.println();
        System.out.println(getName() + " " + getCPU() + " " + getOZU() + " " + getHDD());
        System.out.println(isThereDisplay());
        System.out.println("Turned on");
        System.out.println("");
    }
    @Override
    public void turnOff() {
        System.out.println(getName() + " " + getCPU() + " " + getOZU() + " " + getHDD());
        System.out.println(isThereDisplay());
        System.out.println("Turned off");
        System.out.println("");
    }
    @Override
    public void internetConnect() {
        System.out.println(getName() + " " + getCPU() + " " + getOZU() + " " + getHDD());
        System.out.println(isThereDisplay());
        System.out.println("Is connected to the Internet");
        System.out.println("");
    }
}
