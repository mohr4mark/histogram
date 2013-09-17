/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.histogramprototype;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author mdmohrfeld_it
 */
public class HistogramPrototypeDataStorage {
    private ArrayList<Double> dataArrayList;
    private String data;
    
    public HistogramPrototypeDataStorage(String d){
        data = d;
        dataArrayList = new ArrayList<>();
        processData();      
    }

    private void processData() {
        String delims = "[ ]+";
        String[] tokens = data.split(delims);
        for(int i = 0; i<tokens.length; i++){
            int skip = 0;
            double savedDouble = Double.parseDouble(tokens[i]);
            if(savedDouble>100 || savedDouble<1){
                dataArrayList.add(i - skip, savedDouble);
            }
            else{
                skip++;
            }
        }
        Collections.sort(dataArrayList);
    }

    public ArrayList<Double> getDataArrayList() {
        return dataArrayList;
    }
}
