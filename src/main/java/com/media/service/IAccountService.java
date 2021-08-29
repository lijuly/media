package com.media.service;

import com.media.entity.Account;

import java.util.List;

/**
 * 账户业务层的接口
 */
public interface IAccountService {

    /**
     * 查询出所有账户
     *
     * @return 所有账户信息
     */
    List<Account> findAll();

    /**
     * 根据key查询账户
     *
     * @param id 账户id
     * @return 账户信息
     */
    Account findById(Integer id);

    /**
     * 添加账户
     *
     * @param account 账户
     */
    void addAccount(Account account);

    /**
     * 查询出所有账户
     *
     * @param id 账户id
     */
    void delAccountById(Integer id);
}
