package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {

    private final List<Car> carList;


     {
         carList = new ArrayList<>();
         carList.add(new Car("BMW", "Germany", 1932));
         carList.add(new Car("Cadillac", "USA", 1902));
         carList.add(new Car("Fiat", "Italy", 1907));
         carList.add(new Car("Volga", "USSR", 1956));
         carList.add(new Car("Peugeot", "France", 1890));

     }

    @Override
    public List<Car> getCarList(Integer count) {
         if (count == null || count < 0 || count > 5) {
             return carList;
         } else {
             return carList.stream().limit(count).collect(Collectors.toList());
         }

    }
}
