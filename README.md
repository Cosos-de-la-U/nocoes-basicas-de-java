# Java foreach
```java
List<Serie> serieList = new ArrayList<>();
serieList.add(new Serie("Friends", 9, "SITCON", "Some guys"));
serieList.add(new Serie("Vinland Saga", 2, "IDK", "A guy"));
serieList.add(new Serie("HIMYM", 8, "SITCON", "FOX"));

for(Serie serie: serieList){
    serie.getName();
}
```

# Coleções em Java

Esta é a API que o Java nos fornece para gerenciar coleções (que é usada para estruturas de dados). Essas coleções não fazem parte da linguagem, fazem parte do `java.utils`.

![Imagem graças a https://www.javatpoint.com/collections-in-java](https://static.javatpoint.com/images/java-collection-hierarchy.png)

# Lista
Esta é a diferença entre uma lista e um ArrayList.
![https://byjus.com/gate/difference-between-list-and-arraylist-in-java/#:~:text=The%20List%20refers%20to%20a,size%20as%20and%20when%20required.](img/1.png)

https://docs.oracle.com/javase/8/docs/api/java/util/List.html

A diferença entre um `List` e um `ArrayList` é que o `List` é uma classe, 

