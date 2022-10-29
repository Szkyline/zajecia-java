public class Animal {
    static final public Double DEFAULT_DOG_WEIGHT = 12.3;
    private static final Double DEFAULT_CAT_WEIGHT = 3.2;
    private static final Double DEFAULT_BEAR_WEIGHT = 480.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;

    String specie;
    String name;
    Boolean isAlive;
    Double weight;

    Animal(String specie) {
        this.specie = specie;
        this.isAlive = true;
       switch(specie) {
           case "canis" -> this.weight = DEFAULT_DOG_WEIGHT;
           case "felis" -> this.weight = DEFAULT_CAT_WEIGHT;
           case "ursus" -> this.weight = DEFAULT_BEAR_WEIGHT;
           default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
       }

    }



    void feed()
    {
        this.weight+= 0.5;
        if(this.isAlive == true)
        {
            System.out.println("dzięki za żarcie");
        }
        else
        {
            System.out.println("czy wszystko dobrze z głową");
        }
    }


    void takeForAWalk()
    {
        this.weight-= 1;
        if(this.isAlive == true)
        {
            System.out.println("dzięki za spacer");
        }
        else
        {
            System.out.println("dzwonię na policje");
        }
        if(this.weight <=0)
        {
         this.isAlive = false;

        }

    }

}
