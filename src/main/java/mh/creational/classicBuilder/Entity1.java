package mh.creational.classicBuilder;

public class Entity1 {

    protected final int id; //obligatory
    protected final String description;
    protected final String url;

    protected Entity1(Builder builder) {
        this.id = builder.id;
        this.description = builder.description;
        this.url = builder.url;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    protected static class Builder {

        protected final int id;
        protected String description;
        protected String url;

        public Builder(int id) {
            this.id = id;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }

        public Entity1 build() {
            return new Entity1(this);
        }

    }
}
