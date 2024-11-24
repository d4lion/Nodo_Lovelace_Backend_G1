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
                "(1, 'Playa del Carmen', 'América', 'México', 'url_foto_mexico'), " +
                "(2, 'Cartagena', 'América', 'Colombia', 'url_foto_colombia'), " +
                "(3, 'Rio de Janeiro', 'América', 'Brasil', 'url_foto_brasil'), " +
                "(4, 'Bariloche', 'América', 'Argentina', 'url_foto_argentina'), " +
                "(5, 'Cusco', 'América', 'Perú', 'url_foto_peru'), " +
                "(6, 'Banff', 'América', 'Canadá', 'url_foto_canada'), " +
                "(7, 'Nueva York', 'América', 'EE.UU.', 'url_foto_usa'), " +
                "(8, 'Miami', 'América', 'EE.UU.', 'url_foto_usa'), " +
                "(9, 'Toronto', 'América', 'Canadá', 'url_foto_canada'), " +
                "(10, 'Tulum', 'América', 'México', 'url_foto_mexico'), " +
                "(11, 'Ushuaia', 'América', 'Argentina', 'url_foto_argentina'), " +
                "(12, 'Punta Cana', 'América', 'República Dominicana', 'url_foto_rd'), " +
                "(13, 'San Juan', 'América', 'Puerto Rico', 'url_foto_pr'), " +
                "(14, 'Chicago', 'América', 'EE.UU.', 'url_foto_usa'), " +
                "(15, 'Los Ángeles', 'América', 'EE.UU.', 'url_foto_usa'), " +
                "(16, 'Honolulu', 'América', 'Hawái', 'url_foto_hawaii'), " +
                "(17, 'Aspen', 'América', 'EE.UU.', 'url_foto_usa'), " +
                "(18, 'Ciudad de México', 'América', 'México', 'url_foto_mexico'), " +
                "(19, 'Santorini', 'Europa', 'Grecia', 'url_foto_grecia'), " +
                "(20, 'Barcelona', 'Europa', 'España', 'url_foto_espania'), " +
                "(21, 'Lisboa', 'Europa', 'Portugal', 'url_foto_portugal'), " +
                "(22, 'Interlaken', 'Europa', 'Suiza', 'url_foto_suiza'), " +
                "(23, 'Granada', 'Europa', 'España', 'url_foto_espania'), " +
                "(24, 'Zermatt', 'Europa', 'Suiza', 'url_foto_suiza'), " +
                "(25, 'París', 'Europa', 'Francia', 'url_foto_francia'), " +
                "(26, 'Viena', 'Europa', 'Austria', 'url_foto_austria'), " +
                "(27, 'Berlín', 'Europa', 'Alemania', 'url_foto_alemania'), " +
                "(28, 'Ibiza', 'Europa', 'España', 'url_foto_espania'), " +
                "(29, 'Reykjavik', 'Europa', 'Islandia', 'url_foto_islandia'), " +
                "(30, 'Algarve', 'Europa', 'Portugal', 'url_foto_portugal'), " +
                "(31, 'Londres', 'Europa', 'Reino Unido', 'url_foto_reinounido'), " +
                "(32, 'Niza', 'Europa', 'Francia', 'url_foto_francia'), " +
                "(33, 'Chamonix', 'Europa', 'Francia', 'url_foto_francia'), " +
                "(34, 'Roma', 'Europa', 'Italia', 'url_foto_italia'), " +
                "(35, 'Malta', 'Europa', 'Malta', 'url_foto_malta');";

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
                "(19, 'Templado', 'Cultura y museos', 'Albergue', 'Una a dos semanas', '30-50 años', 18, 20);";

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
