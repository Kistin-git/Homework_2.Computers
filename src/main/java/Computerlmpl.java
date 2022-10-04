public class Computerlmpl implements Computer {
    public void turnon() {
        System.out.println();
        System.out.println(getCPU() + " " + getOZU() + " " + getHDD());
        System.out.println("Turned on");
    }

    public void turnoff() {
        System.out.println(getCPU() + " " + getOZU() + " " + getHDD());
        System.out.println("Turned off");
    }

    public void internetconnect() {
        System.out.println(getCPU() + " " + getOZU() + " " + getHDD());
        System.out.println("Is connected to the Internet");
    }
    public String CPU;
    public String OZU;
    public String HDD;

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
}
