package cn.gnnt.chess.module.six.controller;


import cn.gnnt.chess.module.six.dao.IOperationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryMaxIDController {

    @Autowired
    @Qualifier("financeOperationDAO")
    private IOperationDAO financeOperationDAO;

    @Autowired
    @Qualifier("tradeOperationDAO")
    private IOperationDAO tradeOperationDAO;

    @GetMapping("/financeQueryMaxID")
    public String financeQueryMaxID(){
        return "financeMaxID:"+financeOperationDAO.queryMaxID();
    }

    @GetMapping("/tradeQueryMaxID")
    public String tradeQueryMaxID(){
        return "tradeMaxID:"+tradeOperationDAO.queryMaxID();
    }
}
