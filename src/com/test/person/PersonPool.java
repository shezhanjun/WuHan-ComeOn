package com.test.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Description 模拟人员这个池子
 * @Author 湛神
 * @Date 2020/2/7 6:11 PM
 */
public class PersonPool {

    private static PersonPool personPool = new PersonPool();

    public static PersonPool getInstance() {
        return personPool;
    }

    List<Person> personList = new ArrayList<Person>();

    public List<Person> getPersonList() {
        return personList;
    }

    private PersonPool() {
        City city = new City(400, 400);
        for (int i = 0; i < 5000; i++) {
            Random random = new Random();
            int x = (int) (100 * random.nextGaussian() + city.getCenterX());
            int y = (int) (100 * random.nextGaussian() + city.getCenterY());
            if (x > 700) {
                x = 700;
            }
            Person person = new Person(city, x, y);
            personList.add(person);
        }
    }
}
