package com.kpz;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public final class Planet implements Cloneable, Serializable {

    private final double mass;
    private final String name;
    private final Date dateOfDiscovery;

    public Planet (String name, double mass, Date dateOfDiscovery) {
        this.mass = mass;
        this.name = name;
        this.dateOfDiscovery = new Date(dateOfDiscovery.getTime());
    }

    public double getMass() {
        return mass;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfDiscovery() {
        return new Date(dateOfDiscovery.getTime());
    }

    @Override
    public int hashCode() {
        return (int)mass * name.hashCode() * dateOfDiscovery.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;

        if (object == null)
            return false;

        if (getClass() != object.getClass())
            return false;

        Planet planet = (Planet) object;

        return Objects.equals(mass, planet.mass)
                && Objects.equals(name, planet.name)
                && planet.dateOfDiscovery.equals(dateOfDiscovery);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return String.format("Name: %s; Mass: %.2f; Date of discovery: %s",
                name, mass, dateFormat.format(dateOfDiscovery));
    }
}
