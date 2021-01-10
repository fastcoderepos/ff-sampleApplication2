package com.fastcode.cloudsampleapp2.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.cloudsampleapp2.restcontrollers.core.UserpermissionController;
import com.fastcode.cloudsampleapp2.application.extended.authorization.userpermission.IUserpermissionAppServiceExtended;
import com.fastcode.cloudsampleapp2.application.extended.authorization.permission.IPermissionAppServiceExtended;
import com.fastcode.cloudsampleapp2.application.extended.authorization.user.IUserAppServiceExtended;
import com.fastcode.cloudsampleapp2.security.JWTAppService;
import org.springframework.core.env.Environment;
import com.fastcode.cloudsampleapp2.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/userpermission/extended")
public class UserpermissionControllerExtended extends UserpermissionController {

		public UserpermissionControllerExtended(IUserpermissionAppServiceExtended userpermissionAppServiceExtended, IPermissionAppServiceExtended permissionAppServiceExtended, IUserAppServiceExtended userAppServiceExtended,
	    JWTAppService jwtAppService, LoggingHelper helper, Environment env) {
		super(
		userpermissionAppServiceExtended,
    	permissionAppServiceExtended,
    	userAppServiceExtended,
	    jwtAppService,
		helper, env);
	}

	//Add your custom code here

}

