/*
 * We will look at this class in a later part of the livecode, you can ignore for now
 */
package io.github.auberonedu.equalsLivecode;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Finder {
    private final Map<String, Character> legend;
    
    public Finder(Map<String, Character> legend) {
        this.legend = Collections.unmodifiableMap(legend);
    }


    public Centroid find(char[][] frame, String target) {
        char symbol = legend.get(target);
        for(int r = 0; r < frame.length; r++) {
            for(int c = 0; c < frame[r].length; c++) {
                if(frame[r][c] == symbol)
                    return new Centroid(r, c, target);
            }
        }
        return null;
    }

    public Set<Centroid> allLocations(List<char[][]> video, String target) {
        Set<Centroid> locations = new HashSet<>();
        for(var frame : video) {
            Centroid location = find(frame, target);
            locations.add(location);
        }
        return locations;
    }
}
