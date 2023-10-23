package com.soumen.batch.springbatchdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    @Override
    public Person process(final Person person) throws Exception {
        var upperCasePerson = new Person(person.firstName().toUpperCase(), person.lastName().toUpperCase());
        log.info("Transformed person : {}", upperCasePerson);
        return upperCasePerson;
    }
}
