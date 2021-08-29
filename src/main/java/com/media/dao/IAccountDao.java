package com.media.dao;

import com.media.entity.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 账户的持久层接口
 */
public interface IAccountDao {

    /**
     * 查询出所有账户
     *
     * @return 所有账户信息
     */
    @Select("select * from account")
    List<Account> findAll();

    /**
     * 根据key查询账户
     *
     * @param id 账户id
     * @return 账户信息
     */
    @Select("select * from account where id=#{id}")
    Account findById(Integer id);

    /**
     * 添加账户
     *
     * @param account 账户
     */
    @Insert("insert into account(email, password, petName) values(#{email}, #{password}, #{petName} )")
    void addAccount(Account account);

    /**
     * 查询出所有账户
     *
     * @param id 账户id
     */
    @Delete("delete from account where id=#{id}")
    void delAccountById(Integer id);
}
