package com.tecsoluction.underground.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PerfilCliente extends Perfil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4701125462066997699L;
	
	
    @OneToOne(mappedBy="perfil")
    @JoinColumn(name="cliente_id")
    private Cliente cliente;
    
    
    
    public void VotarRankingModelo(){
    	
    	
    }
    
    
    // passar preferencias
    public void LocalizarModelo(){
    	
    	
    	
    }

}
