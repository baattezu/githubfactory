import NonAbstractFactory.ObjectClasses.Computer;
import Abstract.CmptAbstractFactory;
import Abstract.ServerFactoryI;
import Abstract.PCFactoryI;

public class TestAbstractFactory {
    public static void main(String[] args) {
        testAbstractFactory();
    }
    private static void testAbstractFactory() {
        Computer pc = CmptAbstractFactory.getComputer(new PCFactoryI("2 GB","500 GB","2.4 GHz"));
        Computer server = CmptAbstractFactory.getComputer(new ServerFactoryI("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory NonAbstractFactory.ObjectClasses.PC Config::"+pc);
        System.out.println("AbstractFactory NonAbstractFactory.ObjectClasses.Server Config::"+server);
    }
    //делаем через абстрактный класс и заводы для отдельных сабклассов . Нужно указывать отдельно завод
}
