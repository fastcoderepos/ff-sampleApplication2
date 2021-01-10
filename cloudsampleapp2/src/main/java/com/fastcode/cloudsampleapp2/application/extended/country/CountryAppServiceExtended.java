package com.fastcode.cloudsampleapp2.application.extended.country;

import org.springframework.stereotype.Service;
import com.fastcode.cloudsampleapp2.application.core.country.CountryAppService;

import com.fastcode.cloudsampleapp2.domain.extended.country.ICountryRepositoryExtended;
import com.fastcode.cloudsampleapp2.commons.logging.LoggingHelper;

@Service("countryAppServiceExtended")
public class CountryAppServiceExtended extends CountryAppService implements ICountryAppServiceExtended {

	public CountryAppServiceExtended(ICountryRepositoryExtended countryRepositoryExtended,
				ICountryMapperExtended mapper,LoggingHelper logHelper) {

		super(countryRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

