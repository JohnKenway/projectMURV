package cn.gnnt.chess.module.six.datasource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class TemplateConfig {

    @Bean(name="tradeJdbcTemplate")
    public JdbcTemplate tradeJdbcTemplate(@Qualifier("tradeDataSource")DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean(name="financeJdbcTemplate")
    public JdbcTemplate financeJdbcTemplate(@Qualifier("financeDataSource")DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
