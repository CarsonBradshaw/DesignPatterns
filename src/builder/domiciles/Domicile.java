package builder.domiciles;

import builder.doors.Door;
import builder.foundations.Foundation;
import builder.roofs.Roof;

public abstract class Domicile {
    private Roof roof;
    private Foundation foundation;
    private Door door;

    protected Domicile(Builder builder){
        this.roof = builder.roof;
        this.foundation = builder.foundation;
        this.door = builder.door;
    }

    public static abstract class Builder<T extends Builder<T>>{
        private Roof roof;
        private Foundation foundation;
        private Door door;

        public T roof(Roof roof){
            this.roof = roof;
            return self();
        }

        public T foundation(Foundation foundation){
            this.foundation = foundation;
            return self();
        }

        public T door(Door door){
            this.door = door;
            return self();
        }

        public abstract Domicile build();

        public abstract T self();
    }

    @Override
    public String toString() {
        return "Domicile{" +
                "roof=" + roof +
                ", foundation=" + foundation +
                ", door=" + door +
                '}';
    }
}
