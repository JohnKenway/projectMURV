package cn.gnnt.chess.module.six.dao;

import cn.gnnt.chess.module.six.vo.UserVO;

public interface IOperationDAO {
    public void add(UserVO user);

    public void addException (UserVO user) throws Exception;

    public UserVO query(int id);

    public int queryMaxID();
}
