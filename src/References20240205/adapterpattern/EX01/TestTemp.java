package References20240205.adapterpattern.EX01;

public class TestTemp {

    public static void main(String[] args) {

// class adapter
        System.out.println("class adapter test");
        TemperatureInfo tempInfo = new TemperatureClassReporter();
        testTempInfo(tempInfo);



// object adapter
        System.out.println("\nobject adapter test");
        tempInfo = new TemperatureObjectReporter();
        testTempInfo(tempInfo);

    }

    public static void testTempInfo(TemperatureInfo tempInfo) {


        //class and object adapter
        tempInfo.setTemperatureInC(10);
        System.out.println("temp in C:" + tempInfo.getTemperatureInC());
        System.out.println("temp in F:" + tempInfo.getTemperatureInF());

        //class and object adapter
        tempInfo.setTemperatureInF(50);
        System.out.println("temp in C:" + tempInfo.getTemperatureInC());
        System.out.println("temp in F:" + tempInfo.getTemperatureInF());
    }
}
