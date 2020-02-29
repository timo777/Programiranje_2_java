
public class DN02 {
    public static void main(String[] args) {
        StringBuilder zvezdaGor = new StringBuilder("");
        for (int i = 0; i < args.length; i++) {
            zvezdaGor.append("**");
            int zvezdice = args[i].length();
            for (int y = 0; y < zvezdice; y++) {
                zvezdaGor.append("*");
            }
            zvezdaGor.append("**  ");


        }

        System.out.printf(zvezdaGor.toString());
        System.out.println();

        for (int y = 0; y < args.length; y++){
            if (y == 0){
                System.out.printf("* " + args[y] + " * ");
            }
            else {
                System.out.printf(" * " + args[y] + " * ");
            }
        }
        System.out.println();
        System.out.printf(zvezdaGor.toString());


    }
}
