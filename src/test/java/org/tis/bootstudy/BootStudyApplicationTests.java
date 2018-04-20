package org.tis.bootstudy;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class) // 测试运行器
@SpringBootTest // 设置测试参数，不指定使用默认
public class BootStudyApplicationTests {

	@Autowired
	WebApplicationContext context;

	protected MockMvc mvc;

	@Before
	public void setUp() throws Exception {
//        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
		mvc = MockMvcBuilders.webAppContextSetup(context).build();
	}



}
