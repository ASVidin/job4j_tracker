package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> surname = personSurname -> personSurname.getSurname().contains(key);
        Predicate<Person> name = personName -> personName.getName().contains(key);
        Predicate<Person> phone = personPhone -> personPhone.getPhone().contains(key);
        Predicate<Person> address = personAddress -> personAddress.getAddress().contains(key);
        Predicate<Person> combine = surname.or(name).or(phone).or(address);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
