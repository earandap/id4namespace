package com.example.id4namespace.service.generator;

import com.example.id4namespace.service.IdGenerator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Base64;


/**
 * This id generator produces randomly id
 *
 * @see SecureRandom
 * @see <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#SecureRandom">Availabe generators</a>
 * @see Base64.Encoder
 */

@ConditionalOnProperty(prefix = "app", name = "generator", havingValue = "random")
@Component("pseudo-random-generator")
public class PseudoRandomIDGenerator implements IdGenerator {

    private final SecureRandom random = SecureRandom.getInstance("NativePRNGNonBlocking");

    public PseudoRandomIDGenerator() throws NoSuchAlgorithmException {
    }

    @Override
    public String generateId(String namespace) {
        byte[] r = new byte[8];
        random.nextBytes(r);
        return new StringBuilder(Base64.getUrlEncoder().encodeToString(r).substring(0, 11))
                .append("-")
                .append(String.format("%d", LocalDateTime.now().getNano() / 1000))
                .toString();
    }
}
