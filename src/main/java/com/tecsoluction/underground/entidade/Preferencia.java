package com.tecsoluction.underground.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.tecsoluction.underground.framework.BaseEntity;
import com.tecsoluction.underground.util.CorCabelo;
import com.tecsoluction.underground.util.CorOlhos;
import com.tecsoluction.underground.util.CorPele;
import com.tecsoluction.underground.util.EnumOutros;
import com.tecsoluction.underground.util.Genero;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "PREFERENCIA")
public class Preferencia extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1118615294675699692L;
	
	private boolean suruba;
	
	   @Column(name = "GENERO")
	    @Enumerated(EnumType.STRING)
	private Genero genero;
	
	private boolean anal;
	
	private boolean idade;
	
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
	
	@ElementCollection
    @Enumerated(EnumType.STRING)
	private List<EnumOutros> outros;
	
	private boolean dp;
	
	private String Obs;
	

	@OneToOne(mappedBy="preferencia")
	private Cliente cliente;
	
	public Preferencia() {
		// TODO Auto-generated constructor stub
	}
	
	

}
