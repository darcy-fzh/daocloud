package com.example.daocloud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
public class DaocloudApplicationTests {
	@Autowired
	MySvc mySvc;

	@Test
	public void addTest() {
		int res  = mySvc.add(772, 119);
		assert res == 891;
	}

}
