package notify;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("phoneNumber", new PhoneNumber());
        return "index";
    }

    @PostMapping("/")
    public String postIndex(@ModelAttribute PhoneNumber phoneNumber) {
        System.out.println(phoneNumber.getPhoneNumber());
        return "redirect:/result?phoneNumber=" + phoneNumber.getPhoneNumber();
    }

    @GetMapping("/result")
    public String result(@ModelAttribute PhoneNumber phoneNumber) {
        System.out.println(phoneNumber.getPhoneNumber());
        return "result";
    }

}
