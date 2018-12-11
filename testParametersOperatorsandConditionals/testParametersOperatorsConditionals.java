package testParametersOperatorsandConditionals;

import static org.junit.Assert.*;

import org.junit.Test;

import parametersOperatorsandConditionals.ParametersOperators;


public class testParametersOperatorsConditionals {

		@Test
		public void testSum() {
		int Sum = ParametersOperators.multiply(40, 40, true);
		assertEquals("Isn't 1600", 1600, Sum );

	
	}

}