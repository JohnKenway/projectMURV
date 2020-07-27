package cn.gnnt.chess.module.five.controller;

import cn.gnnt.chess.module.five.dao.IFinanceOperationDAO;
import cn.gnnt.chess.module.five.dao.ITradeOperationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryMaxIDController {

    @Autowired
    @Qualifier("financeOperationDAO")
    private IFinanceOperationDAO financeOperationDAO;

    @Autowired
    @Qualifier("tradeOperationDAO")
    private ITradeOperationDAO tradeOperationDAO;

    @GetMapping("/financeQueryMaxID")
    public String fubabceQueryMaxID(){
        return "financeMaxID:"+financeOperationDAO.queryMaxID();
    }

    @GetMapping("/tradeQueryMaxID")
    public String tradeQueryMaxID(){
        return "tradeMaxID:"+tradeOperationDAO.queryMaxID();
    }
}
