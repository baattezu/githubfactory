package Abstract;

import NonAbstractFactory.ObjectClasses.Computer;

public class CmptAbstractFactory {
    public static Computer getComputer(IComputerAbstractFactory factory){
        return factory.createComputer();
    }

    //берет тот новый завод который вы указали либо ServerFactory либо PCFactory и возвращают функцию создания компьютера в зависимости от класса.
}