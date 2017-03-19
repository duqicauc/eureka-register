package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by IntelliJ IDEA.
 * User: duqi
 * Date: 2017/3/2
 * Time: 20:02
 */

@EnableEurekaServer //通过@EnableEurekaServer启动一个服务注册中心给其他应用使用
@SpringBootApplication
public class EurekaServiceRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceRegisterApplication.class, args);
    }
}
