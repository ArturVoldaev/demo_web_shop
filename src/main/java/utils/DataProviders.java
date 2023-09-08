package utils;

import com.github.javafaker.Faker;
import fw.ApplicationManager;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DataProviders {
    protected static final ApplicationManager app = new ApplicationManager();

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    static public ArrayList<Object> generateData() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();
        ArrayList<Object> fakeData = new ArrayList<>();
        fakeData.add(firstName);
        fakeData.add(lastName);
        fakeData.add(email);
        fakeData.add(password);
        return fakeData;
    }
    @DataProvider
    static public Iterator<Object[]> dataForNewUser() {
        ArrayList<Object> data = generateData();
        System.out.println(data);
        System.out.println(data.get(0));
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{getRandomNumber(0,1), data.get(0), data.get(1),data.get(2), data.get(3)});
//        list.add(new Object[]{getRandomNumber(0,1), firstName,lastName,email,password, password});
//        list.add(new Object[]{getRandomNumber(0,1), firstName,lastName,email,password, password});
//        list.add(new Object[]{getRandomNumber(0,1), firstName,lastName,email,password, password});
        System.out.println(Arrays.toString(new List[]{list}));
        return list.iterator();
    }
}
