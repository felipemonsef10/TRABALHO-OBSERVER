package com.pattern.observer;

import com.pattern.observer.model.Estoque;
import com.pattern.observer.model.Gerente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.security.spec.ECParameterSpec;

@SpringBootApplication
public class ObserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObserverApplication.class, args);

		BigDecimal valorInicial = new BigDecimal("11100.00");
		BigDecimal desconto = new BigDecimal("10.00");
		Gerente gerente = new Gerente("Felipe");
		Estoque estoque = new Estoque("Camiseta", valorInicial, desconto);
		estoque.attach(gerente);
		estoque.setValor(valorInicial);
	}
}
