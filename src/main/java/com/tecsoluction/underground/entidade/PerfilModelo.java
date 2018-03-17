package com.tecsoluction.underground.entidade;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PerfilModelo extends Perfil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 127316584642334485L;
	
	private BigDecimal valor;
	
	private String imc;
	
	private String idade;
	
    private String ranking;
    
    @OneToOne(mappedBy="perfil")
    @JoinColumn(name="modelo_id")
    private Modelo modelo;
    
    
    

}
