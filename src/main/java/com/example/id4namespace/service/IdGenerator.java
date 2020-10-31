package com.example.id4namespace.service;

/**
 * Interface for producers of identifiers that are unique within a given namespace
 */
public interface IdGenerator {

    String generateId(String namespace);
}
