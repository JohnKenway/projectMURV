package cn.gnnt.chess.module.six.service.transaction.impl;

import cn.gnnt.chess.module.six.dao.IOperationDAO;
import cn.gnnt.chess.module.six.service.transaction.IOperationTransaction;
import cn.gnnt.chess.module.six.util.OperationUtil;
import cn.gnnt.chess.module.six.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("operationTransaction")
@Transactional(rollbackFor=Throwable.class)
public class OperationTransaction implements IOperationTransaction {
    @Autowired
    @Qualifier("financeOperationDAO")
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
