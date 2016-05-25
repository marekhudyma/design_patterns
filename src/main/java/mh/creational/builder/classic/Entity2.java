package mh.creational.builder.classic;

public class Entity2 extends Entity1<Entity2> {

    private String optional3;

    private Entity2(String optional1,
                    String optional2,
                    String optional3) {
        super(optional1, optional2);
        this.optional3 = optional3;
    }

    public String getOptional3() {
        return optional3;
    }

    public static class Builder<SELF extends Entity1.Builder<SELF>> extends Entity1.Builder<SELF> {

        protected String optional3;

        public SELF withOptional3(String optional3) {
            this.optional3 = optional3;
            return self();
        }

        @Override
        public SELF and() {
            return self();
        }

        @Override
        public Entity2 build() {
            return new Entity2(optional1, optional2, optional3);
        }
    }

}
