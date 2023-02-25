package io.javabrains.springbootconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {


    @Autowired
    private DBConfig dbConfig;
    @Autowired
    private  Environment environment;

    @Value("${info.url}")
    String githubDescription;

    @Value("${foo}")
    String name;


    @GetMapping("/fetch")
    public String fetch(){
//        System.out.println("We are reading data from properties file " + dbConfig.getName() + dbConfig.getUrl() +  dbConfig.getPort());
//
//            return "hello world from DEV";

//        return  dbConfig.getName() + "\n"+ dbConfig.getUrl() +"\n"+  dbConfig.getPort();

//        return githubDescription;

        return name;

//        if(environment.getActiveProfiles() == "dev"){
//            resttemplate ("localhost:8081/dev" );
//        }else if(environment.getActiveProfiles() == "qa"){
//            resttemplate ("localhost:8081/qa" );
//        }

//        return environment.toString();
    }

}