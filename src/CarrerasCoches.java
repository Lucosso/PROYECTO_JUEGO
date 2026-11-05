/*

Autor: Lucas Rodriguez Martinez
Fecha de comienzo: 15/10/2026

*/


import java.util.ArrayList;
import java.util.Scanner;

public class CarrerasCoches {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        /*
        ============================
        |PRIMER BLOQUE DE VARIABLES|
        ============================

        DECLARAMOS LAS VARIABLES QUE VAMOS A USAR
        
        */

        int opcion = 0;
        double saldoInicial = 1000000.00;
        ArrayList<String> cochesComprados = new ArrayList<>();

        /*
        
        ===============================
        | SEGUNDO BLOQUE DE VARIABLES |
        ===============================

        VARIABLES DE LOS COCHES PARA UTILIZARLAS EN LA TIENDA DEL JUEGO
        
        */

        //BMW M3 cs
        String bmw = "BMW M3 cs";
        int cvBmw = 450;
        int velocidaMaximaBmw = 240;
        double ceroCienBmw = 5.4;
        //mejorar el cero a cien si el usuario mejora el motor del coche
        final double NIVELDOSBMWMOTOR = 4.9;
        final double NIVELTRESBMWMOTOR = 4.3;
        final double NIVELCUATROBMWMOTOR = 3.6;
        //------------------------------
        final double PRECIO_BMW = 85000.00;

        // Mercedes AMG GT63
        String mercedes = "Mercedes AMG GT63";
        int cvMer = 480;
        int velocidaMaximaMer = 230;
        double ceroCienMer = 4.3;
        //mejorar el cero a cien si el usuario mejora el motor del coche
        final double NIVELDOSMERMOTOR = 3.7;
        final double NIVELTRESMERMOTOR = 3.3;
        final double NIVELCUATROMERMOTOR = 2.8;
        //------------------------------
        final double PRECIO_MERCEDES = 80000.00;

        //Ferrari SF90
        String ferrari = "Ferrari SF90";
        int cvFer = 880;
        int velocidaMaximaFer = 240;
        double ceroCienFer = 3.2;
        //mejorar el cero a cien si el usuario mejora el motor del coche
        final double NIVELDOSFERMOTOR = 2.9;
        final double NIVELTRESFERMOTOR = 2.5;
        final double NIVELCUATROFFERMOTOR = 1.9;
        //-------------------------------
        final double PRECIO_FERRARI = 110000.00;

        // Porsche gt3 rs
        String porsche = "Porsche GT3 RS";
        int cvPor = 450;
        int velocidaMaximaPor = 196;
        //--------------------------------
        double ceroCienPor = 4.2;
        //mejorar el cero a cien si el usuario mejora el motor del coche
        final double NIVELDOSPORMOTOR = 3.7;
        final double NIVELTRESPORMOTOR = 3.4;
        final double NIVELCUATROPORMOTOR = 2.9;
        //--------------------------------
        final double PRECIO_PORSCHE = 150000.00 ;

        /*
        
        ===========================
        | PRIMER BLOQUE DE CODIGO |
        ===========================
        
        EN ESTE BLOQUE LO QUE VAMOS HACER ES DECIR DE QUE VA EL JUEGO Y LAS REGLAS QUE VA A TENER

        */

        System.out.println("""
                    ==================================
                    | BIENVENDO A CARRERAS DE COCHES |
                    ==================================
                
        EN ESTE JUEGO TENDRAS QUE COMPRAR UN COCHE INICIAL CON\n
        UN SALDO INICIAL DE 100.000€. TENDRAS QUE ELEGIR ENTRE LOS\n
        4 COCHES QUE HAY EN ESTE JUEGO.

        TENDRAS VARIAS OPCIONES QUE YA VERAS CUANDO ENTRES EN EL\n
        JUEGO, ENTRE ELLAS TENDRAS TU GARAJE Y EL TALLER DONDE PODRAS\n
        MEJORAR TUS COCHES PARA QUE DEN EL MAXIMO DE SU POTENCIA EN EL\n
        CICUITO.
        ================================================================
        |                  ESPEREMOS QUE TE GUSTE ;)                   |
        ================================================================\n
        """);

