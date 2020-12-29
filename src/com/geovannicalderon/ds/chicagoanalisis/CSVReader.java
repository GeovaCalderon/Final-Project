package com.geovannicalderon.ds.chicagoanalisis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.geovannicalderon.ds.chicagoanalisis.models.ElasticWorkerArray;
import com.geovannicalderon.ds.chicagoanalisis.models.Worker;

public class CSVReader {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        String dataCsvFileLocation = "C:\\Users\\Geova\\Documents\\data2.csv";
        String csvSeparator = ",";
        String line = "";

        ElasticWorkerArray workers = new ElasticWorkerArray();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(dataCsvFileLocation))) {

            while ((line = bufferedReader.readLine()) != null){

                line += " ";
                String[] person = line.split(csvSeparator);
                Worker personObj = new Worker(
                        person[1],
                        person[0],
                        person[2],
                        person[3],
                        person[4],
                        person[5],
                        person[6],
                        person[7],
                        person[8]);
                workers.addWorker(personObj);

            } // WHILE ENDS ---------------------------------------------------

            Facts fact = new Facts(workers.getWorkerArray());


        } catch (FileNotFoundException fileNotFoundException){

            System.out.println("This file provided is not valid");

        } catch (IOException ioException){

            ioException.printStackTrace();

        }



    } // MAIN METHOD ENDS -----------------------------------------------------

} // CLASS CSV READER ENDS ----------------------------------------------------
