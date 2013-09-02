import java.io.*;
class LeerArchivo  {
	leerArchivo{

	}
    public static void main(String args[]) {
     try{

            FileInputStream fstream = new FileInputStream("")
            DataInputStream entrada = new DataInputStream(fstream);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            while ((strLinea = buffer.readLine()) != null)   {
                System.out.println (strLinea);
            }
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }

    }
}
