import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int ricer, beansr, meatr, salsar, veggiesr;

        String[] burritos = new String[10];

        //Make these options versitile but in random


        String[] rice = {"white rice", "brown rice", "no rice", "all rice options"};
        String[] meat = {"chicken", "steak", "carnidas", "chorizo", "sofirtas", "veggies", "no meat",  "all meat options"};
        String[] beans = {"pinto beans", "black beans", "no beans"};
        String[] salsa = {"mild salsa", "medium salsa", "hot salsa", "no salsa", "all salsa options"};
        String[] veggies = {"lettuce", "fajita veggies", "no veggies", "all veggie options"};


        //Choose these option in random form for each


        for (int i = 0; i < burritos.length; i++)
        {


            ricer = random.nextInt(rice.length);
            meatr = random.nextInt(meat.length);
            beansr = random.nextInt(beans.length);
            salsar= random.nextInt(salsa.length);
            veggiesr = random.nextInt(veggies.length);




            burritos[i] = "Burrito " + (i + 1) + ": " + rice[ricer] + ", " + meat[meatr] + ", " + beans[beansr] + ", " + salsa[salsar] + ", " + veggies[veggiesr];


            System.out.println(burritos [i] );
            System.out.println();


        }
    }


}



