package com.cn.changgou.service.goods;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;


@SpringBootTest
@AutoConfigureMockMvc
class ChanggouServiceGoodsApplicationTests {

	@Autowired
    private MockMvc mvc;
	
	@Test
	void contextLoads() {
	}
	
	@Test
    public void girlList() throws Exception {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		mvc.perform(MockMvcRequestBuilders.get("/demo/test").params(params ))
                .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("abc"));
    }

}
