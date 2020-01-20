package tk.burdukowsky.gen_secret;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Base64;

public class App {
    public static void main(String... args) {
        System.out.println("SECRET: " + Base64.getEncoder().encodeToString(MacProvider.generateKey(SignatureAlgorithm.HS512).getEncoded()));
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println("PASSWORD: " + bCryptPasswordEncoder.encode("example-password"));
    }
}
