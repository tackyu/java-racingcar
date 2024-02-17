package domain;

import domain.car.Car;
import domain.car.Cars;
import domain.name.Name;
import domain.name.Names;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CarsTest {
    @Test
    @DisplayName("자동차 이름 목록을 통해 자동차 목록을 포함한 일급 컬렉션을 만든다.")
    void createCars() {
        List<Name> names = List.of(new Name("pond"), new Name("poby"));
        Names nameCatalog = new Names(names);

        Cars cars = Cars.from(nameCatalog);

        assertInstanceOf(Cars.class, cars);
        cars.getValue().forEach(car -> assertInstanceOf(Car.class, car));

    }

}
