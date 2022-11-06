public class Computerlmpl implements Computer {
    public void turnOn() {
        System.out.println();
        System.out.println(getName() + " " + getCPU() + " " + getOZU() + " " + getHDD());
        System.out.println("Turned on");
        System.out.println("");
    }

    public void turnOff() {
        System.out.println(getName() + " " + getCPU() + " " + getOZU() + " " + getHDD());
        System.out.println("Turned off");
        System.out.println("");
    }

    public void internetConnect() {
        System.out.println(getName() + " " + getCPU() + " " + getOZU() + " " + getHDD());
        System.out.println("Is connected to the Internet");
        System.out.println("");
    }
    private String CPU;
    private String OZU;
    private String HDD;

    private String Name;

    public String getOZU() {
        return OZU;
    }

    public void setOZU(String OZU) {
        this.OZU = OZU;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
