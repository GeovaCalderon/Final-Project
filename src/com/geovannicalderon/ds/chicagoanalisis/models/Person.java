package com.geovannicalderon.ds.chicagoanalisis.models;

public class Person {

    protected String name;
    protected String lastname;

    /**
     *
     * @param name
     * @param lastname
     */
    public Person(final String name, final String lastname) {
        this.name = name.replace("\"", "").replace(" ", "");
        this.lastname = lastname.replace("\"", "");
    } // CONSTRUCTOR PERSON ENDS ----------------------------------------------

    /**
     *
     * @return
     */
    public String toString(){

        return "{ \"name\":\""+ this.name + "\", \"lastname\":\""+this.lastname+"\"}";
    } //METHOD STRING ENDS ----------------------------------------------------

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    } // METHOD GET NAME ENDS -------------------------------------------------

    /**
     *
     * @return
     */
    public String getLastname() {
        return lastname;
    } // METHOD GET LASTNAME ENDS ---------------------------------------------

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }// METHOD SET NAME ENDS --------------------------------------------------

    /**
     *
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }// METHOD SET LASTNAME ENDS ----------------------------------------------
} // CLASS PERSON ENDS --------------------------------------------------------
