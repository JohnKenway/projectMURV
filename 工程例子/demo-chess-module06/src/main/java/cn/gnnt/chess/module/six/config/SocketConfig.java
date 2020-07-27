package cn.gnnt.chess.module.six.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration("socketConfig")
@ConfigurationProperties(prefix = "socket")
@PropertySource(value="classpath:/config/baseinfo.properties",ignoreResourceNotFound=false,encoding="UTF-8")
public class SocketConfig {
    private String ip;

    private int port;

    private String serviceName;

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
