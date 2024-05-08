package br.com.bs.SpringBootExemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExemploApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootExemploApplication.class, args);
        System.out.println("Olá Mundo!");
    }
}
