package godOfJava2th.practice.person;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class PersonTest {

    @Test
    void test(){
        String[][] booked =  {{"09:55", "hae"}, {"10:05", "jee"}};
        String[][] unbooked = {{"10:04", "hee"}, {"14:07", "eom"}};
        solution(booked, unbooked);
    }

    private void solution(String[][] booked, String[][] unbooked) {
        List<Person> people = Arrays.stream(booked)
                .map(book -> new Person(makeTime(book[0]), book[1], true))
                .collect(Collectors.toList());
        people.addAll(
                Arrays.stream(unbooked)
                        .map(book -> new Person(makeTime(book[0]), book[1], false))
                        .collect(Collectors.toList()));

        List<Person> result = people.stream().sorted(Comparator.comparing(Person::getTime)).collect(Collectors.toList());


        }

    LocalDateTime makeTime(String time){
        return LocalDateTime.parse("2021-10-27 " + time + ":00",
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

}