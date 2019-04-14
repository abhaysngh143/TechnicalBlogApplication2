package TechnicalBlogApplication.Controller;

import TechnicalBlogApplication.model.Post;
import TechnicalBlogApplication.service.PostService;
import org.sprinframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;



import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    public HomeController() {
        System.out.println("*** HomeController ***")
    }

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String getAllPosts(Model model) {

        ArrayList<Post> posts = postService.getAllPosts();

        model.addAttribute("posts", posts);

        return "index";

    }

}



