//#1
abstract class Moon {
    abstract void myMoon();
}

class Night extends Moon {
    @Override
    void myMoon() {
        System.out.println(" ");
        System.out.println("The moon is beautiful tonight.");
        System.out.println(" ");

    }
}

//#2
abstract class Flower {

    public Flower(){
        System.out.println("Flower has many petals");
    }

    abstract void Region();
}

class Variety extends Flower{

    public Variety() {
        System.out.println(" ");
        System.out.println("A flower has many varieties.");
    }

    @Override
    void Region() {
        System.out.println(" ");
        System.out.println("A flower has many region varients.");
    }
    
}

//#3
abstract class Stars {

    void Twinkle(){
        System.out.println(" ");
        System.out.println("Stars twinkle in the night sky.");
    }

}

class nightSky extends Stars {

}

//#4
abstract class Games {
    final void play() {
        System.out.println(" ");
        System.out.println("Games are fun to play.");
    }
}

class options extends Games {

}

// #5
// abstract class Thing {
//     public static void main(String[] args) {
//         Thing thing = new Thing();
//     }
// }

// #6
// abstract class callOut {

//     static void Shout(){
//         System.out.println("");
//         System.out.println("THIS IS A SHOUT!");
//     }
// }

// class shout extends callOut {

//     public static void main(String[] args) {
//         shout.Shout();
//     }
// }

//#7 inspired by the Matryoshka doll 
// (russian doll inside a doll)
abstract class doll_1 {
    abstract static class doll_2 {
        abstract void manyDolls();
    }
}

class Matryoshka extends doll_1 {
    class more_dolls extends doll_1.doll_2 {
        @Override
        void manyDolls() {
            System.out.println(" ");
            System.out.println("Matryoshka dolls are the russian dolls that are nested inside each other.");
        }
    }
}
//#8
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal { 
    @Override  
    public void sound() {
        System.out.println(" ");
        System.out.println("Dog barks.");
    }
}


//#9
abstract class Fruits {
    abstract void apple();
    abstract void grape();
    abstract void banana();
}

abstract class child1 extends Fruits {
    public void apple() {
        System.out.println(" ");
        System.out.println("Apple");
    }
    }
    class child2 extends child1 {
        public void grape() {
            System.out.println("Grape");
    }
        public void banana() {
            System.out.println("Banana");
    }
}

public class encarguez_code {

    public static void main(String[] args) {

        Moon moon = new Night();
        moon.myMoon(); //1

        Variety flower = new Variety();
        flower.Region(); //2

        nightSky sky = new nightSky();
        sky.Twinkle(); //3

        Games game = new options();
        game.play(); //4

        Matryoshka.more_dolls dolls 
        = new Matryoshka().new more_dolls();
        dolls.manyDolls(); //7

        Dog dog = new Dog();
        dog.sound(); //8

        child2 likes = new child2();
        likes.apple(); 
        likes.grape(); 
        likes.banana(); //9
    }
}