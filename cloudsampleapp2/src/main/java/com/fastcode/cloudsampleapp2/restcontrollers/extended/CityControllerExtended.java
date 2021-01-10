package com.fastcode.cloudsampleapp2.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.cloudsampleapp2.restcontrollers.core.CityController;
import com.fastcode.cloudsampleapp2.application.extended.city.ICityAppServiceExtended;
import com.fastcode.cloudsampleapp2.application.extended.address.IAddressAppServiceExtended;
import com.fastcode.cloudsampleapp2.application.extended.country.ICountryAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.cloudsampleapp2.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/city/extended")
public class CityControllerExtended extends CityController {

		public CityControllerExtended(ICityAppServiceExtended cityAppServiceExtended, IAddressAppServiceExtended addressAppServiceExtended, ICountryAppServiceExtended countryAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		cityAppServiceExtended,
    	addressAppServiceExtended,
    	countryAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

