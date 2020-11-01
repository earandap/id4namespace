package com.example.id4namespace.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NamespaceServiceImpl implements NamespaceService {

    private final IdGenerator generator;

    public String generateId(String namespace) {
        return new StringBuilder(namespace)
                .append("-")
                .append(generator.generateId(namespace))
                .toString();
    }

}
