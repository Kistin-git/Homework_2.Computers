public class Desktop extends Computerlmpl {
    public Desktop (String cpu,String ozu,String hdd,String videocard) {
        setCPU(cpu);
        setHDD(ozu);
        setOZU(hdd);
        setName("Desktop");
        setVideocard(videocard);
    }
    private String Videocard;

    public String getVideocard() {
        return Videocard;
    }

    public void setVideocard(String videocard) {
        Videocard = videocard;
    }

    @Override
    public void turnon() {
        System.out.println();
        System.out.println(getName() + " " + getCPU() + " " + getOZU() + " " + getHDD() + " " + getVideocard());
        System.out.println("Turned on");
        System.out.println("");
    }
    @Override
    public void turnoff() {
        System.out.println(getName() + " " + getCPU() + " " + getOZU() + " " + getHDD() + " " + getVideocard());
        System.out.println("Turned off");
        System.out.println("");
    }
    @Override
    public void internetconnect() {
        System.out.println(getName() + " " + getCPU() + " " + getOZU() + " " + getHDD() + " " + getVideocard());
        System.out.println("Is connected to the Internet");
        System.out.println("");
    }

}
