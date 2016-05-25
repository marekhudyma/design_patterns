package mh.creational.builder.fluent.tmp1;

public abstract class Entity1 {
    protected int id;
    protected int description;

    protected Entity1() {
    }

    public int getId() {
        return id;
    }

    public int getDescription() {
        return description;
    }

    protected abstract static class Builder<T extends Entity1, SELF extends Builder<T, SELF>> {

        protected T obj;
        protected SELF thisObj;

        public Builder() {
            obj = createObj();
            thisObj = getThis();
        }

        public SELF withId(int id) {
            obj.id = id;
            return thisObj;
        }

        public SELF withDescription(int description) {
            obj.description = description;
            return thisObj;
        }

        public T build() {
            return build();
        }

        protected abstract T createObj();

        protected abstract SELF getThis();
    }


}
