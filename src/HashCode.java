import Model.Funcionário;

public class HashCode {
    public static void main(String[] args) {

        //Here can see the references in memory
        Funcionário fu1 = new Funcionário("Andrea", "Orlandi", 50);
        Funcionário fu2 = new Funcionário("Andrea", "Orlandi", 50);

        //These are different even if they have the same values
        if(fu2 == fu1){
            System.out.println("Nós somos os mesmos");
        }else{ //triggers this one
            System.out.println("Não somos os mesmos");
        }

        //Here both are the same in memory, so Java detects that both are the same object
        Funcionário fu3 = fu1;

        if(fu1 == fu3){ //triggers this one
            System.out.println("Nós somos os mesmos ém memoria");
        }else{
            System.out.println("Não somos os mesmos ém memoria");
        }

        //But how can we make java know if they have the same data
        //That's where we use equals
        if(fu1.equals(fu2)){ //triggers this one
            System.out.println("Nós somos os mesmos");
        }else{
            System.out.println("Não somos os mesmos");
        }

        //And we can check if those objects are equal swith their hashes
        if (fu1.hashCode() == fu2.hashCode()){ //triggers this one
            System.out.println("Nós somos os mesmos");
        }else{
            System.out.println("Não somos os mesmos");
        }
    }
}
