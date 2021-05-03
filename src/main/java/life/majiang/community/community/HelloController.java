package life.majiang.community.community;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IDEA.
 *
 * @Auther : GSJ
 * @Data : 2021/05/02/20:19
 * @Description:
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name")String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
