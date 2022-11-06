public class Notebook extends PortableComputer {
    private String CPU;
    private String OZU;
    private String HDD;

    public Notebook(String cpu,String ozu,String hdd) {
            setCPU(cpu);
            setHDD(ozu);
            setOZU(hdd);
            setName("Notebook");
    }

    @Override
    public void turnOn() {
        System.out.println();
        System.out.println(getName() + " " + getCPU() + " " + getOZU() + " " + getHDD());
        System.out.println(isThereKeyboard());
        System.out.println(isThereDisplay());
        System.out.println("Turned on");
        System.out.println("");
    }
    @Override
    public void turnOff() {
        System.out.println(getName() + " " + getCPU() + " " + getOZU() + " " + getHDD());
        System.out.println(isThereKeyboard());
        System.out.println(isThereDisplay());
        System.out.println("Turned off");
        System.out.println("");
    }
    @Override
    public void internetConnect() {
        System.out.println(getName() + " " + getCPU() + " " + getOZU() + " " + getHDD());
        System.out.println(isThereKeyboard());
        System.out.println(isThereDisplay());
        System.out.println("Is connected to the Internet");
        System.out.println("");
    }

}
