public class AnimalMessageGenerator {

    public static void main(String[] args) {
        generateMessage("Dog");

        generateMessage("Cat");

        generateMessage("Lion");

        generateMessage("Pig");

        generateMessage("Cougar");

        int base = 4;
        int exponent = 5;
        int Shedegi = XarisxisKalkulacia(base, exponent);
        System.out.println(base + " ამაღლებული ხარისხის მაჩვენებელი " + exponent + " არის : " + Shedegi);
    }

    public static void generateMessage(String animal) {
        switch (animal.toLowerCase()) {
            case "dog":
                System.out.println("I'm a dog");
                break;
            case "cat":
                System.out.println("I'm a cat");
                break;
            case "lion":
                System.out.println("I'm a lion");
                break;
            case "pig":
                System.out.println("I'm a pig");
                break;
            default:
                System.out.println("I'm an animal");
        }
    }

    public static int XarisxisKalkulacia(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("ექსპონენტი უნდა იყოს არა ნეგატიური");
        }

        int Shedegi = 1;
        for (int i = 0; i < exponent; i++) {
            Shedegi *= base;
        }
        return Shedegi;
    }
}
