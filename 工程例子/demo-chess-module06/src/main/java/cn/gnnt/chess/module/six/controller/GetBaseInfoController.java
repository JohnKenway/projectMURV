package cn.gnnt.chess.module.six.controller;

import cn.gnnt.chess.module.six.config.RMIConfig;
import cn.gnnt.chess.module.six.config.SocketConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetBaseInfoController {
    @Autowired
    private RMIConfig rmiConfig;

    @Autowired
    private SocketConfig socketConfig;

    @GetMapping("/getbaseinfo")
    public String getBaseInfo(){
        String result = "rmi.ip["+rmiConfig.getIp()+"]rmi.port["+rmiConfig.getPort()+"]rmi.serviceName["+rmiConfig.getServiceName()+"]";
        result += "socket.ip["+socketConfig.getIp()+"]socket.port["+socketConfig.getPort()+"]socket.serviceName["+socketConfig.getServiceName()+"]";
        return result;
    }
}
