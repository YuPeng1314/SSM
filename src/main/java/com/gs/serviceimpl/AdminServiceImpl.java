package com.gs.serviceimpl;

import com.gs.bean.Admin;
import com.gs.dao.AdminDAO;
import com.gs.manager.CommonBusiness;
import com.gs.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/9/8.
 */
@Service
public class AdminServiceImpl implements AdminService {

    /**
     * @Resource此注解默认按照名称注入，如果没有名称，再按照类型注入
     *
     * @Autowired注解默认按类型注入
     *
     * 如果把注解放在属性上，则破坏了类的封装性，因为使用了Java反射，没有用set方法
     */
    @Resource
    private AdminDAO adminDAO;

    @Resource
    private CommonBusiness commonBusiness;

    public void save(Admin admin) {
        commonBusiness.log();
        adminDAO.save(admin);
    }

    public Admin getByPhone(String phone) {
        return adminDAO.getByPhone(phone);
    }

    public void update(Admin admin) {
        adminDAO.update(admin);
    }

    public void updateByPhone(String phone, Admin admin) {
        adminDAO.updateByPhone(phone, admin);
    }

    public void removeById(Integer id) {
        adminDAO.removeById(id);
    }

    public List<Admin> queryByCriteria(String phone, Integer gender, String address) {
        return adminDAO.queryByCriteria(phone, gender, address);
    }
}
