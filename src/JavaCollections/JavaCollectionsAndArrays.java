package JavaCollections;
import java.util.*;
import java.sql.SQLOutput;

public class JavaCollectionsAndArrays {
    public void collections() {

//  ARRAYS
//  Are fixed, we can't add, edit, remove elements

//  UNIDIMENSIONAL ARRAY

//  FIRST WAY
//        Integer[] notas = new Integer[3];
//        notas[0] = 12;
//        notas[1] = 5;
//        notas[2] = 8;
//        System.out.println(notas[1]);

//  SECOND WAY: With predefined data
//        String[] names = {"Jhon", "David", "Dani", "Nelcy"};
//        System.out.println(names);
//        System.out.println(names[2]);
//        System.out.println(names.length);
//
//        for(String i: names) {
//            System.out.println(i);
//        }

//  BIDIMENSIONAL ARRAY
//        Integer[][] bidimensional = {{1, 2, 3,9}, {
//                                      4, 5, 6,9}};
//        for (int row = 0; row < bidimensional.length; row++) {
//            for (int col = 0; col < bidimensional[row].length; col++) {
//                System.out.println(bidimensional[row][col]);
//            }
//        }

//  ARRAY LIST
//        ArrayList<Integer> numList = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            numList.add((int) (Math.random() * 10));
//        }
//        System.out.println(numList);

//  Converting an array into an array list
//        List<Integer> convertedList = List.of(notas);
//        System.out.println(convertedList.get(0));
//
//        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("First", "Second", "Third"));

//  Print all the array
//        System.out.println(namesList);

//  Get one element
//        System.out.println(namesList.get(0));

//  Get array size
//        System.out.println(namesList.size());

//  Add element
//        namesList.add("Fourth");
//        System.out.println(namesList);

//  Set element
//        namesList.set(0, "another");
//        System.out.println(namesList);

//  Remove element
//        namesList.remove(3);
//        System.out.println(namesList);

//  Object array list
//        ArrayList<Person> people = new ArrayList<Person>();
//
//        people.add(new Person("David",22,true));
//        people.add(new Person("Daniela",24,true));
//        people.add(new Person("Nacho",34,true));
//        people.add(new Person("Josua",29,true));
//        System.out.println(people.size());
//
//        for(Person p: people) {
//            System.out.println(p.name + " " + p.age + p.married);
//            if(p.name.contains("Nacho")) {
//                Integer indexFound = people.indexOf(p);
//            System.out.println(indexFound);
//            }
//        }
//
//        String persona = people.get(0).name;
//        System.out.println(persona);

//  ArrayList created from Collection interface
//        Collection<Integer> collection = new ArrayList<Integer>();

//  OBJECT ARRAY
// La clase Object es la clase padre de todas las clases en Java, es necesario hacer un casteo puesto que todo pasa de ser un string, int o lo que sea a un Object

//        ArrayList<Object> listaDeObjetos = new ArrayList<Object>(Arrays.asList("Letters", true, 12, 34, "134", false));
//        String cadena = (String) listaDeObjetos.get(0);
//        System.out.println(cadena);
//
//
//        public float convertir ( int numero) {
//            return (float) numero;
//        }


//  LINKED LIST


//  HASH SET: Object are stored in ramdon order | We can only use for each loop
//        HashSet<Integer> aHash = new HashSet<Integer>();
//        aHash.add(2);
//        aHash.add(3);
//        aHash.add(4);
//        aHash.add(5);
//        aHash.add(6);

//  Iterator interface: It is an interface
//  Iterator method: It is a method, belongs to collection interface
//        Iterator<Integer> itr = aHash.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        System.out.println("-------------------------------");
//        for (Integer recorrerSet: aHash) {
//            System.out.println(recorrerSet);
//        }


//  HASH MAP: It needs two Parameters, it used to store Key Value Pairs
//        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
//        hmap.put(101, "Arun");
//        hmap.put(102, "Tharun");
//        hmap.put(103, "Toma");
//        hmap.put(104, "Davit");
//        hmap.put(105, "Viktar");
//        for (Integer corre : hmap.keySet()) {
//            System.out.println(hmap.get(corre));
//        }

//        como recorrer un mapa, con lambdas y streams
//        Map<Integer, String> map = new HashMap<Integer, String>();
//        map.put(101, "A");
//        map.put(102, "T");
//        map.put(103, "T");
//        map.put(104, "D");
//        map.put(105, "V");
//        for (Integer corr : map.keySet()) {
//            System.out.println(map.get(corr));
//            System.out.println(map.);
//        }
//        System.out.println(map.put(105,"new"));
//        System.out.println(map.get(105));
    }
}