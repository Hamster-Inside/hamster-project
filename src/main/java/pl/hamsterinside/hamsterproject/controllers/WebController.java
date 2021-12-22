package pl.hamsterinside.hamsterproject.controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller

public class WebController implements WebMvcConfigurer {

    boolean doOnce = true;
    private static final Logger logger = LoggerFactory.getLogger(WebController.class);

    @GetMapping(value = "/index")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/hamtaro")
    public String hamtaro() { return "hamtaro"; }

    @GetMapping(value = "/dino")
    public String dino() { return "dino"; }

    @RequestMapping(value = "/hamtaro", method = RequestMethod.POST, params = "FormSubmit1")
    public String submit(Model model) {

        if (doOnce) {
            model.addAttribute("message","WOW");
            doOnce = false;
        }
        else {
            model.addAttribute("message", "KOKOS");
            doOnce = true;
        }
        logger.info("Submit done");
        return "hamtaro";
    }


}

