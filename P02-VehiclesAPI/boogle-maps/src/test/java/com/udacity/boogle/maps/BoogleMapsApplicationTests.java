package com.udacity.boogle.maps;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BoogleMapsApplicationTests.class})
@AutoConfigureJsonTesters
public class BoogleMapsApplicationTests {

	@Test
	public void contextLoads() {
		Assertions.assertThat(true).isTrue();
	}

}
