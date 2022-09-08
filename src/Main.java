public class Main
{
    public static void main(String[] args)
    {
        {
            int numeroIf = 1;
            if (numeroIf > 0) {
                System.out.println(numeroIf + " Es Positivo");
            } else if (numeroIf < 0) {
                System.out.println(numeroIf + " Es Negativo");
            } else {
                System.out.println(numeroIf + " Es Igual");
            }
            {
                System.out.println("Fin de las Condicionales");
            }
        }

        {
            int numeroWhile = -10;
            while (numeroWhile < 3)
            {
                System.out.println(numeroWhile);
                numeroWhile = numeroWhile +1;
            }
            {
                System.out.println("Fin del Bucle While");
            }
        }

        {
            int numeroDoWhile = 2;
            do
            {
                System.out.println(numeroDoWhile);
                numeroDoWhile = numeroDoWhile +1;
            } while (numeroDoWhile < 3);
            {
                System.out.println("Fin del Bucle DoWhile");
            }
        }

        {
            for (int numeroFor = 0; numeroFor <= 3; numeroFor++)
            {
                System.out.println(numeroFor);
            }
            {
                System.out.println("Fin del Bucle For");
            }
        }
        {
            var Estación = "INVIERNO";
            switch(Estación)
            {
                case "PRIMAVERA":
                    System.out.println("Estas en la estación: "+Estación);
                    break;
                case "VERANO":
                    System.out.println("Estas en la estación: "+Estación);
                    break;
                case "OTOÑO":
                    System.out.println("Estas en la estación: "+Estación);
                    break;
                case "INVIERNO":
                    System.out.println("Estas en la estación: "+Estación);
                    break;
                default:
                    System.out.println("No es una Estación");
                    break;
            }
            {
                System.out.println("Fin del Switch Case");
            }
        }
    }
}