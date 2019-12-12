
package br.edu.ifrn.peoo.projeto;
    import br.edu.ifrn.peoo.projeto.Track;

public class Musica{
    
    private int duracao;
    private String titulo;
    private Track track;
    
    public Musica() {
    }

    public Musica(String titulo, Track track, int duracao) {
        this.titulo = titulo;
        this.track = track;
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }


    public String toString() {
        return "Musica: " + "Titulo: " + titulo + ", Track: " + track;
    }
    
    
}
