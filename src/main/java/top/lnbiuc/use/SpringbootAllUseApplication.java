package top.lnbiuc.use;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.lnbiuc.use.mapper")
public class SpringbootAllUseApplication
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootAllUseApplication.class, args);
    }
    
}