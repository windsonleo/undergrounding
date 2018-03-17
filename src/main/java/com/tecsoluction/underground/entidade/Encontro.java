package com.tecsoluction.underground.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tecsoluction.underground.framework.BaseEntity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "ENCONTRO")
public class Encontro extends BaseEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1118615294675699692L;
	
	private Date data;
	
	@ManyToOne
	private Cliente usuarioCliente;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="encontros")
	private Set<Modelo> usuarioModelos;
	
	
	
	public Encontro() {
		// TODO Auto-generated constructor stub
	}
	
	

}
