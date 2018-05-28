package builder.domiciles;

public class DogHouse extends Domicile {

    private DogHouse(Builder builder){
        super(builder);
    }

    public static class Builder extends Domicile.Builder<Builder>{
        @Override
        public DogHouse build() {
            return new DogHouse(this);
        }

        @Override
        public Builder self() {
            return this;
        }
    }
}
