package com.gs.dao;

import com.gs.bean.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/9/8.
 */
@Repository
public interface AdminDAO {

    void save(Admin admin);

    Admin getByPhone(String phone);

    void update(Admin admin);

    void updateByPhone(@Param("phone") String phone, @Param("admin") Admin admin);

    void removeById(Integer id);

    List<Admin> queryByCriteria(@Param("phone") String phone,
                                @Param("gender") Integer gender,
                                @Param("address") String address);
}