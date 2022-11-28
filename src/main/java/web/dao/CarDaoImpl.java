package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{

    static List<Car> carList;
    static {
        carList = new ArrayList<>();
        carList.add(new Car("model1", "color1", 101));
        carList.add(new Car("model2", "color2", 102));
        carList.add(new Car("model3", "color3", 103));
        carList.add(new Car("model4", "color4", 104));
        carList.add(new Car("model5", "color5", 105));
    }

    @Override
    public List<Car> getCars() {
        return carList;
    }
}
