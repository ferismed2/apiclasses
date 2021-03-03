package java_basic;

public class TiposDatos {
    public static void main (String[] args){
        //Strings - declaracion variable string
        String mensaje1 = "Mi mensaje";

        System.out.println(mensaje1);

        //int - declarar variable int
        int num1 = 67;
        System.out.println(num1);

        //Declarar  booleanos
        boolean bandera1 = true;
        boolean bandera2 = false;
        System.out.println("algo: " + bandera1 + bandera2);

        if(bandera1){
            System.out.println("bandera true "  );
        }else{
            System.out.println("bandera false "  );
        }

        //for
        for(int i=4; i<num1;i++){
            System.out.println("valor i " + i  );
        }

        //while

        int j=0;
        while(j<5){
            System.out.println("mientras");
            j++;
        }
    }
}
