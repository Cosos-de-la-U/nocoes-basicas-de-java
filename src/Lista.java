import java.util.*;

//Teste de lista
public class Lista {
    public static void main(String[] args) {
        // We these are valid
        ArrayList<Integer> nArrayList = new ArrayList<>();
        List<Integer> nList = new ArrayList<>();
        // The only difference is that we can reasin List to
        // any other object of the interface List for e.g:
        nList = new LinkedList<>();
        nList = new Vector<>();
        nList = new Stack<>();

        //And we can use the methods of the List interface
        //entaõ os dois são a mesma merda when it comes to implementation
        nList.add(1);
        nArrayList.add(-100);
        nArrayList.add(100);

        //And these are some list methodsÇ
        nList = new ArrayList<>();
        //When it's re-declared loses the data that had inside
        System.out.println(nList.isEmpty()); // true
        System.out.println();

        // So we add data:
        nList.add(1);
        nList.add(11);
        nList.add(20);
        nList.add(30);
        nList.add(40);
        nList.add(50);
        System.out.println(nList.get(1)); //10
        System.out.println(nList.set(1, 10)); //10
        System.out.println(nList.get(1)); //10
        System.out.println(nList.get(0)); //10
        System.out.println(nList.remove(0)); //10
        System.out.println(nList.get(0)); //10

        //Here we add -100 and 100
        nList.addAll(nArrayList);
        System.out.println();

        for(int number: nList){
            System.out.println(number); // 10, 20, 30, 40, 50, -100, 100
        }

        System.out.println();
        System.out.println(nList.contains(100)); //true
        System.out.println(nList.hashCode()); //-1665529403
        System.out.println(nList.indexOf(50)); //4
        System.out.println();

        // Check if contains things inside nList
        System.out.println(nList.containsAll(nArrayList)); //true
        System.out.println(nList.equals(nList)); //true
        System.out.println(nList.equals(nArrayList)); //false
        System.out.println();

        //This is how you the max or min element
        System.out.println(Collections.max(nList)); //100
        System.out.println(Collections.min(nList)); //-100

        //Or we can just sort it
        Collections.sort(nList);
        for(Integer e: nList){
            System.out.println(e); //-100,10,20,30,40,50,100
        }
        System.out.println();

        //Or we can just reverse it
        Collections.reverse(nList);
        for(Integer e: nList){
            System.out.println(e); //-100,10,20,30,40,50,100
        }
        System.out.println();

        //Converts the list to array
        Object[] array = nList.toArray();
        for (Object a: array){
            System.out.println(a);
        }
        System.out.println();

        //If we want to convert the list to int instead of object
        Integer[] intArray = new Integer[nList.size()];
        intArray = nList.toArray(intArray);
        for (Integer number: intArray){
            System.out.println(number);
        }

        //But anyway bot elements are integer
        System.out.println(intArray[0].getClass().getName()); //java.lang.Integer
        System.out.println(array[0].getClass().getName()); //java.lang.Integer
        //Only the object itself it's different
        System.out.println(intArray.getClass().getName()); //[Ljava.lang.Integer;
        System.out.println(array.getClass().getName()); //[Ljava.lang.Object;
        System.out.println();

        //And we can create iterator for our list and hashsets
        Iterator<Integer> interator = nList.iterator();
        System.out.println(interator.next());
        //We can print while we have a next element
        while (interator.hasNext()){
            System.out.println(interator.next());
            Integer i = interator.next();
            //and delete something
            if(i < 10){
                interator.remove();
            }
        }
        System.out.println();

        while (interator.hasNext()){
            System.out.println(interator.next());
        }
    }
}

