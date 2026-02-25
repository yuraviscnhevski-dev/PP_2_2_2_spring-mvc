package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;  // сделал final

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 250));
        cars.add(new Car("Honda", "Accord", 200));
        cars.add(new Car("BMW", "X5", 350));
        cars.add(new Car("Mercedes", "E200", 220));
        cars.add(new Car("Audi", "A6", 280));
    }

    @Override
    public List<Car> outWithParam(Integer count) {


        if (count == null || count >= cars.size()) {
            return new ArrayList<>(cars);
        }

        if (count < 0) {
            throw new IllegalArgumentException("Count cannot be negative. Got: " + count);
        }

        if (count == 0) {
            return new ArrayList<>();
        }

        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}