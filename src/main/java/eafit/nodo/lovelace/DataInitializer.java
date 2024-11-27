package eafit.nodo.lovelace;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


@Component
public class DataInitializer implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(DataInitializer.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        String green = "\u001B[32m"; // Verde
        String yellow = "\u001B[33m"; // Amarillo
        String reset = "\u001B[0m";  // Reset para volver al color original

        ZonedDateTime now = ZonedDateTime.now();

        // Crear el formateador para el formato deseado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");


        System.out.println(now.format(formatter) + yellow + " WARN " + reset + " -- Se comienzan a crear los datos " +
                "iniciales");

        String UsersDataSql = "INSERT INTO users (id, email, last_name, name, register_at) VALUES " +
                "(1, 'jhondoe@mail.com', 'Doe', 'Jhon', '2024-01-15')";

        String CountriesDataSql = "INSERT INTO countries (id, city, continent, name, photos_url) VALUES " +
                "(1, 'Playa del Carmen', 'América', 'México', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/mex_playa_del_carmen.jpg'), " +
                "(2, 'Cartagena', 'América', 'Colombia', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/america/col_cartagena.jpg'), " +
                "(3, 'Rio de Janeiro', 'América', 'Brasil', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/br_rio_de_janeiro.jpg'), " +
                "(4, 'Bariloche', 'América', 'Argentina', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/ar_bariloche.jpg'), " +
                "(5, 'Cusco', 'América', 'Perú', 'https://lovelace-amadeus.s3.us-east-1.amazonaws" +
                ".com/country_img/america/per_cusco.jpg'), " +
                "(6, 'Banff', 'América', 'Canadá', 'https://lovelace-amadeus.s3.us-east-1.amazonaws" +
                ".com/country_img/america/canada_banff.jpg'), " +
                "(7, 'Nueva York', 'América', 'EE.UU.', 'https://lovelace-amadeus.s3.us-east-1.amazonaws" +
                ".com/country_img/america/eu_new_york.jpg'), " +
                "(8, 'Miami', 'América', 'EE.UU.', 'https://lovelace-amadeus.s3.us-east-1.amazonaws" +
                ".com/country_img/america/eu_miami.jpg'), " +
                "(9, 'Toronto', 'América', 'Canadá', 'https://lovelace-amadeus.s3.us-east-1.amazonaws" +
                ".com/country_img/america/canada_toronto.jpg'), " +
                "(10, 'Tulum', 'América', 'México', 'https://lovelace-amadeus.s3.us-east-1.amazonaws" +
                ".com/country_img/america/mex_tulum.jpg'), " +
                "(11, 'Ushuaia', 'América', 'Argentina', 'https://lovelace-amadeus.s3.us-east-1.amazonaws" +
                ".com/country_img/america/ar_ushuaia.jpg'), " +
                "(12, 'Punta Cana', 'América', 'República Dominicana', 'https://lovelace-amadeus.s3.us-east-1" +
                ".amazonaws.com/country_img/america/rep_dominicana_punta_cana.jpg'), " +
                "(13, 'San Juan', 'América', 'Puerto Rico', 'https://lovelace-amadeus.s3.us-east-1.amazonaws" +
                ".com/country_img/america/pr_san_juan.jpg'), " +
                "(14, 'Chicago', 'América', 'EE.UU.', 'https://lovelace-amadeus.s3.us-east-1.amazonaws" +
                ".com/country_img/america/eu_chicago.jpg'), " +
                "(15, 'Los Ángeles', 'América', 'EE.UU.', 'https://lovelace-amadeus.s3.us-east-1.amazonaws" +
                ".com/country_img/america/eu_los_angeles.jpg'), " +
                "(16, 'Honolulu', 'América', 'Hawái', 'https://lovelace-amadeus.s3.us-east-1.amazonaws" +
                ".com/country_img/america/hawai_honolulu.jpg'), " +
                "(17, 'Aspen', 'América', 'EE.UU.', 'https://lovelace-amadeus.s3.us-east-1.amazonaws" +
                ".com/country_img/america/eu_aspen.jpg'), " +
                "(18, 'Ciudad de México', 'América', 'México', 'https://lovelace-amadeus.s3.us-east-1.amazonaws" +
                ".com/country_img/america/mx_cdmx.jpg'), " +
                "(19, 'Santorini', 'Europa', 'Grecia', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/grecia_santorini.jpg'), " +
                "(20, 'Barcelona', 'Europa', 'España', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/es_barcelona.jpg'), " +
                "(21, 'Lisboa', 'Europa', 'Portugal', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/portugal_lisboa.jpg'), " +
                "(22, 'Interlaken', 'Europa', 'Suiza', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/suiza_interlaken.jpg'), " +
                "(23, 'Granada', 'Europa', 'España', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/es_granada.jpg'), " +
                "(24, 'Zermatt', 'Europa', 'Suiza', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/suiza_zermatt.jpg'), " +
                "(25, 'París', 'Europa', 'Francia', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/alemania_berlin.jpg'), " +
                "(26, 'Viena', 'Europa', 'Austria', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/austria_viena.jpg'), " +
                "(27, 'Berlín', 'Europa', 'Alemania', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/alemania_berlin.jpg'), " +
                "(28, 'Ibiza', 'Europa', 'España', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/es_ibiza.jpg'), " +
                "(29, 'Reykjavik', 'Europa', 'Islandia', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/islandia_reykjavik.jpg'), " +
                "(30, 'Algarve', 'Europa', 'Portugal', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/portugal_algarve.jpg'), " +
                "(31, 'Londres', 'Europa', 'Reino Unido', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/reino_unido_london.jpg'), " +
                "(32, 'Niza', 'Europa', 'Francia', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/francia_niza.jpg'), " +
                "(33, 'Chamonix', 'Europa', 'Francia', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/francia_chamonix.jpg'), " +
                "(34, 'Roma', 'Europa', 'Italia', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/italia_roma.jpg'), " +
                "(35, 'Malta', 'Europa', 'Malta', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/malta_malta.jpg'), " +
                "(36, 'Bora Bora', 'Oceanía', 'Polynesia', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/polynesia_bora_bora.jpg'), " +
                "(37, 'Dubái', 'Asia', 'Emiratos Árabes Unidos', 'https://lovelace-amadeus.s3.us-east-1.amazonaws.com/country_img/europa/emiratos_dubai.jpg');";


        String SuggestionDataSql = "INSERT INTO suggestions (id, climate, activity, housing, duration, age, " +
                "america_country_id, europa_country_id) VALUES " +
                "(1, 'Caluroso', 'Relax y bienestar', 'Hotel de lujo', 'Una a dos semanas', 'Menos de 30 años', 1, 19), " +
                "(2, 'Caluroso', 'Cultura y museos', 'Airbnb o apartamento', 'Menos de una semana', 'Menos de 30 años', 2, 20), " +
                "(3, 'Templado', 'Cultura y museos', 'Hotel de lujo', 'Una a dos semanas', '30-50 años', 3, 21), " +
                "(4, 'Frío', 'Deportes y aventuras', 'Albergue', 'Una a dos semanas', 'Menos de 30 años', 4, 22), " +
                "(5, 'Templado', 'Cultura y museos', 'Airbnb o apartamento', 'Una a dos semanas', 'Más de 50 años', 5, 23), " +
                "(6, 'Frío', 'Deportes y aventuras', 'Hotel de lujo', 'Una a dos semanas', '30-50 años', 6, 24), " +
                "(7, 'Templado', 'Cultura y museos', 'Hotel de lujo', 'Una a dos semanas', 'Más de 50 años', 7, 25), " +
                "(8, 'Templado', 'Relax y bienestar', 'Airbnb o apartamento', 'Menos de una semana', 'Menos de 30 años', 8, 26), " +
                "(9, 'Frío', 'Cultura y museos', 'Hotel de lujo', 'Una a dos semanas', '30-50 años', 9, 27), " +
                "(10, 'Caluroso', 'Deportes y aventuras', 'Hostal', 'Una a dos semanas', 'Menos de 30 años', 10, 28), " +
                "(11, 'Frío', 'Cultura y museos', 'Airbnb o apartamento', 'Una a dos semanas', 'Más de 50 años', 11, 29), " +
                "(12, 'Templado', 'Relax y bienestar', 'Airbnb o apartamento', 'Más de dos semanas', 'Más de 50 años', 12, 30), " +
                "(13, 'Templado', 'Deportes y aventuras', 'Hotel de lujo', 'Menos de una semana', '30-50 años', 14, 31), " +
                "(14, 'Templado', 'Cultura y museos', 'Albergue', 'Una a dos semanas', 'Menos de 30 años', 13, 32), " +
                "(15, 'Templado', 'Deportes y aventuras', 'Airbnb o apartamento', 'Más de dos semanas', 'Menos de 30 años', 5, 33), " +
                "(16, 'Caluroso', 'Cultura y museos', 'Hotel de lujo', 'Una a dos semanas', 'Más de 50 años', 15, 34), " +
                "(17, 'Caluroso', 'Cultura y museos', 'Hotel de lujo', 'Una a dos semanas', '30-50 años', 16, 35), " +
                "(18, 'Frío', 'Relax y bienestar', 'Airbnb o apartamento', 'Una a dos semanas', 'Más de 50 años', 17, 26), " +
                "(19, 'Templado', 'Cultura y museos', 'Albergue', 'Una a dos semanas', '30-50 años', 18, 20), " +
                "(20, 'default', 'default', 'default', 'default', 'default', 36, 37);";


        entityManager.createNativeQuery(CountriesDataSql).executeUpdate();
        entityManager.createNativeQuery(UsersDataSql).executeUpdate();
        entityManager.createNativeQuery(SuggestionDataSql).executeUpdate();

        ZonedDateTime SecondNow = ZonedDateTime.now();

        System.out.println(SecondNow.format(formatter) + green + " SUCCES " + reset + " --- Se crearon de manera " +
                "exitosa " +
                "los datos" +
                " " +
                "iniciales");

    }
}
