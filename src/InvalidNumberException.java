import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InvalidNumberException {
    private InvalidNumberException() {

    }

    public static int[] readNumbers() throws FileNotFoundException {

        int[] masivi = new int[10];

        try {
            File myObj = new File("ricxvebi");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                int number = Integer.parseInt(data);
                if(number < 0){
                    throw new NumberFormatException();
                }
                masivi[number] = number;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        return masivi;
    }

    public static int masivisJami(int[] masivi) {

        int jami = 0;

        try {
            for (int i = 0; i < masivi.length; i++) {
                jami += masivi[i];
                if(jami == 100){
//                    ar vicodi raze gamesrola da ase chavtene
                    throw new ArithmeticException();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("numformatexception");
        } catch (ArithmeticException e){
            System.out.println("arithmexcep");
        }

        return jami;
    }

}
