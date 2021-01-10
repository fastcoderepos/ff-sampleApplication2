package com.fastcode.cloudsampleapp2.application.extended.authorization.user;

import org.springframework.stereotype.Service;
import com.fastcode.cloudsampleapp2.application.core.authorization.user.UserAppService;

import com.fastcode.cloudsampleapp2.domain.extended.authorization.user.IUserRepositoryExtended;
import com.fastcode.cloudsampleapp2.domain.core.authorization.userpreference.IUserpreferenceRepository;
import com.fastcode.cloudsampleapp2.commons.logging.LoggingHelper;

@Service("userAppServiceExtended")
public class UserAppServiceExtended extends UserAppService implements IUserAppServiceExtended {

	public UserAppServiceExtended(IUserRepositoryExtended userRepositoryExtended,
				IUserpreferenceRepository userpreferenceRepository,IUserMapperExtended mapper,LoggingHelper logHelper) {

		super(userRepositoryExtended,
		userpreferenceRepository,mapper,logHelper);

	}

 	//Add your custom code here
 
}

