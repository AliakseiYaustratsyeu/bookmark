package by.gomel.bookmark.service.profile;

import org.springframework.beans.factory.annotation.Autowired;

import by.gomel.bookmark.model.user.User;
import by.gomel.bookmark.service.user.UserService;



public class UserProfileServiceImpl implements UserProfileService {
    @Autowired
    private UserService userService;
    
    @Override
    public UserProfileService getUserProfile(Long userId) {
       // User user = userService.getUser(userId);
        
        return null;
    }

}
