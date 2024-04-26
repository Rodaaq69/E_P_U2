import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Bienvenido a ROCK PAPER SCISSORS");
        int opc =0;
        double mach=0;
        String machine="";
        String user="";
        int contWin=0;
        int contLose=0;
        int contDraw=0;
        Scanner read = new Scanner(System.in);

        while(opc!=4){
        System.out.println("Elige una opción: ");
        System.out.println("1.-Piedra\n2.-Papel\n3.-Tijeras\n4.-Salir");
        opc= read.nextInt();
        mach= Math.random();
        if(mach<=.3){
            machine="papel";
        }else if (mach>.3 && mach<=.6){
            machine="piedra";
        }else if (mach>.6 && mach<=.9){
            machine="tijeras";
        }
        if(opc==2){
            user="papel";
        }else if (opc==1){
            user="piedra";
        }else if (opc==3){
            user="tijeras";
        }
        System.out.println("Resultado de IA= "+machine);
        if(machine.equals("tijeras") && user.equals("piedra") || machine.equals("piedra") && user.equals("papel") ||machine.equals("papel") && user.equals("tijeras")){
            System.out.println("GANASTE");
            contWin++;
        }else if(machine.equals("tijeras") && user.equals("papel") || machine.equals("piedra") && user.equals("tijeras") || machine.equals("papel") && user.equals("piedra")){
            System.out.println("PERDISTE");
            contLose++;
        }else if(machine.equals(user)){
            System.out.println("EMPATE");
            contDraw++;
        }

        System.out.println(" ");

        System.out.println("Partidas Perdidas = "+contLose);
        System.out.println("Partidas Ganadas = "+contWin);
        System.out.println("Partidas Empatadas = "+contDraw);
        }
        System.out.println("Gracias por jugar");
    }
}
