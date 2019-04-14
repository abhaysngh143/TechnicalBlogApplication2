package TechnicalBlogApplication.Controller;

import TechnicalBlogApplication.model.Post;
import TechnicalBlogApplication.model.User;
import TechnicalBlogApplication.service.PostService;
import org.sprinframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

@Controller
public class UserController {

    @Autowired
    private PostService postService;


    @RequestMapping("users/login")
    public String login() {
        return "users/login";
    }

    @RequestMapping("users/registration")
    public String registration() {
        return "users/registration";

    }

    @RequestMapping(value = "users/login", method=RequestMethod.POST)
    public String loginUser(User user) {
        if(userService.login(user)) {
            return "redirect:/posts";
        }
        else {
            return "users/login";
        }
    }y

    @RequestMapping(value = "users/registration", method=RequestMethod.POST)
    public String registerUser(User user) {
        return "users/login";
    }

    @RequestMapping(value = "users/logout", method=RequestMethod.POST)
    public String logout(Model model) {
        ArrayList<Post> posts = postService.getAllPosts();

        model.addAttribute("posts", posts);


        return "index";
    }



