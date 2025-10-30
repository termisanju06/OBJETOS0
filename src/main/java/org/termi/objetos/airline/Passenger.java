package org.termi.objetos.airline;

import java.util.Objects;

public class Passenger {
    private String nif;
    private String name;
    private String surname;
    private int seat;

    public Passenger(String nif, String name, String surname, int seat) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.seat = seat;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return seat == passenger.seat && Objects.equals(nif, passenger.nif) && Objects.equals(name, passenger.name) && Objects.equals(surname, passenger.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, seat);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", seat=" + seat +
                '}';
    }
}