package mh.creational.builder.fluent;

public class Child extends Parent {

    private final int childMandatory;
    private final String childOptional;

    protected Child(final AbstractChildBuilder builder) {
        super(builder);
        this.childMandatory = builder.childMandatory;
        this.childOptional = builder.childOptional;
    }

    public static final class Builder extends AbstractChildBuilder<Child, Builder> {

        public Builder(int parentMandatory, int childMandatory) {
            this.parentMandatory = parentMandatory;
            this.childMandatory = childMandatory;
        }

        public Child build() {
            return new Child(this);
        }
    }

    protected static abstract class AbstractChildBuilder<T extends Child, B extends AbstractChildBuilder<T, ?>> extends Parent.AbstractParentBuilder<T, B> {

        protected int childMandatory;
        protected String childOptional;

        public B withChildOptional(String childOptional) {
            this.childOptional = childOptional;
            return (B) this;
        }
    }

    public int getChildMandatory() {
        return childMandatory;
    }

    public String getChildOptional() {
        return childOptional;
    }
}

