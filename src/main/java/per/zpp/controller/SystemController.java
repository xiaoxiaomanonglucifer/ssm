package per.zpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import per.zpp.Utils.MD5Util;
import per.zpp.domain.Admin;
import per.zpp.domain.ReturnObj;
import per.zpp.service.AdminService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/system")
public class SystemController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "system/login";
    }


    @RequestMapping("/login")
    @ResponseBody
    public Object login(String aUsername, String aPassword, HttpSession session,
                        HttpServletResponse response, String isRem) {
        String Md5password = MD5Util.MD5EncodeUtf8(aPassword);
        ReturnObj returnObj = new ReturnObj();
        Admin admin = new Admin();
        admin.setaPassword(Md5password);
        admin.setaUsername(aUsername);
        Admin SearchAdmin = adminService.queryByUsernameAndPwd(admin);
        Cookie c1 = null;
        Cookie c2 = null;
        if (SearchAdmin == null) {
            returnObj.setCode("0");
            returnObj.setMessage("系统忙~");
        } else {
            returnObj.setCode("1");
            session.setAttribute("sessionUser", SearchAdmin);
            if (isRem.equals("true")) {
                c1 = new Cookie("username", aUsername);
                c2 = new Cookie("password", aPassword);
                c1.setPath("/system/toLogin");
                c2.setPath("/system/toLogin");
                c1.setMaxAge(60 * 60 * 24 * 10);
                c2.setMaxAge(60 * 60 * 24 * 10);
            } else {
                c1 = new Cookie("username", "1");
                c2 = new Cookie("password", "1");
                c1.setMaxAge(0);
                c2.setMaxAge(0);
            }
            response.addCookie(c1);
            response.addCookie(c2);
        }
        return returnObj;
    }

    @RequestMapping("/toMain")
    public String toMain() {
        return "system/homepage";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session,HttpServletResponse response) {
        //清空cookie
        Cookie c1 = new Cookie("username", "1");
        Cookie c2 = new Cookie("password", "1");
        c1.setMaxAge(0);
        c2.setMaxAge(0);
        response.addCookie(c1);
        response.addCookie(c2);
        session.invalidate();
        return "system/login";
    }
}
