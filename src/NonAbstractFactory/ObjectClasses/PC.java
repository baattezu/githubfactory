package NonAbstractFactory.ObjectClasses;

public class PC extends Computer {
    private String ram; //ram
    private String hdd; //hdd
    private String cpu; //cpu

    public PC(String ram, String hdd, String cpu){ //constructor
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }
    @Override
    public String getHDD() {
        return this.hdd;
    }
    @Override
    public String getCPU() {
        return this.cpu;
    }
}
