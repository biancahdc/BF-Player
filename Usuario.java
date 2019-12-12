package br.edu.ifrn.peoo.projeto;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Usuario {
    
    private int id;
    private String nome;
    private Date dataNascimento;

    public Usuario() {
    }

    public Usuario(int id, String nome, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
        
        return "Usuario: " + "\nID: " + id + "\nNome: " + nome + "\nData de nascimento: " + formatter.format(dataNascimento);
    }
    
    
}
