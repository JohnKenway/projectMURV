package cn.gnnt.chess.module.four.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Value("${spring.datasource.druid.type}")
    private String type;

    @Bean(name="myDataSource")
    @ConfigurationProperties(prefix="spring.datasource.druid")
    public DataSource dataSource(){
        DataSource result = null;
        try {
            result = DataSourceBuilder.create().type(((Class<DataSource>)Class.forName(type))).build();
//            result = DataSourceBuilder.create().build();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
