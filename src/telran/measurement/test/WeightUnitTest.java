package telran.measurement.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.measurement.WeightUnit;
import telran.measurement.*;
class WeightUnitTest {
	@Test
	void convertTest() {
		assertEquals(10, WeightUnit.GR.convert(WeightUnit.KG, 10_000));
		assertEquals(453_592, WeightUnit.LBS.convert(WeightUnit.GR, 1000));
	}

}
