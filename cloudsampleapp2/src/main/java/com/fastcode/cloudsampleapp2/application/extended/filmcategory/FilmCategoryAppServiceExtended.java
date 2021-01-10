package com.fastcode.cloudsampleapp2.application.extended.filmcategory;

import org.springframework.stereotype.Service;
import com.fastcode.cloudsampleapp2.application.core.filmcategory.FilmCategoryAppService;

import com.fastcode.cloudsampleapp2.domain.extended.filmcategory.IFilmCategoryRepositoryExtended;
import com.fastcode.cloudsampleapp2.domain.extended.category.ICategoryRepositoryExtended;
import com.fastcode.cloudsampleapp2.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.cloudsampleapp2.commons.logging.LoggingHelper;

@Service("filmCategoryAppServiceExtended")
public class FilmCategoryAppServiceExtended extends FilmCategoryAppService implements IFilmCategoryAppServiceExtended {

	public FilmCategoryAppServiceExtended(IFilmCategoryRepositoryExtended filmCategoryRepositoryExtended,
				ICategoryRepositoryExtended categoryRepositoryExtended,IFilmRepositoryExtended filmRepositoryExtended,IFilmCategoryMapperExtended mapper,LoggingHelper logHelper) {

		super(filmCategoryRepositoryExtended,
		categoryRepositoryExtended,filmRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

