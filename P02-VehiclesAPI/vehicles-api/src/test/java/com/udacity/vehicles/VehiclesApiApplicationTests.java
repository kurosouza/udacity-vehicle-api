package com.udacity.vehicles;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.udacity.vehicles.api.CarControllerTest;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CarControllerTest.class})
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
public class VehiclesApiApplicationTests {

    @Test
    public void contextLoads() {
    	Assertions.assertThat(true).isTrue();
    }

}
