package cn.gnnt.chess.module.four.service.transaction.impl;

import cn.gnnt.chess.module.four.dao.IOperationDAO;
import cn.gnnt.chess.module.four.service.transaction.IOperationTransaction;
import cn.gnnt.chess.module.four.util.OperationUtil;
import cn.gnnt.chess.module.four.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("operationTransaction")
@Transactional(rollbackFor=Throwable.class)
public class OperationTransaction implements IOperationTransaction {
    @Autowired
    private IOperationDAO operationDAO;

    public void add(UserVO user){
        operationDAO.add(user);
    }

    public void addDAOException (UserVO user) throws Exception{
        operationDAO.addException(user);
    }

    public void addException (UserVO user) throws Exception{
        operationDAO.add(user);
        throw OperationUtil.genException();
    }
}
