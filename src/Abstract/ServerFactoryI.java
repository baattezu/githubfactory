package Abstract;

import NonAbstractFactory.ObjectClasses.Computer;
import NonAbstractFactory.ObjectClasses.Server;

public class ServerFactoryI implements IComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactoryI(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }
}