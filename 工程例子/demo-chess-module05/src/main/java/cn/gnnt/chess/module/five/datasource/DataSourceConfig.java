package cn.gnnt.chess.module.five.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Value("${spring.datasource.trade.type}")
    private String tradeType;

    @Value("${spring.datasource.finance.type}")
    private String financeType;

    @Bean(name="tradeDataSource")
    @ConfigurationProperties(prefix="spring.datasource.trade")
    public DataSource tradeDataSource(){
        DataSource result = null;
        try {
            result = DataSourceBuilder.create().type(((Class<DataSource>)Class.forName(tradeType))).build();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @Bean(name="financeDataSource")
    @ConfigurationProperties(prefix="spring.datasource.finance")
    public DataSource financeDataSource(){
        DataSource result = null;
        try {
            result = DataSourceBuilder.create().type(((Class<DataSource>)Class.forName(financeType))).build();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
