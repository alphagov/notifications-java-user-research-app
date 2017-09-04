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
        model.addAttribute("address", new Address());
        return "index";
    }

    @PostMapping("/")
    public String postIndex(@ModelAttribute Address address) {
        System.out.println("post");
        System.out.println(address.toString());
        return (
            "redirect:/result?name=" + address.getName() +
            "&streetAddress=" + address.getStreetAddress() +
            "&county=" + address.getCounty() +
            "&town=" + address.getTown() +
            "&postcode=" + address.getPostcode()
        );
    }

    @GetMapping("/result")
    public String result(@ModelAttribute Address address) {
        return "result";
    }
}
