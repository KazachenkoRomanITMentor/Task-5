package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "series")
    private int series;

    @Column(name = "model")
    private String model;

    @OneToOne
    private User owner;

    public Car(){}

    public int getSeries() {
        return series;
    }

    public Car(int series, String model, User owner) {
        this.series = series;
        this.model = model;
        this.owner = owner;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }


    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", model='" + model + '\'' +
                '}';
    }
}
