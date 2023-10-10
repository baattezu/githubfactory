package Abstract;

import NonAbstractFactory.ObjectClasses.Computer;
import NonAbstractFactory.ObjectClasses.PC;

public class PCFactoryI implements IComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;
    public PCFactoryI(String ram, String hdd, String cpu){ //constructor нужен для создания энтити
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}