package com.proyecto.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        System.out.println(app.bowling_score("9/ 70 8/ 42 41 50 09 5/ X 1/X"));
    }


    static int contadorXconsecutivas = 0;
   
    public static int encontrarX(String [] datos, int suma, int i, int longi){

        if(longi == 1){
            if(datos[i].charAt(0)=='X'){
                if(datos[i+1].length() == 2){
                    if(datos[(i+1)].charAt(1) == '/'){
                        suma += 20;
                    }else{
                        suma += (( Character.getNumericValue(datos[(i+1)].charAt(0)) + Character.getNumericValue(datos[(i+1)].charAt(1))) + 10);
                    }
                }else if(datos[i+1].length() == 1 && datos[(i+1)].charAt(0) == 'X'){
                    contadorXconsecutivas = i + 2;
                    if(datos[(contadorXconsecutivas)].charAt(0) == 'X'){
                        suma += 30;
                        //hay tres x consecuitivas    
                    }else{
                        suma += 20 + Character.getNumericValue(datos[contadorXconsecutivas].charAt(0));
                    }
                }else if(datos[i+1].length() == 3){
                    if(datos[(i+1)].charAt(0) != 'X' && datos[(i+1)].charAt(1) == '/'){
                        suma += 20;
                    }else{
                        suma += 30;
                    }
                    
                }else if(datos[i+1].charAt(0) !='X'){
                    suma += (Character.getNumericValue(datos[(i+1)].charAt(0)) + 20);
                }
            }
        }else if(longi == 2 && datos[i].charAt(0)=='X' && datos[i].charAt(1)=='X'){
            suma = suma + 30;
        }else if(longi == 3 && datos[i].charAt(0)=='X' && datos[i].charAt(1)=='X' && datos[i].charAt(2)=='X'){
            suma = suma + 30;
        }
         return suma;
    }

    public static int encontrarNumeros(String [] datos, int suma, int i){
           suma += Character.getNumericValue(datos[i].charAt(0)) + Character.getNumericValue(datos[i].charAt(1));
            return suma;
    }

    public static int encontrarBarra(String [] datos, int suma, int i){
        if(datos[(i+1)].charAt(0) == 'X'){
            suma +=  10 +  10;
        }else{
            suma +=  10 +  Character.getNumericValue(datos[(i+1)].charAt(0));
        }
        return suma;
    }

    public static int bowling_score (String frames){

        String[] datos = frames.split(" ");
        int suma = 0;
        int sumax = 0;
        int puntero = 0;

        for(int i = 0; i < datos.length; i++){

            if(datos[i].length() == 1){
               if(datos[i].charAt(0)=='X'){
                suma = encontrarX(datos, suma, i,1);
               }

            }else if(datos[i].length() == 2){

                if(datos[i].charAt(0)=='X' && datos[i].charAt(1)=='X'){
                    suma = encontrarX(datos, suma, i,2);
                }else if(datos[i].charAt(0)=='/' | datos[i].charAt(1)=='/'){
                    suma = encontrarBarra(datos, suma, i);
                }else{
                    suma = encontrarNumeros(datos,suma,i);
                }

            }else if(datos[i].length() == 3){

                if(datos[i].charAt(0)=='X' && datos[i].charAt(1)=='X' && datos[i].charAt(2)=='X'){
                    //suma = encontrarX(datos, suma, i,3);
                    suma += 30;
                }else if(datos[i].charAt(0)=='X' && datos[i].charAt(1)=='X' && datos[i].charAt(2)!='X'){
                        suma += 20 + Character.getNumericValue(datos[i].charAt(2));
                }else if(datos[i].charAt(0)=='X' && datos[i].charAt(1)!='X'){
                    //x4/
                    if(datos[i].charAt(0)=='X' && datos[i].charAt(2)=='/' && datos[i].charAt(1)!='X'){
                        suma += 20;
                    }
                    //x44
                    if(datos[i].charAt(0)=='X' && datos[i].charAt(2)!='/'){
                        suma += (( Character.getNumericValue(datos[i].charAt(1)) + Character.getNumericValue(datos[i].charAt(2))) + 10);
                    }
                }else if(datos[i].charAt(1)=='/' | datos[i].charAt(2)=='/'){
                    //_/_
                    if(datos[i].charAt(1)=='/'){
                        //_/X
                        if(datos[i].charAt(2)=='X'){
                            suma += 20;

                        }else{ //_/_
                            suma += 10 + Character.getNumericValue(datos[i].charAt(2));
                        }
                    }else if(datos[i].charAt(2)=='/'){
                        suma += 10 + Character.getNumericValue(datos[i].charAt(0));
                    }

                  //  suma = suma + (10 + Character.getNumericValue(datos[i].charAt(2)));
                }else{
                    suma = suma + (Character.getNumericValue(datos[i].charAt(0)) + Character.getNumericValue(datos[i].charAt(1)) + Character.getNumericValue(datos[i].charAt(2)));
                }
        }
    }
    return suma;
 }

}
