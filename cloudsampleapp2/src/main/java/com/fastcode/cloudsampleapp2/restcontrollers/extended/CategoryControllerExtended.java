package com.fastcode.cloudsampleapp2.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.cloudsampleapp2.restcontrollers.core.CategoryController;
import com.fastcode.cloudsampleapp2.application.extended.category.ICategoryAppServiceExtended;
import com.fastcode.cloudsampleapp2.application.extended.filmcategory.IFilmCategoryAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.cloudsampleapp2.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/category/extended")
public class CategoryControllerExtended extends CategoryController {

		public CategoryControllerExtended(ICategoryAppServiceExtended categoryAppServiceExtended, IFilmCategoryAppServiceExtended filmCategoryAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		categoryAppServiceExtended,
    	filmCategoryAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

