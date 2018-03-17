package com.tecsoluction.underground.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.tecsoluction.underground.framework.BaseEntity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "TELEFONE")
public class Telefone extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1118615294675699692L;
	
	private String codpais;
	
	private String ddd;
	
	private String numero;
	
	private Double latitudeAtual;
	
	private Double longetudeAtual;
	
	private Double Ultimalatitude;
	
	private Double Ultimalongetude;
	
	@OneToOne(mappedBy="telefone")
	@JoinColumn(name="usuario_id")
	private Usuario usuario;
	
	
	public Telefone() {
		// TODO Auto-generated constructor stub
	}
	
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return numero;
	}	

}
