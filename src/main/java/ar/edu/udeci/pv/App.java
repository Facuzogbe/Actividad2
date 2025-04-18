package ar.edu.udeci.pv;

import org.apache.commons.cli.*;
import org.apache.log4j.Logger;


public class App {
    private static final Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {

        logger.info("Inicio de la aplicación");

        // Crear las opciones
        Options options = new Options();
        options.addOption("n", "name", true, "Tu nombre");

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();

        try {
            // Parsear los argumentos
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("n")) {
                String name = cmd.getOptionValue("n");
                System.out.println("¡Hola, " + name + "!");
            } else {
                System.out.println("No se ingresó ningún nombre.");
            }
        } catch (ParseException e) {
            System.out.println("Error al leer los argumentos.");
            formatter.printHelp("Actividad2", options);
        }
        logger.info("Fin de la aplicación");
    }
}



