package mh.creational.builder.classic;

public class Entity1 <CHILD extends Entity1<CHILD>> {

    private final String optional1;
    private final String optional2;

    protected Entity1(String optional1, String optional2) {
        this.optional1 = optional1;
        this.optional2 = optional2;
    }
    public String getOptional1() {
        return optional1;
    }

    public String getOptional2() {
        return optional2;
    }

    public static class Builder<SELF extends EntityBuilder<Entity1, SELF>> extends EntityBuilder<Entity1, SELF>  {
        protected String optional1;
        protected String optional2;


        public SELF withOptional1(String optional1) {
            this.optional1 = optional1;
            return self();
        }

        public SELF withOptional2(String optional2) {
            this.optional2 = optional2;
            return self();
        }

        @Override
        public SELF and() {
            return self();
        }

        @Override
        public Entity1 build() {
            return new Entity1( optional1, optional2);
        }

    }
}
