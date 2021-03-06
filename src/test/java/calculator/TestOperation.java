package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestOperation implements TestInterface {

	private Operation o;
	private Operation o2;
	
	@BeforeEach
	public void setUp() throws Exception {
		List<Expression> params = new ArrayList<>();
		Collections.addAll(params, new MyNumber(3), new MyNumber(4), new MyNumber(5));
		
		List<Expression> params2 = new ArrayList<>();
		Collections.addAll(params2, new MyNumber(5), new MyNumber(4));

		List<Expression> params3 = new ArrayList<>();
		Collections.addAll(params3, new Plus(params), new Minus(params2), new MyNumber(7));
		o = new Divides(params3);
		o2 = new Divides(params3);

	}
	@Test
	public void testEquals() {
		assertEquals(o,o2);
	}

	@Test
	public void testCompute() {
		assertEquals(Integer.valueOf(1), o.compute());
	}

	@Test
	public void testCountDepth() {
		assertEquals(Integer.valueOf(2), o.countDepth());
	}

	@Test
	public void testCountOps() {
		assertEquals(Integer.valueOf(3), o.countOps());
	}

	@Test
	public void testCountNbs() {
		assertEquals(Integer.valueOf(6), o.countNbs());
	}

	@SuppressWarnings("JUnit3StyleTestMethodInJUnit4Class")
	@Disabled
	public void testToString() {
		//test not implemented for this class
	}

}
