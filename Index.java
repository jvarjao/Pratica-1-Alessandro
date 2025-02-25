# Prática-1 Alessandro

public class MediaAlturas {
    public static void main(String[] args) {
        int[] alturas = {170, 165, 180, 175, 160, 155, 168, 172, 178, 182};
        int soma = 0;
        
        for (int altura : alturas) {
            soma += altura;
        }
        
        double media = (double) soma / alturas.length;
        System.out.println("A média das alturas é: " + media + " cm");
    }
}
