package com.fastcode.cloudsampleapp2.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.cloudsampleapp2.restcontrollers.core.FilmActorController;
import com.fastcode.cloudsampleapp2.application.extended.filmactor.IFilmActorAppServiceExtended;
import com.fastcode.cloudsampleapp2.application.extended.actor.IActorAppServiceExtended;
import com.fastcode.cloudsampleapp2.application.extended.film.IFilmAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.cloudsampleapp2.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/filmActor/extended")
public class FilmActorControllerExtended extends FilmActorController {

		public FilmActorControllerExtended(IFilmActorAppServiceExtended filmActorAppServiceExtended, IActorAppServiceExtended actorAppServiceExtended, IFilmAppServiceExtended filmAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		filmActorAppServiceExtended,
    	actorAppServiceExtended,
    	filmAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

