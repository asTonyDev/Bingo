package it.utility.generator.username;

import com.github.javafaker.Faker;

public class UserGeneratorUtils {
	
	public static void name() {
		System.out.println(faker.name().username());
	}
	private static Faker faker = new Faker();
}
