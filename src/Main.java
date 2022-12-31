public class Main {
    public static void main(String[] args){

        Coche miCoche = new Coche();
        miCoche.AumentarPuerta();
        miCoche.AumentarPuerta();
        miCoche.AumentarPuerta();
        miCoche.AumentarPuerta();
        

        System.out.print("La cantidad de puertas que tiene el coche son : " );
        System.out.print(miCoche.puertas);
    }

}
class Coche{

    public int puertas = 0;

    public void AumentarPuerta(){
            this.puertas++;
    }
}
