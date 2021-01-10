package com.fastcode.cloudsampleapp2.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.cloudsampleapp2.restcontrollers.core.FilmCategoryController;
import com.fastcode.cloudsampleapp2.application.extended.filmcategory.IFilmCategoryAppServiceExtended;
import com.fastcode.cloudsampleapp2.application.extended.category.ICategoryAppServiceExtended;
import com.fastcode.cloudsampleapp2.application.extended.film.IFilmAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.cloudsampleapp2.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/filmCategory/extended")
public class FilmCategoryControllerExtended extends FilmCategoryController {

		public FilmCategoryControllerExtended(IFilmCategoryAppServiceExtended filmCategoryAppServiceExtended, ICategoryAppServiceExtended categoryAppServiceExtended, IFilmAppServiceExtended filmAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		filmCategoryAppServiceExtended,
    	categoryAppServiceExtended,
    	filmAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

