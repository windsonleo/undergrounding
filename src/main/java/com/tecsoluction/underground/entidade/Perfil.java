package com.tecsoluction.underground.entidade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

import com.tecsoluction.underground.framework.BaseEntity;
import com.tecsoluction.underground.util.Genero;
import com.tecsoluction.underground.util.OrientacaoSexual;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Entity
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Perfil extends BaseEntity implements Serializable {


    private static final long serialVersionUID = 1L;

    @Column(name = "foto")
    private String foto;
    
    @Column(name = "frase")
    private String frase;
	
    @Column(name = "ORIENTACAO")
    @Enumerated(EnumType.STRING)
	private OrientacaoSexual orientacao;
	
    

    

    



    public Perfil() {

    }



    
    @Override
    public String toString() {
        return frase.toUpperCase();
    }


}