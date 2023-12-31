package com.example.batchapp.processor;

import com.example.batchapp.data.Person;
import com.example.batchapp.data.PersonOutput;
import org.springframework.batch.item.ItemProcessor;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PersonProcessor implements ItemProcessor<Person, PersonOutput> {


    @Override
    public PersonOutput process(Person person) throws Exception {

        LocalDate birthDate = LocalDate.parse(person.getBirthDate(), DateTimeFormatter.ISO_DATE);

        // Calculate the age
        int age = calculateAge(birthDate, LocalDate.now());

        return new PersonOutput(person.getFirstName(), person.getLastName(), String.valueOf(age));
    }


    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            throw new IllegalArgumentException("Invalid date input");
        }
    }
}
