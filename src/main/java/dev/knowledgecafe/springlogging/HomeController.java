package dev.knowledgecafe.springlogging;


import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    Logger logger = org.slf4j.LoggerFactory.getLogger(HomeController.class);

    //Create get endpoint for home controller which returns string hello world
    @GetMapping("/home")
    public String home(){
        logger.trace("This is a TRACE level message for demo purpose");
        logger.debug("This is a DEBUG level message for demo purpose");
        logger.info("This is an INFO level message for demo purpose");
        logger.warn("This is a WARN level message for demo purpose");
        logger.error("This is an ERROR level message for demo purpose");
        return "Hello, World";
    }
}
