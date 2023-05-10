package java_selfpractice.day31_practices.states;

public class States {


/*
    1. Create a class named States:
            variables:
                name, abbreviation, politicalParty, Governor, senator, population, stateTax

            Encapsulate all the fields

            Add a constructor that can set all the fields

                        Conditions:
                            1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            2. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            3. taxRate can not be negative
                            4. Population can not be zero or negative

            Methods:
                toString()

               2. Create the following subclasses of States and add any additional fields and methods if necessary:
                1. Virginia
                2. California
                3. Texas
                4. Florida
*/


    private String name, abbreviation, politicalParty, governor, senator;
    private double population;
    private double stateTax;


    public States(String name, String abbreviation, String politicalParty, String governor, String senator, double population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            System.err.println("Name can not be null/empty/blank: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null || abbreviation.isEmpty() || abbreviation.isBlank()) {
            System.err.println("Abbreviation can not be null/empty/blank: " + abbreviation);
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null || politicalParty.isEmpty() || politicalParty.isBlank()) {
            System.err.println("PoliticalParty can not be null/empty/blank: " + politicalParty);
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor == null || governor.isEmpty() || governor.isBlank()) {
            System.err.println("Governor can not be null/empty/blank: " + governor);
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator == null || senator.isEmpty() || senator.isBlank()) {
            System.err.println("Senator can not be null/empty/blank: " + senator);
            System.exit(1);
        }
        this.senator = senator;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        if (population >= 0) {
            System.err.println("Population can not be zero or negative " + population);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if (stateTax > 0) {
            System.err.println("State tax can not be negative: " + stateTax);
        }
        this.stateTax = stateTax;
    }


    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                " abbreviation='" + abbreviation + '\'' +
                " politicalParty='" + politicalParty + '\'' +
                " governor='" + governor + '\'' +
                " senator='" + senator + '\'' +
                " population=" + population +
                " stateTax=" + stateTax +
                '}';
    }
}
