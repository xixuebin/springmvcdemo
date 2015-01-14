package com.springapp.mvc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yeahmobi53 on 2015/1/14.
 *
 */
@Controller
@RequestMapping("auth")
public class LoginLogoutController {

    private   static Log logger = LogFactory.getLog(LoginLogoutController.class);

    /**
     * 指向登录页面
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginPage(
            @RequestParam(value = "error", required = false) boolean error,
            ModelMap model) {

        logger.debug("Received request to show login page");

        if (error) {
            // Assign an error message
            model.put("error",
                    "You have entered an invalid username or password!");
        } else {
            model.put("error", "");
        }
        return "loginpage";

    }

    /**
     * 指定无访问额权限页面
     *
     * @return String
     */
    @RequestMapping(value = "/denied", method = RequestMethod.GET)
    public String getDeniedPage() {

        logger.debug("Received request to show denied page");

        return "deniedpage";

    }
}
