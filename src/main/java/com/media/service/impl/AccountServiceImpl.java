package com.media.service.impl;

import com.media.entity.Account;
import com.media.service.IAccountService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 账户的业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

   // @Autowired
    //private IAccountDao accountDao;

    public List<Account> findAll() {
        //return accountDao.findAll();
        System.out.println("获取所有账户");
        return new ArrayList<>();
    }

    public Account findById(Integer id) {
       // return accountDao.findById(id);
        return new Account();
    }

    public void addAccount(Account account) {
        //accountDao.addAccount(account);
    }

    public void delAccountById(Integer id) {
       // accountDao.delAccountById(id);
    }
}
