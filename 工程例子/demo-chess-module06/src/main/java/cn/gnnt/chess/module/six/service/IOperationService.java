package cn.gnnt.chess.module.six.service;

import cn.gnnt.chess.module.six.vo.UserVO;

public interface IOperationService {
    public void addDAO(UserVO user);

    public void addTransaction(UserVO user);

    public void addDAOException(UserVO user) throws Exception;

    public void addTransactionException(UserVO user) throws Exception;

    public void addTransactionDAOException(UserVO user) throws Exception;

    public void addException(UserVO user) throws Exception;
}
