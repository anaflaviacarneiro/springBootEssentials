package br.com.springboot.awesome.util;

import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component // habilita a classe para ser scaneada pelo compomentscan
//@Repository // utilizada no DAO, faz com que as exceções possam ser tratadas pelo spring
//@Service // similar ao service aconselhavel utilizar nas classes da camadas de serviço
public class DateUtil {

    public String formatLocalDateTimeToDatabaseStyle(LocalDateTime localDateTime) {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDateTime);
    }
}
