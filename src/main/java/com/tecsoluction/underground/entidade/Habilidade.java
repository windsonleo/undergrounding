package com.tecsoluction.underground.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.tecsoluction.underground.framework.BaseEntity;
import com.tecsoluction.underground.util.EnumOutros;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "HABILIDADE")
public class Habilidade extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1118615294675699692L;
	
	private boolean suruba;
	
	private boolean anal;
	
	private boolean dp;
	
	@ElementCollection
	private List<EnumOutros> outros;
	
	private String Obs;
	

	@OneToOne(mappedBy="habilidade")
	private Modelo modelo;
	
	public Habilidade() {
		// TODO Auto-generated constructor stub
	}
	
	

}
