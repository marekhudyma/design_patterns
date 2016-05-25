package mh.creational.classicBuilder;

public class Entity2 extends Entity1 {

    protected String imageUrl;

    protected Entity2(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
    }

    protected static class Builder extends Entity1.Builder {
        protected String imageUrl;

        public Builder(int id) {
            super(id);
        }

        public Builder withImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Entity2 build() {
            return new Entity2(this);
        }

    }


}
