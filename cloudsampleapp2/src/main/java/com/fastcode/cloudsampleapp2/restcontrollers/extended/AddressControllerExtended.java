package com.fastcode.cloudsampleapp2.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.cloudsampleapp2.restcontrollers.core.AddressController;
import com.fastcode.cloudsampleapp2.application.extended.address.IAddressAppServiceExtended;
import com.fastcode.cloudsampleapp2.application.extended.city.ICityAppServiceExtended;
import com.fastcode.cloudsampleapp2.application.extended.customer.ICustomerAppServiceExtended;
import com.fastcode.cloudsampleapp2.application.extended.staff.IStaffAppServiceExtended;
import com.fastcode.cloudsampleapp2.application.extended.store.IStoreAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.cloudsampleapp2.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/address/extended")
public class AddressControllerExtended extends AddressController {

		public AddressControllerExtended(IAddressAppServiceExtended addressAppServiceExtended, ICityAppServiceExtended cityAppServiceExtended, ICustomerAppServiceExtended customerAppServiceExtended, IStaffAppServiceExtended staffAppServiceExtended, IStoreAppServiceExtended storeAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		addressAppServiceExtended,
    	cityAppServiceExtended,
    	customerAppServiceExtended,
    	staffAppServiceExtended,
    	storeAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

