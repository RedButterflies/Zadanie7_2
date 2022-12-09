/*Napisz program pobierający od użytkownika liczby całkowite dopóki nie zostanie
wprowadzona liczba 0. Po zakończeniu pobierania podaj ile wprowadzono liczb, ich sumę,
oraz iloczyn (nie wliczaj 0).*/

import java.util.ArrayList;
import java.util.Scanner;

public class Pobieranie {
    public void pobieram()
    {
        ArrayList<Integer>listaLiczb = new ArrayList<>();
        int liczbaX;

        do{
            System.out.println("Wprowadz liczbe calkowita: ");
            Scanner liczba = new Scanner(System.in);
            liczbaX=liczba.nextInt();
            if(liczbaX==0)break;
            listaLiczb.add(liczbaX);
        }while(liczbaX!=0);
        
        System.out.println("Wprowadzono "+listaLiczb.size()+" liczb");
        int suma=0;
        for(int t: listaLiczb)
        {
            suma+=t;
        }
        int iloczyn=1;
        for(int t:listaLiczb)
        {
            iloczyn*=t;
        }
        System.out.println("Suma wprowadzonych liczb wynosi: "+suma);
        System.out.println("Iloczyn wprowadzonych liczb wynosi: "+iloczyn);
    }
}
