package jeu;

class Personnage {

    public enum Orientation {
        NORD, EST, SUD, OUEST
    }

    private Orientation orientation;

    // Constructeur : le personnage commence toujours NORD
    public Personnage() {
        this.orientation = Orientation.NORD;
    }

    // Méthode tourner
    public Orientation tourner(int fois) {
        Orientation[] directions = Orientation.values();
        int indexActuel = orientation.ordinal();
        int nouvelIndex = (indexActuel + fois) % directions.length;
        orientation = directions[nouvelIndex];
        return orientation;
    }

    // Getter pour l'orientation (optionnel)
    public Orientation getOrientation() {
        return orientation;
    }
}
