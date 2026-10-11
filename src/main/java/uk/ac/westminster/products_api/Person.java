package uk.ac.westminster.products_api;

/**
 * TODO (Lab Activity 3):
 *   Add a new private String field called "email", following the
 *   JavaBean convention: provide a getter called getEmail().
 */
public class Person {

    private String name;
    private String email;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // TODO (Activity 3): add the "email" field and its getter here.

    public void getEmail(String email) { this.email = email; }

}
