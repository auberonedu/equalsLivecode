package io.github.auberonedu.equalsLivecode;

public class Centroid {
    private int r;
    private int c;
    private String name;
    
    public Centroid(int r, int c, String name) {
        this.r = r;
        this.c = c;
        this.name = name;
    }

    public int getR() {
        return r;
    }

    public int getC() {
        return c;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + r;
        result = prime * result + c;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Centroid other = (Centroid) obj;
        if (r != other.r)
            return false;
        if (c != other.c)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if(o == null) return false;
    //     if(getClass() != o.getClass()) return false;

    //     // If we've gotten to this point then we know that o is a Centroid so we can cast it to a Centroid
    //     // and start treating it as a Centroid
    //     Centroid other = (Centroid) o;

    //     // If we don't have the same row
    //     if (r != other.r) return false;
    //     // If we don't have the same col
    //     if(c != other.c) return false;

    //     if(name == null) {
    //         // We add this return true because by this point we have determined that everything matches so we can return
    //         if(other.name == null) return true;
    //         if(other.name != null) return false;
    //     }
    //     if(!name.equals(other.name)) return false;

    //     return true;
    // }
}
