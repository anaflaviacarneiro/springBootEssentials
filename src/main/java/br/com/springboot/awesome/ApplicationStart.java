package br.com.springboot.awesome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@EnableAutoConfiguration //diz para o spring o que precisa configurar baseado nas dependencias
//@ComponentScan // usado junto com @configuration para dizer ao spring para ler os componentes com @component
//@Configuration // faz a configuração usando as classes definidas, além do xml usar classes java
public class ApplicationStart {

    public static void main (String[] args){

        SpringApplication.run(ApplicationStart.class,args);

    }
}
