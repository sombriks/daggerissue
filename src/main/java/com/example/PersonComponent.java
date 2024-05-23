package com.example;


import dagger.Component;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.Set;

@Component(modules = PersonModule.class)
@Singleton
public interface PersonComponent {
    @Named("jane")
    Set<Person> getAllPeople();
    @Named("exceptJane")
    Set<Person> getAllPeopleExceptJane();
}
