package java_basic;

public class estudiante {
    public void datosEstudiante(){
        String name = "yuri";
        int edad = 25;

        System.out.println("datos nombre " + name + " edad "+ edad);
    }

    public static void main(String args[]){
        estudiante obj = new estudiante();
        obj.datosEstudiante();
    }
}
