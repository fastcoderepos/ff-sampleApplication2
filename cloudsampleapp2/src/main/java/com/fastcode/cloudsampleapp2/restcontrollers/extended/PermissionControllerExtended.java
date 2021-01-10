package com.fastcode.cloudsampleapp2.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.cloudsampleapp2.restcontrollers.core.PermissionController;
import com.fastcode.cloudsampleapp2.application.extended.authorization.permission.IPermissionAppServiceExtended;
import com.fastcode.cloudsampleapp2.application.extended.authorization.rolepermission.IRolepermissionAppServiceExtended;
import com.fastcode.cloudsampleapp2.application.extended.authorization.userpermission.IUserpermissionAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.cloudsampleapp2.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/permission/extended")
public class PermissionControllerExtended extends PermissionController {

		public PermissionControllerExtended(IPermissionAppServiceExtended permissionAppServiceExtended, IRolepermissionAppServiceExtended rolepermissionAppServiceExtended, IUserpermissionAppServiceExtended userpermissionAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		permissionAppServiceExtended,
    	rolepermissionAppServiceExtended,
    	userpermissionAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

