public class Geometrica implements ICalcularMedia {
        
    public double calcularMedia(double a, double b) {
        return Math.sqrt(a*b);
    }

    
    public String Situacao(double media) {
        if(media > 7)
        return "Aprovado";
        else
        return "Reprovado";
    }
}
