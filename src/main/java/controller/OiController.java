package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OiController {

    private static final Logger logger = LoggerFactory.getLogger(OiController.class);

    @GetMapping("/")
    public String helloMessage() {
        logger.info("Olá Mundo!");  // Isso vai logar a mensagem.
        return "Olá Mundo!";
    }
}
