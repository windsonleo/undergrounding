package com.tecsoluction.underground.entidade;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.tecsoluction.underground.util.CorCabelo;
import com.tecsoluction.underground.util.CorOlhos;
import com.tecsoluction.underground.util.CorPele;
import com.tecsoluction.underground.util.Etinia;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Modelo extends Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3337916946785772782L;
	
	  private String nome;
	
	  @OneToOne
	  @JoinColumn(name="perfil_id")
	  private PerfilModelo perfil;
	  
	  @OneToOne
	  @JoinColumn(name="habilidade_id")
	  private Habilidade habilidade;
	  
		
		private boolean sardas;
		
		   @Column(name = "CORPELE")
		    @Enumerated(EnumType.STRING)
		private CorPele corPele;
		
		   @Column(name = "COROLHOS")
		    @Enumerated(EnumType.STRING)
		private CorOlhos corOlhos;
		
		   @Column(name = "CORCABELO")
		    @Enumerated(EnumType.STRING)
		private CorCabelo corCabelos;
		
		private String altura;
		
		private String peso;

		   @Column(name = "ETNIA")
		    @Enumerated(EnumType.STRING)
		private Etinia etnia;
		
		@OneToMany(fetch = FetchType.EAGER)
		private Set<Encontro> encontros;

}
