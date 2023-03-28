package ru.IP_LabWorks.IP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.IP_LabWorks.IP.service.TypeService;

@SpringBootTest
class IpApplicationTests {
	@Autowired
	TypeService Service;

//	@Test
//	void contextLoads() {
//	}

	@Test
	void testIntPlus() {
		final String res = (String) Service.Method1( "100", "10", "int");
		Assertions.assertEquals("110", res);
	}

	@Test
	void testIntMinus() {
		final String res = (String)Service.Method2( "100", "10", "int");
		Assertions.assertEquals("90", res);
	}

	@Test
	void testIntMultiply() {
		final String res = (String)Service.Method3( "100", "10", "int");
		Assertions.assertEquals("1000", res);
	}

	@Test
	void testIntDivision() {
		final String res = (String)Service.Method4( "100", "10", "int");
		Assertions.assertEquals("10", res);
	}

	@Test
	void testStringPlus() {
		final String res = (String)Service.Method1( "abc", "dfe", "str");
		Assertions.assertEquals("abcdfe", res);
	}

	@Test
	void testStringtoUpper() {
		final String res = (String)Service.Method2( "abc", "dfe", "str");
		Assertions.assertEquals("ABCDFE", res);
	}

	@Test
	void testStringtoLower() {
		final String res = (String)Service.Method3( "abc", "dfe", "str");
		Assertions.assertEquals("abcdfe", res);
	}

	@Test
	void testStringStrange() {
		final String res = (String)Service.Method4( "abc", "dfe", "str");
		Assertions.assertEquals("abcDFE", res);
	}

	@Test
	void testDoublePlus() {
		final String res = (String)Service.Method1( "1.01", "2.76", "double");
		Assertions.assertEquals("3.7699999999999996", res);
	}

	@Test
	void testDoubleMinus() {
		final String res = (String)Service.Method2( "1.01", "2.76", "double");
		Assertions.assertEquals("-1.7499999999999998", res);
	}

	@Test
	void testDoubleMyltiply() {
		final String res = (String)Service.Method3( "1.01", "2.76", "double");
		Assertions.assertEquals("2.7876", res);
	}

	@Test
	void testDoubleDivision() {
		final String res = (String)Service.Method4( "1.01", "2.76", "double");
		Assertions.assertEquals("0.36594202898550726", res);
	}
}
