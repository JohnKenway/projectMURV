package cn.gnnt.chess.module.four.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class TemplateConfig {
    @Bean(name="myJdbcTemplate")
    public JdbcTemplate jdbcTemplate(@Qualifier("myDataSource")DataSource dataSource){
        System.out.println(dataSource.getClass().getName());
        return new JdbcTemplate(dataSource);
    }
}
