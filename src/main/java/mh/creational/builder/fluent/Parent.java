package mh.creational.builder.fluent;

public class Parent {

    private final int parentMandatory;
    private final String parentOptional;

    protected Parent(final AbstractParentBuilder builder) {
        this.parentMandatory = builder.parentMandatory;
        this.parentOptional = builder.parentOptional;
    }

    public static class Builder extends AbstractParentBuilder<Parent, Builder> {

        public Builder(int parentMandatory) {
            this.parentMandatory = parentMandatory;
        }

        public Parent build() {
            return new Parent(this);
        }

    }

    protected static abstract class AbstractParentBuilder<T extends Parent, B extends AbstractParentBuilder<T, ?>> {

        protected int parentMandatory;
        protected String parentOptional;

        public B withParentOptional(String parentOptional) {
            this.parentOptional = parentOptional;
            return (B) this;
        }
    }

    public int getParentMandatory() {
        return parentMandatory;
    }

    public String getParentOptional() {
        return parentOptional;
    }

}
