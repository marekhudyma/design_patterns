package xxx;

public class Entity2 extends Entity1 {
    private int url;

    public static class Builder
            extends Entity1.Builder<Entity2, Entity2.Builder> {

        public Builder withUrl(int url) {
            obj.url = url;
            return thisObj;
        }

        protected Entity2 createObj() {
            return new Entity2();
        }

        protected Builder getThis() {
            return this;
        }
    }

    protected Entity2() {
    }

    public int getUrl() {
        return url;
    }
}
