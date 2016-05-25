package mh.creational.builder.classic;

public class EntityBuilder<T, SELF extends EntityBuilder<T, ?>> {

    public EntityBuilder() {
    }

    @SuppressWarnings("unchecked")
    public SELF self() {
        return (SELF)this;
    }

    public SELF and() {
        return self();
    }

    public T build() {
        throw new UnsupportedOperationException("Override me");
    }

}
