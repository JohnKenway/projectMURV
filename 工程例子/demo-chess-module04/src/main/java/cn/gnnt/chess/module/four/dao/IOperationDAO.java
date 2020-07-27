package cn.gnnt.chess.module.four.dao;

import cn.gnnt.chess.module.four.vo.UserVO;

public interface IOperationDAO {
    public void add(UserVO user);

    public void addException (UserVO user) throws Exception;

    public UserVO query(int id);

    public int queryMaxID();
}
