package com.journaldev.main;

import com.journaldev.dao.PersonDAO;
import com.journaldev.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringHibernateMain {

    public static void main (String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        PersonDAO personDAO = context.getBean(PersonDAO.class);

        Person person = new Person();
        person.setName("blabla");
        person.setCountry("England");
        personDAO.save(person);

        System.out.println("Person "+person);
        List<Person> list = personDAO.list();

        for(Person p: list){
            System.out.println("Person"+p);
        }
       // context.close();
    }
}
