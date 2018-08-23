package br.jus.trf1.aletheia.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Demanda.class)
public abstract class Demanda_ {

	public static volatile SingularAttribute<Demanda, BigDecimal> totalPfPlataforma;
	public static volatile SingularAttribute<Demanda, Long> codigo;
	public static volatile SingularAttribute<Demanda, Tipo> tipo;
	public static volatile SingularAttribute<Demanda, String> observacao;
	public static volatile SingularAttribute<Demanda, Pessoa> pessoa;
	public static volatile SingularAttribute<Demanda, LocalDate> data;
	public static volatile SingularAttribute<Demanda, Sistema> sistema;
	public static volatile SingularAttribute<Demanda, Lote> lote;
	public static volatile SingularAttribute<Demanda, BigDecimal> valor;
	public static volatile SingularAttribute<Demanda, String> nome;
	public static volatile SingularAttribute<Demanda, BigDecimal> totalPfBruto;
	public static volatile SingularAttribute<Demanda, Plataforma> plataforma;
	public static volatile SingularAttribute<Demanda, BigDecimal> totalPfLiquido;
	public static volatile SingularAttribute<Demanda, Status> status;

}

