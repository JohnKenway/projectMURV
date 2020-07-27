package cn.gnnt.chess.module.four.controller;

import cn.gnnt.chess.module.four.dao.IOperationDAO;
import cn.gnnt.chess.module.four.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {

    @Autowired
    private IOperationDAO operationDAO;

    @GetMapping("/query")
    public String query(){
        int maxID = operationDAO.queryMaxID();
        UserVO user = operationDAO.query(maxID);
        if(user == null){
            return "query user["+maxID+"] not found";
        }
        return "find user info: "+user.toString();
    }
}
