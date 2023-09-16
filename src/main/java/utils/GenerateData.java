package utils;

import com.github.javafaker.Faker;

import java.util.ArrayList;

public class GenerateData {
    static public ArrayList<Object> generateData() {
        Faker faker = new Faker();
        Boolean sex = faker.bool().bool();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();
        ArrayList<Object> fakeData = new ArrayList<>();
        fakeData.add(sex);
        fakeData.add(firstName);
        fakeData.add(lastName);
        fakeData.add(email);
        fakeData.add(password);
        return fakeData;
    }
}
