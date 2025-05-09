package io.github.auberonedu.equalsLivecode;

import java.util.Objects;

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
        int hash = 5;
        hash = 73 * hash + this.r;
        hash = 73 * hash + this.c;
        hash = 73 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Centroid other = (Centroid) obj;
        if (this.r != other.r) {
            return false;
        }
        if (this.c != other.c) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

        // @Override
    // public boolean equals(Object o){
    //     if(o == null) return false;

    //     if(getClass() != o.getClass()) return false;
    //     Centroid other = (Centroid) o;
    //     if(r!= other.r) return false;
    //     if(c != other.c) return false;
    //     if(name == null){
    //         if(other.name == null) return true;
    //         if(other.name != null) return false;
    //     }
    //     if(!name.equals(other.name)) return false;
    //     return true;
    // }
}
