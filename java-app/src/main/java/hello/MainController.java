package hello;
import org.springframework.web.bind.annotation.*;


@RestController    // This means that this class is a Controller
@RequestMapping(path="/") // This means URL's start with /demo (after Application path)
public class MainController {

	@GetMapping(path="/")
	public String listFamily () {
		return "Hello This is java application!";
	}
}
