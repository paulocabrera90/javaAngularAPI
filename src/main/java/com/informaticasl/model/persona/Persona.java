package com.informaticasl.model.persona;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "per")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Persona {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer per_id;
		
		@Column
		private String  per_nombre;
		private String  per_apellido;
		private Integer  per_edad;
		private Integer per_dni;
		private String  per_sexo;
		private Date  per_fechaNac;
		private String  per_estadoCivil;
		private String per_domicilio;
		private Integer per_telefono;
		private String per_email;
		private String per_nac;
		private Date per_fechaAlta;
		private Date per_fechaBaja;
		private Date per_fechaUltimaMod;
		private Date per_fechaUltimaCon;
		private String  per_observaciones;
		
		public Persona(Integer per_id, String nombre, String per_apellido, Integer per_edad, Integer per_dni,
				String per_sexo, Date per_fechaNac, String per_estadoCivil, String per_domicilio, Integer per_telefono,
				String per_email, String per_nac, Date per_fechaAlta, Date per_fechaBaja, Date per_fechaUltimaMod,
				Date per_fechaUltimaCon, String per_observaciones) {
			super();
			this.per_id = per_id;
			this.per_nombre = per_nombre;
			this.per_apellido = per_apellido;
			this.per_edad = per_edad;
			this.per_dni = per_dni;
			this.per_sexo = per_sexo;
			this.per_fechaNac = per_fechaNac;
			this.per_estadoCivil = per_estadoCivil;
			this.per_domicilio = per_domicilio;
			this.per_telefono = per_telefono;
			this.per_email = per_email;
			this.per_nac = per_nac;
			this.per_fechaAlta = per_fechaAlta;
			this.per_fechaBaja = per_fechaBaja;
			this.per_fechaUltimaMod = per_fechaUltimaMod;
			this.per_fechaUltimaCon = per_fechaUltimaCon;
			this.per_observaciones = per_observaciones;
		}

		public Persona() {
			super();
		}

		public Integer getPer_id() {
			return per_id;
		}

		public void setPer_id(Integer per_id) {
			this.per_id = per_id;
		}

		public String getPer_nombre() {
			return per_nombre;
		}

		public void setPer_nombre(String per_nombre) {
			this.per_nombre = per_nombre;
		}

		public String getPer_apellido() {
			return per_apellido;
		}

		public void setPer_apellido(String per_apellido) {
			this.per_apellido = per_apellido;
		}

		public Integer getPer_edad() {
			return per_edad;
		}

		public void setPer_edad(Integer per_edad) {
			this.per_edad = per_edad;
		}

		public Integer getPer_dni() {
			return per_dni;
		}

		public void setPer_dni(Integer per_dni) {
			this.per_dni = per_dni;
		}

		public String getPer_sexo() {
			return per_sexo;
		}

		public void setPer_sexo(String per_sexo) {
			this.per_sexo = per_sexo;
		}

		public Date getPer_fechaNac() {
			return per_fechaNac;
		}

		public void setPer_fechaNac(Date per_fechaNac) {
			this.per_fechaNac = per_fechaNac;
		}

		public String getPer_estadoCivil() {
			return per_estadoCivil;
		}

		public void setPer_estadoCivil(String per_estadoCivil) {
			this.per_estadoCivil = per_estadoCivil;
		}

		public String getPer_domicilio() {
			return per_domicilio;
		}

		public void setPer_domicilio(String per_domicilio) {
			this.per_domicilio = per_domicilio;
		}

		public Integer getPer_telefono() {
			return per_telefono;
		}

		public void setPer_telefono(Integer per_telefono) {
			this.per_telefono = per_telefono;
		}

		public String getPer_email() {
			return per_email;
		}

		public void setPer_email(String per_email) {
			this.per_email = per_email;
		}

		public String getPer_nac() {
			return per_nac;
		}

		public void setPer_nac(String per_nac) {
			this.per_nac = per_nac;
		}

		public Date getPer_fechaAlta() {
			return per_fechaAlta;
		}

		public void setPer_fechaAlta(Date per_fechaAlta) {
			this.per_fechaAlta = per_fechaAlta;
		}

		public Date getPer_fechaBaja() {
			return per_fechaBaja;
		}

		public void setPer_fechaBaja(Date per_fechaBaja) {
			this.per_fechaBaja = per_fechaBaja;
		}

		public Date getPer_fechaUltimaMod() {
			return per_fechaUltimaMod;
		}

		public void setPer_fechaUltimaMod(Date per_fechaUltimaMod) {
			this.per_fechaUltimaMod = per_fechaUltimaMod;
		}

		public Date getPer_fechaUltimaCon() {
			return per_fechaUltimaCon;
		}

		public void setPer_fechaUltimaCon(Date per_fechaUltimaCon) {
			this.per_fechaUltimaCon = per_fechaUltimaCon;
		}

		public String getPer_observaciones() {
			return per_observaciones;
		}

		public void setPer_observaciones(String per_observaciones) {
			this.per_observaciones = per_observaciones;
		}

		@Override
		public String toString() {
			return "Persona [per_id=" + per_id + ", Per_nombre=" + per_nombre + ", per_apellido=" + per_apellido + ", per_edad="
					+ per_edad + ", per_dni=" + per_dni + ", per_sexo=" + per_sexo + ", per_fechaNac=" + per_fechaNac
					+ ", per_estadoCivil=" + per_estadoCivil + ", per_domicilio=" + per_domicilio + ", per_telefono="
					+ per_telefono + ", per_email=" + per_email + ", per_nac=" + per_nac + ", per_fechaAlta="
					+ per_fechaAlta + ", per_fechaBaja=" + per_fechaBaja + ", per_fechaUltimaMod=" + per_fechaUltimaMod
					+ ", per_fechaUltimaCon=" + per_fechaUltimaCon + ", per_observaciones=" + per_observaciones + "]";
		}
		
		
		
}
