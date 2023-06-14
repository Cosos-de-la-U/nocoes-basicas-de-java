import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        //No duplicates allowed
        //time complexity (O(1))
        //HashSet does not maintain any specific order of elements.
        Set<String> dato = new HashSet<>();
        dato.add("Portogallo");
        dato.add("Portogallo");
        dato.add("Inglaterra");
        dato.add("Cyprus");
        dato.add("Morocco");
        dato.add("Australia");


        System.out.println("Set:");
        System.out.println("-------------------");
        for (String string: dato){
            System.out.println(string);
        }
        //Inglaterra
        //Cyprus
        //Morocco
        //Portogallo
        //Australia
        System.out.println();

        //Tree set orders the input of the Set
        //And don't allow to repeat values.
        Set<String> paises = new TreeSet<>();
        paises.add("Portogallo");
        paises.add("Portogallo");
        paises.add("Inglaterra");
        paises.add("Cyprus");
        paises.add("Morocco");
        paises.add("Australia");

        System.out.println("Tree set:");
        System.out.println("-------------------");
        for(String string: paises){
            System.out.println(string);
        }
        //Australia
        //Cyprus
        //Inglaterra
        //Morocco
        //Portogallo
        System.out.println();


        Set<String> countries = new LinkedHashSet<>();
        countries.add("Portogallo");
        countries.add("Portogallo");
        countries.add("Inglaterra");
        countries.add("Cyprus");
        countries.add("Morocco");
        countries.add("Australia");

        System.out.println("LinkedHashSet:");
        System.out.println("-------------------");
        for(String string: countries){
            System.out.println(string);
        }
        System.out.println();

        if (countries.hashCode() == paises.hashCode() && countries.hashCode() == dato.hashCode()){
            System.out.println("SIIIU"); //Prints this one
        }else {
            System.out.println("NAAAAO");
        }

        if(countries.equals(paises) && countries.equals(dato)){
            System.out.println("SIIIU"); //Prints this one
        }else {
            System.out.println("NAAAAO");
        }

    }
}
