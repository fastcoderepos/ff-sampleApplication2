package com.fastcode.cloudsampleapp2.application.extended.film;

import org.springframework.stereotype.Service;
import com.fastcode.cloudsampleapp2.application.core.film.FilmAppService;

import com.fastcode.cloudsampleapp2.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.cloudsampleapp2.domain.extended.language.ILanguageRepositoryExtended;
import com.fastcode.cloudsampleapp2.commons.logging.LoggingHelper;

@Service("filmAppServiceExtended")
public class FilmAppServiceExtended extends FilmAppService implements IFilmAppServiceExtended {

	public FilmAppServiceExtended(IFilmRepositoryExtended filmRepositoryExtended,
				ILanguageRepositoryExtended languageRepositoryExtended,IFilmMapperExtended mapper,LoggingHelper logHelper) {

		super(filmRepositoryExtended,
		languageRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

