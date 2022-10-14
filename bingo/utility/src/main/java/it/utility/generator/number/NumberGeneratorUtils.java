package it.utility.generator.number;

import java.util.concurrent.ThreadLocalRandom;

public final class NumberGeneratorUtils {
	public static final Integer generateNumber(
			final Integer min,
			final Integer max) {
		return ThreadLocalRandom.
				current().
				nextInt(min, max);
	}
}
