package com.fastcode.cloudsampleapp2.domain.core.filmactor;

import javax.persistence.*;
import java.time.*;
import com.fastcode.cloudsampleapp2.domain.core.film.FilmEntity;
import com.fastcode.cloudsampleapp2.domain.core.actor.ActorEntity;
import com.fastcode.cloudsampleapp2.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "FILM_ACTOR")
@IdClass(FilmActorId.class)
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class FilmActorEntity extends AbstractEntity {

    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "ACTOR_ID", nullable = false)
    private Integer actorId;
    
    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "FILM_ID", nullable = false)
    private Integer filmId;
    
    @Basic
    @Column(name = "LAST_UPDATE", nullable = false)
    private LocalDateTime lastUpdate;

    @ManyToOne
    @JoinColumn(name = "ACTOR_ID", insertable=false, updatable=false)
    private ActorEntity actor;

    @ManyToOne
    @JoinColumn(name = "FILM_ID", insertable=false, updatable=false)
    private FilmEntity film;


}



