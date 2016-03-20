package dto.opennotify;

import java.util.List;

/**
 * DTO for the query result.
 * Created by ton on 20/03/16.
 */
public class Result {

    private String message;

    private Integer number;

    private List<Astronaut> people;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<Astronaut> getPeople() {
        return people;
    }

    public void setPeople(List<Astronaut> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Result{" +
                "message='" + message + '\'' +
                ", number=" + number +
                ", people=" + people +
                '}';
    }
}
