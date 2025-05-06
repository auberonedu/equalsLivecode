package io.github.auberonedu.equalsLivecode;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Provides methods to locate specific symbols in 2D character arrays
 * using a legend that maps names to characters.
 */
public class Finder {
    private final Map<String, Character> legend;

    /**
     * Creates a Finder with a fixed legend mapping target names to characters.
     *
     * @param legend a map from target names to their representative characters
     */
    public Finder(Map<String, Character> legend) {
        this.legend = Collections.unmodifiableMap(legend);
    }

    /**
     * Searches for the first occurrence of the symbol associated with the given
     * target name in a single frame.
     *
     * @param frame a 2D character array representing the search area
     * @param target the name of the target to locate
     * @return a Centroid representing the position and name of the target,
     *         or null if the symbol is not found
     */
    public Centroid find(char[][] frame, String target) {
        char symbol = legend.get(target);
        for (int r = 0; r < frame.length; r++) {
            for (int c = 0; c < frame[r].length; c++) {
                if (frame[r][c] == symbol)
                    return new Centroid(r, c, target);
            }
        }
        return null;
    }

    /**
     * Collects the locations of a target symbol across multiple frames.
     *
     * @param video a list of frames, each a 2D character array
     * @param target the name of the target to locate
     * @return a set of Centroid objects representing where the target
     *         appears in the video; frames without the target are skipped
     */
    public Set<Centroid> allLocations(List<char[][]> video, String target) {
        Set<Centroid> locations = new HashSet<>();
        for (var frame : video) {
            Centroid location = find(frame, target);
            if (location != null) locations.add(location);
        }
        return locations;
    }
}
