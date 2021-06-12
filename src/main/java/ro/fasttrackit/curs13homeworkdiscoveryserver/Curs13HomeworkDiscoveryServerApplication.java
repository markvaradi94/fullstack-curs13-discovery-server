package ro.fasttrackit.curs13homeworkdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Curs13HomeworkDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Curs13HomeworkDiscoveryServerApplication.class, args);
    }

}