        /*
        
        =============================
        | SEEGUNDO BLOQUE DE CODIGO |
        =============================

        -EN ESTE BLOQUE LO QUE HAREMOS SERA MOSTRAR UN MENU AL USUARIO PARA QUE ELIGA QUE QUIERE HACER EN EL JUEGO
        -TENDRA QUE ELEGIR UNA OPCION VALIDA DEL 1 - 5 PERO SI INSERTA UN NUMERO MAYOR A 5 VA A VOLVER A ENSEÑAR EL MENU
        
        */

        while (opcion != 5) {

            System.out.println("1) Ver garaje.\n2) Comprar coches.\n3) Mejorar coche.\n4) Competir.\n5) Salir.\n");

            System.out.print("Marque la opcion que quiera: ");
            opcion = sc.nextInt();
            System.out.println(" ");
            /*
            
            ===========================
            | TERCER BLOQUE DE CODIGO |
            ===========================

            -EN ESTE BLOQUE CREAREMOS UNA ESTRUCTURA SWITCH PARA CADA CASO DEL MENU
            -EN CADA CASO DESARROLLAREMOS EL CODIGO QUE PERTENECE A ESE CASO

            */

            switch (opcion) {
                case 1:
                    System.out.println("-----BIENVENIDO A TU GARAJE-----\n");

                    if (cochesComprados.size() > 0) {
                        if (cochesComprados.size() > 0){
                            System.out.println("-----TUS COCHES COMPRADOS-----\n");
                            System.out.println("Coches en propiedad: " + cochesComprados + "\n");
                        }
                    }else{
                        if (cochesComprados.size() == 0){
                            System.out.println("-----TUS COCHES COMPRADOS-----\n");
                            
                        }
                        System.out.println( "====================================================");
                        System.out.println("Actualmente no tiene coches comprados en su garaje.|\nAcceda en ||Comprar Coches|| para tener un coche.  |");
                        System.out.println( "====================================================\n");
                    }
                    break;
                case 2:

                    //DECLARO LA VARIABLE PARA COMPRAR EL COCHE 
                    int opcionComprarCoche;
                    
                    do {

                        System.out.println("-----BIENVENIDO A LA TIENDA-----\n");
                        System.out.println("A continuacion le mostramos una tabla con los coches que tenemos disponibles en nuestra tienda\n");
                        
                        // CREAMOS LA TALA CON EL MODELO, CV, VELOCIDAD MAXIMA, CERO A CIEN Y EL PRECIO DE CADA COCHE

                        System.out.printf("|%-20s|%-8s|%-20s|%-8s|%-8s%n", "MODELO", "CV", "VELOCIDAD MAXIMA", "CERO A CIEN", "PRECIO ");
                        System.out.printf("|%-20s|%-8d|%-20d|%-11.1f|%-8s%n" ,bmw , cvBmw , velocidaMaximaBmw, ceroCienBmw, PRECIO_BMW);
                        System.out.printf("|%-20s|%-8d|%-20d|%-11.1f|%-8s%n", mercedes , cvMer , velocidaMaximaMer, ceroCienMer, PRECIO_MERCEDES);
                        System.out.printf("|%-20s|%-8d|%-20d|%-11.1f|%-8s%n", ferrari , cvFer , velocidaMaximaFer, ceroCienFer, PRECIO_FERRARI);
                        System.out.printf("|%-20s|%-8d|%-20d|%-11.1f|%-8s%n", porsche , cvPor, velocidaMaximaPor, ceroCienPor, PRECIO_PORSCHE);

                        System.out.println(" ");
                        
                        System.out.println("SALDO DISPONIBLE:\n" + saldoInicial );

                        System.out.println("-----ELIGA EL COCHE QUE QUIERTA COMPRAR-----\n1) BMW M3 cs\n2) Mercedes AMG GT63\n3) Ferrari SF90\n4) Porsche GT3 RS\n5) Salir.\n");
                        opcionComprarCoche = sc.nextInt(); 

                        /*
                        
                        VAMOS A CREAR UNA ESTRUCTURA DE TIPO SWITCH PARA CADA CASO DE CADA COCHE
                        EN CADA OPCION CREAMOS LA OPCION DE COMPRA DEL PRIMER COCHE
                        Y LAS REGLAS PARA SABER SI PUEDE COMPRAR EL COCHE CON EL SALDO

                        -IMPLEMENTARE LA FUNCION DE Thread.sleep PARA ESPERAR UNOS SEGUNDOS ANTES
                        DE MOSTRAR SI LA COMPRA FUE EXITOSA O EL SALDO ES INSUFICIENTE
                        
                        */                    
                
                        switch (opcionComprarCoche) {
                            case 1:
                                
                                if (saldoInicial >= PRECIO_BMW) {
                                    
                                    // PONEMOS LA FRASE DE COMRA EN CURSO PARA QUE SE SEPA QUE SE ESTA HACIENDO LA COMPRA
                                    System.out.println("COMPRA EN CURSO...\n");

                                    // HACEMOS UNA ESPERA DE 2 SEGUNDOS PARA HACER MAS REAL LA COMPRA
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException espera3Segundos){ // CON InterruptedException CONTROLAMOS LOS ERRORES PARA QUE NO PUEDA SER INTERRIMPIDO POR OTRO HILO
                                        espera3Segundos.printStackTrace();
                                    }

                                    System.out.println("¡¡¡Enhorabuenaa!!!, te acabas de comprar el coche: " + bmw + "\n");
                                    saldoInicial = saldoInicial - PRECIO_BMW;
                                    cochesComprados.add(bmw); // añadimos el coche que a acaba de comprar a la lista de cochesComprados
                                    System.out.println("Se acaba de añadir a tu garaje el coche: " + bmw + "\n"); // le decimos que se acaba de añadir
                                    System.out.println("Saldo restante: " + saldoInicial + "\n");

                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException espera2Segundos){
                                        espera2Segundos.printStackTrace();
                                    }

                                } else{

                                    System.out.println("COMPRA EN CURSO...\n");

                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException espera3Segundos){
                                        espera3Segundos.printStackTrace();
                                    }

                                    if (saldoInicial < PRECIO_BMW){
                                        System.out.println("¡¡¡ ERROR. SALDO INSUFICIENTE !!!\n");
                                    }
                                }

                                

                                break;
                            case 2:

                                if (saldoInicial >= PRECIO_MERCEDES) {

                                    System.out.println("COMPRA EN CURSO...\n");

                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException espera3Segundos){
                                        espera3Segundos.printStackTrace();
                                    }

                                    System.out.println("¡¡¡Enhorabuenaa!!!, te acabas de comprar el coche: " + mercedes + "\n");
                                    saldoInicial = saldoInicial - PRECIO_MERCEDES;
                                    cochesComprados.add(mercedes);
                                    System.out.println("Se acaba de añadir a tu garaje el coche: " + mercedes + "\n");
                                    System.out.println("Saldo restante: " + saldoInicial + "\n");

                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException espera2Segundos){
                                        espera2Segundos.printStackTrace();
                                    }

                                } else{

                                    System.out.println("COMPRA EN CURSO...\n");

                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException espera3Segundos){
                                        espera3Segundos.printStackTrace();
                                    }

                                    if (saldoInicial < PRECIO_MERCEDES){
                                        System.out.println("¡¡¡ ERROR. SALDO INSUFICIENTE !!!\n");
                                    }
                                }

                                break;
                            case 3:

                                if (saldoInicial >= PRECIO_FERRARI) {

                                    System.out.println("COMPRA EN CURSO...\n");

                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException espera3Segundos){
                                        espera3Segundos.printStackTrace();
                                    }

                                    System.out.println("¡¡¡Enhorabuenaa!!!, te acabas de comprar el coche: " + ferrari + "\n");
                                    saldoInicial = saldoInicial - PRECIO_FERRARI;
                                    cochesComprados.add(ferrari);
                                    System.out.println("Se acaba de añadir a tu garaje el coche: " + ferrari + "\n");
                                    System.out.println("Saldo restante: " + saldoInicial + "\n");

                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException espera2Segundos){
                                        espera2Segundos.printStackTrace();
                                    }

                                } else{
                                    System.out.println("COMPRA EN CURSO...\n");
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException espera3Segundos){
                                        espera3Segundos.printStackTrace();
                                    }
                                    if (saldoInicial < PRECIO_FERRARI){
                                        System.out.println("¡¡¡ ERROR. SALDO INSUFICIENTE !!!");
                                    }
                                }

                                break;
                            case 4:

                                if (saldoInicial >= PRECIO_PORSCHE) {
                                    System.out.println("COMPRA EN CURSO...\n");

                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException espera3Segundos){
                                        espera3Segundos.printStackTrace();
                                    }

                                    System.out.println("¡¡¡Enhorabuenaa!!!, te acabas de comprar el coche: " + porsche + "\n");
                                    saldoInicial = saldoInicial - PRECIO_PORSCHE;
                                    cochesComprados.add(porsche);
                                    System.out.println("Se acaba de añadir a tu garaje el coche: " + porsche + "\n");
                                    System.out.println("Saldo restante: " + saldoInicial + "\n");

                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException espera2Segundos){
                                        espera2Segundos.printStackTrace();
                                    }
                                } else{
                                    System.out.println("COMPRA EN CURSO...\n");
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException espera3Segundos){
                                        espera3Segundos.printStackTrace();
                                    }

                                    if (saldoInicial < PRECIO_PORSCHE){
                                        System.out.println("¡¡¡ERROR. SALDO INSUFICIENTE !!!\n");
                                    }
                                }

                                break;

                            default:
                                break;
                        }

                    } while (opcionComprarCoche != 5);

                    break;

                    
                case 3:
                    
                    if (cochesComprados.size() == 0){
                        System.out.println("No puedes acceder al garaje ya que no tiene ningun coche :/\n");
                        break;
                    }

                    int k = 0;
                    int opcionModificacion = 0;
                    int cocheElegido;

                    // lo que hago aqui es que si el juegador mete una opcion que no corresponde a ningun puesto de el coche que tenga
                    // la pregunta se repetira hasta que meta la posicion en la que corresponda el coche que tenga el jugador

                    do {

                        System.out.println("-----BIENVENIDO AL TALLER-----\n");
                        System.out.println("-----TUS COCHES DISPONIBLES-----");
                        // imprimo todos los coches que el jugador tiene en el garaje
                        for (k = 0; k < cochesComprados.size(); k++){
                            System.out.println((k + 1) + ") " + cochesComprados.get(k));
                        }
                        System.out.print("¿Que coche quieres mejorar?: ");
                        cocheElegido = sc.nextInt();

                        //si el jugador introduce un numero superior o inferio a los coches que tiene en el garaje le dara error y el programa pregunta de nuevo

                        if (cocheElegido < 1 || cocheElegido > cochesComprados.size()){
                            System.out.println("ERROR. Opcion no valida intenlo de nuevo...\n");
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException espera2Segundos){
                                espera2Segundos.printStackTrace();
                            }
                        }
                        
                    } while (cocheElegido < 1 || cocheElegido > cochesComprados.size());

                    int i = 0;

                    for (i = 0; i < cochesComprados.size(); i++){
                        System.out.println("Has elegido mejorar el coche -> " + cochesComprados.get(i));
                        
                        int j = 0;
                        System.out.println("-----COMPONENTES DEL COCHE A MEJORAR-----");
                        String[] componentesCochesMejorar = {"Motor 100 ", "Turbo 150 ", "Transmision 300 ", "Ruedas 230 "};

                        for (j = 0; j < componentesCochesMejorar.length; j++){
                            System.out.println((j + 1) + ")" + componentesCochesMejorar[j]);
                        }

                        do {
                                                        
                            System.out.print("¿Que componente del " + cochesComprados.get(i) + " va a querer mejorar?: \n" );
                            opcionModificacion = sc.nextInt();

                            if (opcionModificacion < 1 || opcionModificacion > componentesCochesMejorar.length){
                                System.out.println("ERROR. La opcion no es correcta. Intentelo de nuevo");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException espera2Segundos){
                                    espera2Segundos.printStackTrace();
                                }
                            }

                            /*
                
                            estos vectores que declaro son los niveles de los componentes de los coches
                            Primera posicion: nivel 1 del motor
                            Segunda posicion: nivel 1 del turbo
                            Tercera posicion: nivel 1 de la transmision
                            Cuarta posicicion: nivel 1 de las ruedas 
                            
                            */

                            int[] nivelesBmw = {1, 1, 1, 1};
                            int[] nivelesMer = {1, 1, 1, 1};
                            int[] nivelesFer = {1, 1, 1, 1};
                            int[] nivelesPor = {1, 1, 1, 1};

                            // subimos el motor de nivel

                            switch (opcionModificacion) {
                                case 1:
                                    //mejoramos el nivel del BMW
                                    
                                    if(cochesComprados.get(i).equals(bmw)){

                                        if(nivelesBmw[0] == 1){
                                            nivelesBmw[0] = 2;
                                            saldoInicial -= 100;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesBmw[0]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesBmw[0] == 2){
                                            nivelesBmw[0] = 3;
                                            saldoInicial -= 100;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesBmw[0]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesBmw[0] == 3){
                                            nivelesBmw[0] = 4;
                                            saldoInicial -= 100;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesBmw[0]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else{
                                            if(nivelesBmw[0] == 4){
                                               System.out.println("¡¡¡ NIVEL MAXIMO !!!");
                                            }
                                        }

                                    }
                                    
                                    //mejoramos el nivel de motor del Mercedes

                                    if(cochesComprados.get(i).equals(mercedes)){

                                        if(nivelesMer[0] == 1){
                                            nivelesMer[0] = 2;
                                            saldoInicial -= 100;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesMer[0]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesMer[0] == 2){
                                            nivelesMer[0] = 3;
                                            saldoInicial -= 100;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesMer[0]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesMer[0] == 3){
                                            nivelesMer[0] = 4;
                                            saldoInicial -= 100;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesMer[0]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else{
                                            if(nivelesMer[0] == 4){
                                                System.out.println("¡¡¡ NIVEL MAXIMO !!!");
                                            }
                                        }

                                    }

                                    //mejoramos el nivel del motor del ferrari

                                    if(cochesComprados.get(i).equals(ferrari)){

                                        if(nivelesMer[0] == 1){
                                            nivelesFer[0] = 2;
                                            saldoInicial -= 100;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesFer[0]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesMer[0] == 2){
                                            nivelesFer[0] = 3;
                                            saldoInicial -= 100;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesFer[0]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesFer[0] == 3){
                                            nivelesFer[0] = 4;
                                            saldoInicial -= 100;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesFer[0]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else{
                                            if(nivelesFer[0] == 4){
                                                System.out.println("¡¡¡ NIVEL MAXIMO !!!");
                                            }
                                        }

                                    }
                                    
                                    //mejoramos el motor del porsche

                                    if(cochesComprados.get(i).equals(porsche)){

                                        if(nivelesPor[0] == 1){
                                            nivelesPor[0] = 2;
                                            saldoInicial -= 100;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesPor[0]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesPor[0] == 2){
                                            nivelesPor[0] = 3;
                                            saldoInicial -= 100;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesPor[0]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesPor[0] == 3){
                                            nivelesPor[0] = 4;
                                            saldoInicial -= 100;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesPor[0]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else{
                                            if(nivelesPor[0] == 4){
                                                System.out.println("¡¡¡ NIVEL MAXIMO !!!");
                                            }
                                        }
                                    }

                                    break;
                                case 2:

                                    //ahora vamos a mejorar

                                    // mejoraremos el turbo de cada coche

                                    if(cochesComprados.get(i).equals(bmw)){

                                        if(nivelesBmw[1] == 1){
                                            nivelesBmw[1] = 2;
                                            saldoInicial -= 150;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesBmw[1]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesBmw[1] == 2){
                                            nivelesBmw[1] = 3;
                                            saldoInicial -= 150;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesBmw[1]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesBmw[1] == 3){
                                            nivelesBmw[1] = 4;
                                            saldoInicial -= 150;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesBmw[1]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else{
                                            if(nivelesBmw[1] == 4){
                                                System.out.println("¡¡¡ NIVEL MAXIMO !!!");
                                            }
                                        }
                                    }

                                    //mejoramos el turbo del mercedes

                                    if(cochesComprados.get(i).equals(mercedes)){

                                        if(nivelesMer[1] == 1){
                                            nivelesMer[1] = 2;
                                            saldoInicial -= 150;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesMer[1]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesMer[1] == 2){
                                            nivelesMer[1] = 3;
                                            saldoInicial -= 150;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesMer[1]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesMer[1] == 3){
                                            nivelesMer[1] = 4;
                                            saldoInicial -= 150;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesMer[1]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else{
                                            if(nivelesMer[1] == 4){
                                                System.out.println("¡¡¡ NIVEL MAXIMO !!!");
                                            }
                                        }
                                    }

                                    // mejoramor turbo del porsche

                                    if(cochesComprados.get(i).equals(ferrari)){

                                        if(nivelesFer[1] == 1){
                                            nivelesFer[1] = 2;
                                            saldoInicial -= 150;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesFer[1]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesFer[1] == 2){
                                            nivelesFer[1] = 3;
                                            saldoInicial -= 150;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesFer[1]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesFer[1] == 3){
                                            nivelesFer[1] = 4;
                                            saldoInicial -= 150;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesFer[1]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else{
                                            if(nivelesFer[1] == 4){
                                                System.out.println("¡¡¡ NIVEL MAXIMO !!!");
                                            }
                                        }
                                    }

                                    // mejoramos turbo del porsche

                                    if(cochesComprados.get(i).equals(ferrari)){

                                        if(nivelesPor[1] == 1){
                                            nivelesPor[1] = 2;
                                            saldoInicial -= 150;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesPor[1]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesPor[1] == 2){
                                            nivelesPor[1] = 3;
                                            saldoInicial -= 150;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesPor[1]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesPor[1] == 3){
                                            nivelesPor[1] = 4;
                                            saldoInicial -= 150;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesPor[1]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else{
                                            if(nivelesPor[1] == 4){
                                                System.out.println("¡¡¡ NIVEL MAXIMO !!!");
                                            }
                                        }
                                    }
                                break;

                                case 3:

                                    // mejoramos la transmision de cada coche

                                    if(cochesComprados.get(i).equals(mercedes)){

                                        if(nivelesMer[2] == 1){
                                            nivelesMer[2] = 2;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesMer[2]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesMer[2] == 2){
                                            nivelesMer[2] = 3;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesMer[2]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesMer[2] == 3){
                                            nivelesMer[2] = 4;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesMer[2]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else{
                                            if(nivelesMer[2] == 4){
                                                System.out.println("¡¡¡ NIVEL MAXIMO !!!");
                                            }
                                        }
                                    }

                                    if(cochesComprados.get(i).equals(bmw)){

                                        if(nivelesBmw[2] == 1){
                                            nivelesBmw[2] = 2;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesBmw[2]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesBmw[2] == 2){
                                            nivelesBmw[2] = 3;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesBmw[2]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesBmw[2] == 3){
                                            nivelesBmw[2] = 4;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesBmw[2]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else{
                                            if(nivelesBmw[2] == 4){
                                                System.out.println("¡¡¡ NIVEL MAXIMO !!!");
                                            }
                                        }
                                    }

                                    if(cochesComprados.get(i).equals(ferrari)){

                                        if(nivelesFer[2] == 1){
                                            nivelesFer[2] = 2;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesFer[2]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesFer[2] == 2){
                                            nivelesFer[2] = 3;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesFer[2]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesFer[2] == 3){
                                            nivelesFer[2] = 4;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesFer[2]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else{
                                            if(nivelesFer[2] == 4){
                                                System.out.println("¡¡¡ NIVEL MAXIMO !!!");
                                            }
                                        }
                                    }

                                    if(cochesComprados.get(i).equals(porsche)){

                                        if(nivelesPor[2] == 1){
                                            nivelesPor[2] = 2;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesPor[2]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesPor[2] == 2){
                                            nivelesPor[2] = 3;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesPor[2]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesPor[2] == 3){
                                            nivelesPor[2] = 4;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesPor[2]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else{
                                            if(nivelesPor[2] == 4){
                                                System.out.println("¡¡¡ NIVEL MAXIMO !!!");
                                            }
                                        }
                                    }

                                    break;
                                
                                case 4:

                                    // mejoramos las ruedas de los coches

                                    if(cochesComprados.get(i).equals(bmw)){

                                        if(nivelesBmw[3] == 1){
                                            nivelesBmw[3] = 2;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesBmw[3]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesBmw[3] == 2){
                                            nivelesBmw[3] = 3;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesBmw[3]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesBmw[3] == 3){
                                            nivelesBmw[3] = 4;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesBmw[3]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else{
                                            if(nivelesBmw[3] == 4){
                                                System.out.println("¡¡¡ NIVEL MAXIMO !!!");
                                            }
                                        }
                                    }

                                    if(cochesComprados.get(i).equals(mercedes)){

                                        if(nivelesMer[3] == 1){
                                            nivelesMer[3] = 2;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesMer[3]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesMer[3] == 2){
                                            nivelesMer[3] = 3;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesMer[3]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesMer[3] == 3){
                                            nivelesMer[3] = 4;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesMer[3]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else{
                                            if(nivelesMer[3] == 4){
                                                System.out.println("¡¡¡ NIVEL MAXIMO !!!");
                                            }
                                        }
                                    }

                                    if(cochesComprados.get(i).equals(ferrari)){

                                        if(nivelesFer[3] == 1){
                                            nivelesFer[3] = 2;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesFer[3]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesFer[3] == 2){
                                            nivelesFer[3] = 3;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesFer[3]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesFer[3] == 3){
                                            nivelesFer[3] = 4;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesFer[3]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else{
                                            if(nivelesFer[3] == 4){
                                                System.out.println("¡¡¡ NIVEL MAXIMO !!!");
                                            }
                                        }
                                    }

                                    if(cochesComprados.get(i).equals(porsche)){

                                        if(nivelesPor[3] == 1){
                                            nivelesPor[3] = 2;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesPor[3]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesPor[3] == 2){
                                            nivelesPor[3] = 3;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesPor[3]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else if(nivelesPor[3] == 3){
                                            nivelesPor[3] = 4;
                                            saldoInicial -= 300;
                                            System.out.println("Acabas de mejorar el motor al nivel ->" + nivelesPor[3]);
                                            System.out.println("Saldo restante: " + saldoInicial);
                                        }else{
                                            if(nivelesPor[3] == 4){
                                                System.out.println("¡¡¡ NIVEL MAXIMO !!!");
                                            }
                                        }
                                    }


                            
                                default:
                                    if (opcionModificacion <= 5){
                                        break;
                                    }

                                    
                                    
                            }

                        } while (opcionModificacion < 1 || opcionModificacion > componentesCochesMejorar.length );
                    }

                    

                    break;
                case 4:
                    
                    // DECLARO LA VARIBALE PARA LA OPCION DEL CIRCUTO
                    int opcionCircuito;

                    System.out.println("-----BIENVENIDO A LOS CIRCUITOS-----\n");
                    System.out.println("Aqui tendras varios circuitos del mundo los cuales tendras que competir\npara ganar dinero y poder mejorar los coches\nde tu garaje.");

                    do {
                        
                        System.out.println("""
                            ===================================
                            | ELIJA EL CIRCUTO PARA COMPETIR: |
                            ===================================

                            1) Circuito de Monaco (Monaco)
                            2) Circuito de Jarama (España)
                            3) Circuito de Nurburgring (Alemania)
                            4) Circuito de Jerez (España)
                            5) Salir de circuitos

                            """);
                            
                            System.out.print("¿En cual va a competir?: ");
                            opcionCircuito = sc.nextInt();

                            if (opcionCircuito == 1){
                                System.out.println("A elegido usted el ciruito de Monaco (Monaco)");
                            }else if (opcionCircuito == 2){
                                System.out.println("A elegido usted el ciruito de Jarama (España)");
                            }else if (opcionCircuito == 3){
                                System.out.println("A elegido usted el ciruito de Nurburgrind (Alemania)");
                            }else if (opcionCircuito == 4){
                                System.out.println("A elegido usted el ciruito de Jerez (España)");
                            }else{
                                if (opcionCircuito == 5){
                                    System.out.println("Saliendo de circuitos...\n");
                                }
                            }

                    } while (opcionCircuito != 5);

                    break;
                case 5:
                    System.out.println("Saliendo del juego...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException espera3Segundos){ // CON InterruptedException CONTROLAMOS LOS ERRORES PARA QUE NO PUEDA SER INTERRIMPIDO POR OTRO HILO
                            espera3Segundos.printStackTrace();
                    }
                default:
                    if (opcion > 5){
                        System.out.println("ERROR. Opcion no valida, debes marcar entre 1 y 5\n");
                    }
                   break;
            }     
        }

        sc.close();
    }
}