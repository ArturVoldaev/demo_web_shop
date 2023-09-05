package com.demowebshop.automattest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Register extends Base {


    @DataProvider
    static public Iterator<Object[]> dataForNewUser() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{0,"asasass","cddcds","cdsdcsd@dcewcwes.com","qwertyyyyy", "qwertyyyyy"});
        list.add(new Object[]{1,"asasass1","cddcds4","cdsdcsd@dcewcwse.ru","qwertyyyyy", "qwertyyyyy"});
        list.add(new Object[]{0,"asasass2","cddcds5","cdsdcsd@dcewcswe.de","qwertyyyyy", "qwertyyyyy"});
        list.add(new Object[]{1,"asasass3","cddcds6","cdsdcsd@dcewcwse.fi","qwertyyyyy", "qwertyyyyy"});
        return list.iterator();
    }


    @Test(dataProvider = "dataForNewUser")
    public void registerNewUserWithParams(Integer sex, String firstName, String lastName,String email,String password, String confirmPassword) {
        registerNewUser(sex, firstName, lastName, email, password, confirmPassword);
    }
}
