import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void addNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        var temp = 0;
        for(var numero : numeros){
            temp += numero;
        }
        return temp;
    }

    public void encontrarMaiorNumero(){
        if (!numeros.isEmpty()){
            int maiorNumero = 0;
            for(var n : numeros){
                if(n > maiorNumero){
                    maiorNumero = n;
                }
            }
            System.out.println(maiorNumero);
        }
        else{
            System.out.println("Nenhum Número encontrado");
        }
    }

    public void encontrarMenorNumero(){
        if (!numeros.isEmpty()){
            int menorNumero = 0;
            for(int i = 0; i < numeros.toArray().length; i++){
                if(i == 0){
                    menorNumero = numeros.get(i);
                }else{
                    if(numeros.get(i) < menorNumero){
                        menorNumero = numeros.get(i);
                    }
                }
            }
            System.out.println(menorNumero);
        }
        else{
            System.out.println("Nenhum Número encontrado");
        }
    }

    public void exibirTodosOsNumeros(){
        if (!numeros.isEmpty()){
            for(var n : numeros){
                System.out.println(n);
            }
        }
    }
}
