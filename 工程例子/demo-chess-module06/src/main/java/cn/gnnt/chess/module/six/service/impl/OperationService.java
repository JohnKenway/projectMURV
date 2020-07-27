package cn.gnnt.chess.module.six.service.impl;

import cn.gnnt.chess.module.six.dao.IOperationDAO;
import cn.gnnt.chess.module.six.service.IOperationService;
import cn.gnnt.chess.module.six.service.transaction.IOperationTransaction;
import cn.gnnt.chess.module.six.util.OperationUtil;
import cn.gnnt.chess.module.six.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("operationService")
public class OperationService implements IOperationService {
    @Autowired
    @Qualifier("financeOperationDAO")
    private IOperationDAO operationDAO;

    @Autowired
    @Qualifier("operationTransaction")
    private IOperationTransaction operationTransaction;

    public void addDAO(UserVO user){
        operationDAO.add(user);
    }

    public void addTransaction(UserVO user){
        operationTransaction.add(user);
    }

    public void addDAOException (UserVO user) throws Exception{
        operationDAO.addException(user);
    }

    public void addTransactionException (UserVO user) throws Exception{
        operationTransaction.addException(user);
    }

    public void addTransactionDAOException (UserVO user) throws Exception{
        operationTransaction.addDAOException(user);
    }

    public void addException (UserVO user) throws Exception{
        operationTransaction.add(user);
        throw OperationUtil.genException();
    }
}
