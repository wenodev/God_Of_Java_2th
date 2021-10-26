package godOfJava2th.practice.person;

import org.mockito.cglib.core.Local;

import java.time.LocalDateTime;

public class Person {
    private LocalDateTime time;
    private String name;
    private Boolean isBooked;

    public Person(LocalDateTime time, String name, Boolean isBooked) {
        this.time = time;
        this.name = name;
        this.isBooked = isBooked;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public Boolean getBooked() {
        return isBooked;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooked(Boolean booked) {
        isBooked = booked;
    }

    @Override
    public String toString() {
        return "Person{" +
                "time=" + time +
                ", name='" + name + '\'' +
                ", isBooked=" + isBooked +
                '}';
    }
}
