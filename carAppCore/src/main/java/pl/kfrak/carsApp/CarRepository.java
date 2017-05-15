package pl.kfrak.carsApp;

import com.google.common.base.Charsets;
import com.google.common.io.CharSink;
import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;
import pl.kfrak.carsApp.Car;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-04-28.
 */

////    car repository - to jego odpowiedzialnosc
////    zeby zapisac wprowadzone auto do pliku
////- nowa metpda "saveToFile"
////            - kod ktora liste samochodwo (jest w car repository) zapisze do pliku


public class CarRepository {
    private List<Car> cars;

    public CarRepository() {
        cars = new ArrayList<>();

        cars.add(new Car("Opel", "Vectra", "2003", 100));
        cars.add(new Car("Ford", "Mondeo", "2010", 180));
        cars.add(new Car("Ford", "Mustang", "2015", 280));
        cars.add(new Car("Nissan", "Micra", "1995", 70));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void saveToFile() throws IOException {
        // Wyczyszczenie pliku
        FileOutputStream fileOutputStream = new FileOutputStream("cars.csv");
        fileOutputStream.close();

        // Zapisanie danych do pliku
        CharSink carsCharSink = Files.asCharSink(new File("cars.csv"), Charsets.UTF_8, FileWriteMode.APPEND);

        for (Car car : cars) {
            carsCharSink.write(car.toString() + "\n");
        }

    }

    public void readFromFile() throws IOException {
        List<String> fileLines = Files.readLines(new File("cars.csv"), Charsets.UTF_8);

//		this.cars.clear();
//		for (String fileLine : fileLines) {
//			Car car = new Car(fileLine);
//			this.cars.add(car);
//		}

        // LUB


        List<Car> carsList = new ArrayList<>();

        for (String fileLine : fileLines) {
            Car car = new Car(fileLine);
            carsList.add(car);
        }

        this.cars = carsList;
    }
}