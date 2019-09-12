package com.binhan.center.tech;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource("classpath:application_test.properties")
public class WebApiTest {
    @LocalServerPort public int port;

    String getBaseUrl() {
        return "http://localhost:" + port;
    }

    String convert(InputStream inputStream, Charset charset) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        String line;

        try (BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(inputStream, charset))) {
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
        }

        return stringBuilder.toString();
    }

    @Test
    public void temp() {}
}
