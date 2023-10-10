package Abstract;

import NonAbstractFactory.ObjectClasses.Computer;

public interface IComputerAbstractFactory {
    public Computer createComputer();
    //для сабкласса PCFactory , ServerFactory используется именно свой Override этого интерфейса
}