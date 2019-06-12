package com.lemzki.google.people.mapper;



public interface ResourceMapper<T,R> {

    default ResourceMapper<T, R> createFrom(R r) {
        return this;
    }

    R mapResource(T t);

    T mapModel(R r);


}
