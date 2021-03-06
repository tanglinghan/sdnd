package top.b0x0.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import top.b0x0.admin.common.util.EnvUtils;
import top.b0x0.admin.common.util.spring.SpringContextHolder;
import top.b0x0.admin.consumer.entity.Demo2;

/**
 * @author musui
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        String ossActive = EnvUtils.getOssActive();
        System.out.println("ossActive = " + ossActive);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public SpringContextHolder springContextHolder() {
        return new SpringContextHolder();
    }

    @Bean(name = "testDemo")
    public Demo2 generateDemo() {
        Demo2 demo = new Demo2();
        demo.setId(12345);
        demo.setName("test");
        demo.setUrlName("测试图片");
        demo.setIdCardFrontUrl("https://gimg2.baidu.com/image_search/2F30%2F29%2F01300000201438121627296084016.jpg");
        demo.setIdCardObverseUrl("https://gimg2.baidu.com/image_search/2F30%2F29%2F01300000201438121627296084016.jpg");
        return demo;
    }
}
