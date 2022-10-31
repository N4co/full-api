package br.com.felix.demo.service;

import br.com.felix.demo.model.Person;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService implements Serializable {

    private static final long serialVersionUID = 1L;


    private final AtomicLong counter = new AtomicLong();

    private final Logger log = Logger.getLogger(PersonService.class.getName());

    public List<Person> findAll() {

        log.info("search or people");

        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
              Person person = mockPerson(i);
              persons.add(person);
        }
        return persons;
    }

    private Person mockPerson(int i) {


        Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setFirstName("Aqui seu primeiro nome " + i);
        person.setLastName("Aqui seu sobrenome " + i);
        person.setAddress("Aqui seu endereço " + i);
        person.setGender("male");
        return person;

    }
    public Person findById(String id) {

        log.info("search or person");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Oriundo");
        person.setLastName("de Lugar");
        person.setAddress("Lugar - Sp- Planet");
        person.setGender("male");
        return person;

    }

    public Person created(Person person) {

        log.info("created or person");

        return person;
    }

    public Person update(Person person) {

        log.info("updating or person");

        return person;
    }

    public void  delete (String id ) {

        log.info("delete or person");

    }
}



