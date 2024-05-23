package com.example;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.HashSet;
import java.util.Set;

@Module
public class PersonModule {
    @Singleton
    @Named("jane")
    @Provides
    public Person jane() {
        return new Person("Jane");
    }

    @Singleton
    @Provides
    @IntoSet
    public Person joshua() {
        return new Person("Joshua");
    }

    @Singleton
    @Provides
    @Named("exceptJane")
    public Set<Person> allExceptJane(/*does Dagger have trouble with this part?*/ Set<Person> allExceptJane) {
        return allExceptJane;
    }

    @Singleton
    @Provides
    @Named("all")
    public Set<Person> all(@Named("exceptJane") Set<Person> allExceptJane,
                           @Named("jane") Person jane) {
        Set<Person> all = new HashSet<>(allExceptJane);
        all.add(jane);
        return all;
    }
}
