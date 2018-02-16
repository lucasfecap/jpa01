package br.com.fiap.jpa.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

// todos os imports do Javax Persistence.

@Entity
@Table(name="TB_CARRO")
@SequenceGenerator(name="carro",sequenceName="SQ_TB_CARRO",allocationSize=1)
public class Carro implements Serializable{
	@Id
	@Column(name="CD_CARRO")
	@GeneratedValue(generator="carro",strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="DS_MODELO",nullable=false,length=100)
	private String modelo;
	
	@Column(name="NR_ANO",nullable=false)
	private int ano;
	// se for permitido usar Nulo tem que usar a classe Integer ao inves de int << ******
	// private Integer ano
	
	@Column(name="DS_MOTOR")
	private String motor;
	
	@Column(name="DS_MONTADORA",nullable=false)
	private String montadora;
	
	@Column(name="DS_PLACA",nullable=false,length=8)
	private String placa;
	
	@Column(name="DT_FABRICACAO",nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar dataFabricacao;
	
	
	@Column(name="OP_COLECIONADOR")
	private  boolean colecionador;
	
	@Transient // EX Nao será mapeado para uma coluna no banco de dados.
	private boolean pagaIpva;
	
	// enum se quiser mudar e gravar a string(nome da constante) ordinal(numero que é default).
	@Enumerated(EnumType.STRING)
	@Column(name="DS_TRANSMISSAO")
	private Transmissao transmissao;

	// Pode ser colocado os Anotations encima do GET, encima pode poluir.
	
	
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Carro(String modelo, int ano, String motor, String montadora, String placa, Calendar dataFabricacao,
			boolean colecionador, boolean pagaIpva, Transmissao transmissao) {
		super();
		this.modelo = modelo;
		this.ano = ano;
		this.motor = motor;
		this.montadora = montadora;
		this.placa = placa;
		this.dataFabricacao = dataFabricacao;
		this.colecionador = colecionador;
		this.pagaIpva = pagaIpva;
		this.transmissao = transmissao;
	}

	 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Calendar getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Calendar dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public boolean isColecionador() {
		return colecionador;
	}

	public void setColecionador(boolean colecionador) {
		this.colecionador = colecionador;
	}

	public boolean isPagaIpva() {
		return pagaIpva;
	}

	public void setPagaIpva(boolean pagaIpva) {
		this.pagaIpva = pagaIpva;
	}

	public Transmissao getTransmissao() {
		return transmissao;
	}

	public void setTransmissao(Transmissao transmissao) {
		this.transmissao = transmissao;
	}
	
	
	
}
