package com.gs.controller;

import com.gs.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/9/7.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("login_Page")
    public String loginPage() {
        return "login";
    }

    @PostMapping("login")
    public String login(@RequestParam("name") String name, @RequestParam("password") String password) {
        System.out.println("name: " + name + ", password: " + password);
        return "login";
    }
    @PostMapping("login1")
    public String login1(String name,String password){
        System.out.println("name: " + name + ", password: " + password);
        return  "login";
    }
    @PostMapping("login2")
    public ModelAndView login2(User user,HttpSession session) {
        System.out.println("name: " + user.getName() + ", password: " + user.getPassword());
        if ("test".equals(user.getName()) && "123456".equals(user.getPassword())) {
            ModelAndView mav = new ModelAndView("home");
             // mav.addObject底层代码是把数据放到了request中，request.setAttribute()
            //mav.addObject("name", user.getName()); // 跟request，session几乎一致
            session.setAttribute("login_user", user.getName());
            return mav;
        }
        return new ModelAndView("login");
    }

        @GetMapping("login3")
        public ModelAndView login3(User user){
            System.out.println("name:"+user.getName()+",password:"+user.getPassword());
            if ("test".equals(user.getName())&&"123456".equals(user.getPassword())){
                ModelAndView mav1=new ModelAndView("home");
                mav1.addObject("name",user.getName());
                return mav1;
            }
        return new ModelAndView("login");
        }


    @GetMapping("del")
    public String delete(String id){
        System.out.println(id);
        return "login";
    }
    @GetMapping("remove/{id}")
    public String remove(@PathVariable("id") String id) {
        System.out.println(id);
        return "login";
    }

    @GetMapping("remove1/{id}")
    public  String remove1(@PathVariable("id") String id){
        System.out.println(id);
        return "login";
    }


    @GetMapping("request")
    public String request(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        System.out.println(request.getParameter("id"));
        session.setAttribute("key", "value");
        System.out.println(session.getAttribute("key"));
        return "login";
    }

    @GetMapping("request1")
    public String request1(HttpServletResponse response,HttpServletRequest request,HttpSession session){
        System.out.println(request.getParameter("id"));
        session.setAttribute("key","value");
        System.out.println(session.getAttribute("key"));
        return "login";
    }
    @GetMapping("request2")
    public String request2(HttpServletResponse response,HttpServletRequest request,HttpSession session){
        System.out.println(request.getParameter("id"));
        session.setAttribute("key","value");
        System.out.println(session.getAttribute("key"));
        return "login";
    }

    @GetMapping("cookie")
    public String cookie(HttpServletResponse response) {
        response.addCookie(new Cookie("cookie_name", "cookie_value"));
        return "login";
    }
    @GetMapping("mycookie")
    public String mycookie(HttpServletResponse response){
        response.addCookie(new Cookie("cookie_name","cookie_value"));
        return "login";
    }

    @GetMapping("cookie1")
    public String cookie1(@CookieValue("cookie_name") String cookieName) {
        System.out.println(cookieName);
        return "login";
    }

    @GetMapping("cookie2")
    public String cookie2(@CookieValue("cookic_name") String cookicName){
        System.out.println(cookicName);
        return "login";
    }

    @GetMapping("header")
    public String header(@RequestHeader("Accept") String accept) {
        System.out.println(accept);
        return "login";
    }

    @GetMapping("header1")
    public String header1(@RequestHeader("Accept") String accept){
        System.out.println(accept);
        return "login";
    }
}
