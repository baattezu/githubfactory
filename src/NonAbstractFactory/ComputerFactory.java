package NonAbstractFactory;

import NonAbstractFactory.ObjectClasses.Computer;
import NonAbstractFactory.ObjectClasses.PC;
import NonAbstractFactory.ObjectClasses.Server;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String
            hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram,
                hdd, cpu);

        return null;
    }
    //сам завод который делит на оба подкласса
}
