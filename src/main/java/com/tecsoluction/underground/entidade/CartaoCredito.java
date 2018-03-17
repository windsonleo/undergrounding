package com.tecsoluction.underground.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.tecsoluction.underground.framework.BaseEntity;
import com.tecsoluction.underground.util.Bandeira;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "CARTAOCREDITO")
public class CartaoCredito extends BaseEntity implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1118615294675699692L;
	
	private String numero;
	
	private String codseguranca;
	
	private String nome;
	
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date validade;
	
	   @Column(name = "BANDEIRA")
	    @Enumerated(EnumType.STRING)
	private Bandeira bandeira;
	
	@ManyToOne
	private Cliente cliente;
	
	public CartaoCredito() {
		// TODO Auto-generated constructor stub
	}
	
	

}
