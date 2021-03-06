package com.example.springbootgettingstarted.sample;

import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlHeading1;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureRule;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
public class SampleControllerTest {

    @MockBean
    SampleService mockSampleService;
    @Rule
    public OutputCaptureRule outputCaptureRule = new OutputCaptureRule();

//    @Autowired
//    MockMvc mockMvc;
    @Autowired
    WebClient webClient; //html 전용 htmlUnit
    @Autowired
    MockMvc mockMvc;
    @Test
    public void htmlUnitTest() throws Exception {
        mockMvc.perform(get("/htmlUnitTest"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$._links.self").exists());
    }

    @Test
    public void hello() throws Exception {
        HtmlPage page = webClient.getPage("/hello");
        HtmlHeading1 h1 = page.getFirstByXPath("//h1");
        assertThat(h1.getTextContent()).isEqualToIgnoringCase("keesun");

        // 요청 "/"
        // 응답
        // - 모델 name : keesun
        // - 뷰 이름 : hello

//        mockMvc.perform(get("/hello"))
//                .andExpect(status().isOk())
//                .andDo(print())
//                .andExpect(view().name("hello"))
//                .andExpect(model().attribute("name",is("keesun")))
//                .andExpect(content().string(containsString("keesun")));



//        when(mockSampleService.getName()).thenReturn("whiteship");
//        mockMvc.perform(get("/hello"))
//                .andExpect(content().string("hello whiteship"));
//        assertThat(outputCaptureRule.toString()).contains("test");
    }
}