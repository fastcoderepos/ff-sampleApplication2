package com.fastcode.cloudsampleapp2.application.extended.filmactor;

import org.springframework.stereotype.Service;
import com.fastcode.cloudsampleapp2.application.core.filmactor.FilmActorAppService;

import com.fastcode.cloudsampleapp2.domain.extended.filmactor.IFilmActorRepositoryExtended;
import com.fastcode.cloudsampleapp2.domain.extended.actor.IActorRepositoryExtended;
import com.fastcode.cloudsampleapp2.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.cloudsampleapp2.commons.logging.LoggingHelper;

@Service("filmActorAppServiceExtended")
public class FilmActorAppServiceExtended extends FilmActorAppService implements IFilmActorAppServiceExtended {

	public FilmActorAppServiceExtended(IFilmActorRepositoryExtended filmActorRepositoryExtended,
				IActorRepositoryExtended actorRepositoryExtended,IFilmRepositoryExtended filmRepositoryExtended,IFilmActorMapperExtended mapper,LoggingHelper logHelper) {

		super(filmActorRepositoryExtended,
		actorRepositoryExtended,filmRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

