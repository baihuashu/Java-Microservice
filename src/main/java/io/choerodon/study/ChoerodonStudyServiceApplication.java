package io.choerodon.study;

import io.choerodon.resource.annoation.EnableChoerodonResourceServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// 是否允许注册到注册中心，暂时注释掉
@EnableEurekaClient
// 是否开启猪齿鱼资源服务器
@EnableChoerodonResourceServer
// 开启feign
@EnableFeignClients
@RestController
public class ChoerodonStudyServiceApplication {

    public static void main( String[] args ) {
        SpringApplication.run(ChoerodonStudyServiceApplication.class, args);
    }
//    @GetMapping
//    @Permission(permissionPublic = true)
//    @ApiOperation(value = "demo")
//    public ResponseEntity<String> hello() {
//        return new ResponseEntity<String>("hello world.", HttpStatus.OK);
//    }
//
//    @Bean
//    public RestTemplate getRestTemplate(){
//        return new RestTemplate();
//    }

}
