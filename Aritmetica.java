public class Aritmetica implements ICalcularMedia {
        
    public double calcularMedia(double a, double b) {
        return (a+b)/2;
    }

    
    public String Situacao(double media) {
        if(media > 5)
        return "Aprovado";
        else
        return "Reprovado";
    }
}