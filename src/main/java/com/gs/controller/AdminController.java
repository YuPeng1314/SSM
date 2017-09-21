package com.gs.controller;

import com.gs.bean.Admin;
import com.gs.bean.ControllerResult;
import com.gs.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/9/8.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    private Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Resource
    private AdminService adminService;

    @GetMapping("reg_page")
    public String regPage() {
        return "admin/reg";
    }

    @PostMapping("reg")
    @ResponseBody
    public String reg(Admin admin) {
        System.out.println(admin.getPhone() + ", " + admin.getPassword());
        adminService.save(admin);
        return "{\"reg\":\"ok\"}";
    }

    @PostMapping("reg1")
    @ResponseBody
    public ControllerResult reg1(Admin admin) {
        System.out.println(admin.getPhone() + ", " + admin.getPassword());
        adminService.save(admin);
        return ControllerResult.getSuccessResult("注册成功");
    }
/*
    @PostMapping("save")
    @ResponseBody
    public ControllerResult save(Admin admin) {
        System.out.println(admin.getId()+ ", " +admin.getPhone() + ", " + admin.getPassword()+", " + admin.getGender()+", " + admin.getAddress());
        admin.setPhone("18888888888");
        admin.setPassword("123456");
        admin.setGender(1);
        admin.setAddress("北京");
        adminService.save(admin);
        return ControllerResult.getSuccessResult("新增成功！");
    }
*/
    @GetMapping("phone/{phone}")
    @ResponseBody
    public Admin getByPhone(@PathVariable("phone") String phone) {
        return adminService.getByPhone(phone);
    }

    @GetMapping("updateByPhone")
    @ResponseBody
    public Admin updateByPhone() {
        String phone = "17607975702";
        Admin admin = new Admin();
        admin.setPhone("18888888888");
        admin.setPassword("654321");
        adminService.updateByPhone(phone, admin);
        return admin;
    }

    @GetMapping("update")
    @ResponseBody
    public Admin update() {
        Admin admin = new Admin();
        admin.setId(1);
        admin.setPhone("13666666666");
        adminService.update(admin);
        return admin;
    }

    @GetMapping("del/{id}")
    @ResponseBody
    public int remove(@PathVariable("id") Integer id) {
        adminService.removeById(id);
        return id;
    }

    @GetMapping("query")
    @ResponseBody
    public List<Admin> query() {
        logger.info("admin query");
       /*
        logger.info();
        logger.error();
        logger.trace();
        logger.warn();
        logger.debug();
        */
        return adminService.queryByCriteria("17721221221", 1, "广东");
    }

    /**
     * 初始化绑定
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        /**
         * 注册自定义编辑器
         */
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

}
