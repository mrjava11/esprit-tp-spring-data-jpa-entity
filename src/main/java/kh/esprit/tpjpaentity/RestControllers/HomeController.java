package kh.esprit.tpjpaentity.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kh.esprit.tpjpaentity.entity.User;
import kh.esprit.tpjpaentity.services.Impl.UserService;

@RestController
public class HomeController {

	
	@Autowired
	UserService userService;
	
	@PostMapping("/registration")
	public String createNewUser(@RequestBody User user) {
		
		String msg="";
		User userExists = userService.findUserByUserName(user.getUserName());
		if (userExists != null) {
			msg="There is already a user registered with the user name provided";
		}else {
			userService.saveUser(user);
			msg="OK";
		}
		
		
		return msg;	
		
	}
}
