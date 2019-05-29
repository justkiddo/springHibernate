package com.journaldev.dao;

import com.journaldev.model.Person;

import java.util.List;

public interface PersonDAO {

    public void save(Person p);

    public List<Person> list();
}
