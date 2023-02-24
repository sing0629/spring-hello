package com.javaguides.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.*;
import java.util.stream.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Month;
import java.time.Duration;
import java.time.ZoneOffset;
import java.util.function. Predicate;
@SpringBootApplication

public class FirstAppApplication {
		public static void main (String [] args ) {
		System. out.println ("handle requestl");
//call method to handle first request request Thread.wait (10000 ;
		System. out.println ("handle request2");
//call method to handle second request
		SpringApplication.run(FirstAppApplication.class, args);

	}
}
