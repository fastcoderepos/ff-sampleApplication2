package com.fastcode.cloudsampleapp2.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.cloudsampleapp2.restcontrollers.core.RoleController;
import com.fastcode.cloudsampleapp2.application.extended.authorization.role.IRoleAppServiceExtended;
import com.fastcode.cloudsampleapp2.application.extended.authorization.rolepermission.IRolepermissionAppServiceExtended;
import com.fastcode.cloudsampleapp2.application.extended.authorization.userrole.IUserroleAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.cloudsampleapp2.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/role/extended")
public class RoleControllerExtended extends RoleController {

		public RoleControllerExtended(IRoleAppServiceExtended roleAppServiceExtended, IRolepermissionAppServiceExtended rolepermissionAppServiceExtended, IUserroleAppServiceExtended userroleAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		roleAppServiceExtended,
    	rolepermissionAppServiceExtended,
    	userroleAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

