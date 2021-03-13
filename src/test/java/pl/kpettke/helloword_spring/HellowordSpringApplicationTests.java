package pl.kpettke.helloword_spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
class HellowordSpringApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnDefaultMessage() {

        HellowordSpringApplication hellowordSpringApplication = new HellowordSpringApplication();
        String result = hellowordSpringApplication.get();
        assertEquals(result, "Hello World");

       // this.mockMvc.perform(get("/")).andDo(print()).andExpect(content().string("Hello Wordl"));

    }

    

}
