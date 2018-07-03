package cad_pessoa_app;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Pessoa {

	public enum Sexo {
		FEMININO,
		MASCULINO
	}
	
	private StringProperty nome = new SimpleStringProperty();
	private IntegerProperty idade = new SimpleIntegerProperty();
	private ObjectProperty<Sexo> sexo = new SimpleObjectProperty<>();
	private BooleanProperty praticaEsportes = new SimpleBooleanProperty();
	
	public StringProperty nomeProperty() {
		return this.nome;
	}
	
	public String getNome() {
		return this.nomeProperty().get();
	}
	
	public void setNome(final String nome) {
		this.nomeProperty().set(nome);
	}
	
	public IntegerProperty idadeProperty() {
		return this.idade;
	}

	public int getIdade() {
		return idadeProperty().get();
	}

	public void setIdade(final int idade) {
		this.idade.set(idade);
	}

	public ObjectProperty<Sexo> sexoProperty() {
		return this.sexo;
	}
	
	public Sexo getSexo() {
		return this.sexoProperty().get();
	}

	public void setSexo(final Sexo sexo) {
		this.sexoProperty().set(sexo);
	}

	public BooleanProperty praticaEsportesProperty() {
		return this.praticaEsportes;
	}
	
	public boolean getPraticaEsportes() {
		return this.praticaEsportes.get();
	}

	public void setPraticaEsportes(boolean praticaEsportes) {
		this.praticaEsportesProperty().set(praticaEsportes);
	}
}
