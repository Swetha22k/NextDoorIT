package com.inn.nextDoorIt.restImpl;

import com.inn.nextDoorIt.constants.NextDoorItConstants;
import com.inn.nextDoorIt.rest.UserRest;
import com.inn.nextDoorIt.service.UserService;
import com.inn.nextDoorIt.utils.NextDoorItUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {

    @Autowired
    UserService userService;
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try{
            return userService.signUp(requestMap);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return NextDoorItUtils.getResponseEntity(NextDoorItConstants.wrong, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
