public class Disciplina {
    ICalcularMedia calcularMedia;
    public ICalcularMedia getCalcularMedia() {
        return calcularMedia;
    }
    public void setCalcularMedia(ICalcularMedia calcularMedia) {
        this.calcularMedia = calcularMedia;
    }
    double P1;
    public double getP1() {
        return P1;
    }
    public void setP1(double p1) {
        this.P1 = p1;
    }
    double P2;
    public double getP2() {
        return P2;
    }
    public void setP2(double p2) {
        this.P2 = p2;
    }
    double Media;
    
    public double getMedia() {
        return Media;
    }
    public void setMedia(double media) {
       // Media = media;
    }
    String Nome;
    
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        this.Nome = nome;
    }
    String Situacao;
    public String getSituacao() {
        return Situacao;
    }
    public void setSituacao(String situacao) {
        this.Situacao = situacao;
    }
    public void calcularMedia() {
        this.Media = calcularMedia.calcularMedia(this.P1, this.P2);
        this.Situacao = calcularMedia.Situacao(this.Media);
    }
    public Disciplina(){

    }
    public Disciplina(ICalcularMedia calcularMedia){
        this.calcularMedia = calcularMedia;
    }
}
