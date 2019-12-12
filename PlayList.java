package br.edu.ifrn.peoo.projeto;

import java.io.Serializable;
import java.util.ArrayList;

public class PlayList implements Serializable {

    private int id;
    private String nome;
    public ArrayList<Musica> m = new ArrayList<>();

    public PlayList() {
    }

    public PlayList(int id, String nome) {
        this.id = id;
        this.nome = nome;
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

    public ArrayList<Musica> getM() {
        return m;
    }

    public void setM(ArrayList<Musica> m) {
        this.m = m;
    }

    public boolean adicionar(Musica musica) {
        if (m.contains(musica) == true) {
            return false;
        } else {
            m.add(musica);
            return true;
        }
    }

    public boolean remover(String titulo) {
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                m.remove(i);
                return true;
            }
        }
        return false;
    }

    public String listar() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m.size(); i++) {
            sb.append("#").append(i + 1).append(" ").append(m.get(i).getTitulo()).append("\n");
        }
        return sb.toString();
    }

    /* public int calcularDuracao(){
        
        int duracao = 0;
        
        for (int i = 0; i < m.size(); i++) {
            duracao += m.get(i).getDuracao();
        }
        
        return duracao;
    
    }*/
}
