package notify;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    @GetMapping("/notifications")
    public String results(Model model) {
        List<String> things = new ArrayList<String>();
        things.add("one");
        things.add("two");
        things.add("three");
        model.addAttribute("things", things);
        return "notifications";
    }

}
