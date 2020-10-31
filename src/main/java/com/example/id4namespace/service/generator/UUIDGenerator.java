package com.example.id4namespace.service.generator;

import com.example.id4namespace.service.IdGenerator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * This id generator produces randomly id based on a type 4 (pseudo randomly generated) UUID
 *
 * @see UUID
 */

@ConditionalOnProperty(prefix = "app", name = "generator", havingValue = "uuid", matchIfMissing = true)
@Component("uuid-generator")
public class UUIDGenerator implements IdGenerator {

    @Override
    public String generateId(String namespace) {
        return UUID.randomUUID().toString();
    }
}
