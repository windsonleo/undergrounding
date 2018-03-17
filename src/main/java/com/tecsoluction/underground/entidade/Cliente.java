package com.tecsoluction.underground.entidade;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Cliente extends Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8384331785028995938L;
	
	private String nome;
    
    @OneToMany(fetch=FetchType.EAGER)
    private Set<CartaoCredito> cartoes;
    
    @OneToOne
    @JoinColumn(name="preferencia_id")
    private Preferencia preferencia;
    
    
  @OneToOne
  @JoinColumn(name="perfil_id")
  private PerfilCliente perfil;
  
  @OneToMany(mappedBy="usuarioCliente")
  private Set<Encontro> encontros;
  
  

}
