import java.util.*;

public class Main {
    public static int dividendo = 5;
    public static int divisor = 0;
    public static String reverse(String text) {
//        System.out.println("Escribe tu nombre o frase");
//        Scanner sc = new Scanner(System.in);
//        String texto = sc.nextLine();
//        String name = new StringBuilder(texto).reverse().toString();
        StringBuilder sb =new StringBuilder(text);
        sb.reverse();
        return  sb.toString();
    }

    public static void DividePorCero() throws ArithmeticException {
        try {
            System.out.println(dividendo / divisor);
        } catch (ArithmeticException e) {
            System.err.println(e);// también podría poner e.getMessage()
            System.out.println("Esto no puede hacerse");
        }
        System.out.println("Demo de codigo");
    }
    public static void main(String[] args) {
        System.out.println("1. ejercicio 1");
        System.out.println(reverse("my name is Maite"));

        System.out.println("2. ejercicio 2");
        String names[] = {"Mario", "Maite", "Maria"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("3. ejercicio 3");
        int[][] arr = { { 1, 2 }, { 3, 4 } };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++){
                System.out.println("arr[" + i + "][" + j + "] = "
                        + arr[i][j]);

        }
    }
        System.out.println("4. ejercicio 4");
        Vector v=new Vector();
        v.addElement("uno"); //0
        v.addElement("dos");
        v.addElement("cuatro");
        v.addElement("cinco");
        v.insertElementAt("tres", 2);
        v.removeElementAt(2);
        v.removeElementAt(3);
        System.out.println(v);

        System.out.println("5. ejercicio 5");

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        for (String car : cars) {
            System.out.println(car);
        }

        LinkedList<String> carsLinked = new LinkedList<String>();
        carsLinked.add("Volvo");
        carsLinked.add("BMW");
        carsLinked.add("Ford");
        carsLinked.add("Mazda");
        System.out.println(carsLinked);
        for (String carsLink : carsLinked){
            System.out.println(carsLink);
        }
        System.out.println("6. ejercicio 6");
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numbers.add(teclado.nextInt());
        }
        int i = 0;

        System.out.print("A continuación la lista de números: ");
        for (Integer n : numbers) {
            System.out.print(n + " ");
        }
        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                System.out.println("This is Even Number: " + number);
                iterator.remove();
            }

        }

        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        System.out.println("7. ejercicio 7");
        DividePorCero();
    }
    //Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
/*
Daria un error y limitaría el vector
 */


}
