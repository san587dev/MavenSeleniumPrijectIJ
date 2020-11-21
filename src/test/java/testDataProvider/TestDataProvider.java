package testDataProvider;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class TestDataProvider
{
    @DataProvider
    public static Object[][] dataSuiteA(Method m)
    {
        System.out.println(m.getName());
        Object data[][] = null;
        if(m.getName().toUpperCase().equals("TESTA"))
        {
            data = new Object[2][2];
                    data[0][0]="Santosh";
                    data[0][1]="Kokku";

                    data[1][0]="Jessica";
                    data[1][1]="Kokku";
        } return data;

    }

    @DataProvider
    public static Object[][] dataSuiteB(Method m)
    {
        Object data[][] = null;
        System.out.println(m.getName());
        data = new Object[3][2];
        data[0][0]="Emmanuel";
        data[0][1]="Kokku";

        data[1][0]="Pushpalatha";
        data[1][1]="Kokku";

        data[2][0]="Prathyusha";
        data[2][1]="Kokku";
        return data;
    }
}
