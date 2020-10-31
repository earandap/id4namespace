package com.example.id4namespace.service.generator;

import com.example.id4namespace.service.IdGenerator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * This id generator produces a null id every time.  It's util when you want to delegate the id generation to
 * the persistence solution
 */

@ConditionalOnProperty(prefix = "app", name = "generator", havingValue = "null")
@Component("null-generator")
public class NullIdGenerator implements IdGenerator {
    @Override
    public String generateId(String namespace) {
        return null;
    }
}
