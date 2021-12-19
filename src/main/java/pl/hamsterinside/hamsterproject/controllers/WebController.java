package pl.hamsterinside.hamsterproject.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    Logger logger = LoggerFactory.getLogger(WebController.class);
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/hamtaro")
    public String hamtaro() {
        String message = "wow";
        return "hamtaro";
    }

    @RequestMapping(value = "/hamtaro", method = RequestMethod.POST, params = "FormSubmit1")
    public String submit(Model model) {
        model.addAttribute("message", "KOKOS");
        logger.info("Submit done");
        return "hamtaro";
    }

}

