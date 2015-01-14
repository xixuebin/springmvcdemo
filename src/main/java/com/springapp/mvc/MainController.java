package com.springapp.mvc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yeahmobi53 on 2015/1/14.
 *
 */

@Controller
@RequestMapping("/main")
public class MainController {
    private  static Log logger = LogFactory.getLog(MainController.class);

    /**
     * 跳转到commonpage页面
     *
     * @return String
     */
    @RequestMapping(value = "/common", method = RequestMethod.GET)
    public String getCommonPage() {
        logger.debug("Received request to show common page");
        return "commonpage";
    }

    /**
     * 跳转到adminpage页面
     *
     * @return string
     */
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getAadminPage() {
        logger.debug("Received request to show admin page");
        return "adminpage";

    }
}
