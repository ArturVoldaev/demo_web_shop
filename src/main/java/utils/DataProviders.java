package utils;

import com.github.javafaker.Faker;
import fw.ApplicationManager;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DataProviders extends GenerateData {
    protected static final ApplicationManager app = new ApplicationManager();

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    @DataProvider
    static public Iterator<Object[]> dataForNewUser() {
        ArrayList<Object> data = generateData();
        List<Object[]> list = new ArrayList<>();
        String password = (String) data.get(4);
        list.add(new Object[]{generateData().get(0), generateData().get(1), generateData().get(2),generateData().get(3), password, password});
        list.add(new Object[]{generateData().get(0), generateData().get(1), generateData().get(2),generateData().get(3), password, password});
        list.add(new Object[]{generateData().get(0), generateData().get(1), generateData().get(2),generateData().get(3), password, password});
        list.add(new Object[]{generateData().get(0), generateData().get(1), generateData().get(2),generateData().get(3), password, password});
        return list.iterator();
    }
}
