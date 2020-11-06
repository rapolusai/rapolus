package com.rsp.main.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunners implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
        System.out.println("My Runners");
	}

}
