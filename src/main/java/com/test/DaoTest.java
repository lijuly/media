package com.test;

import com.media.dao.IAccountDao;
import com.media.entity.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DaoTest {

    @Test
    public void findAllTest(){
        try (InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml")){
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
            try (SqlSession session= factory.openSession()) {
                IAccountDao aDao = session.getMapper(IAccountDao.class);
                List<Account> list = aDao.findAll();
                System.out.println(list);
            }
        } catch (IOException e) {

        }

    }

}
