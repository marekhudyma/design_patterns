package mh.creational.builder.classic;

import mh.creational.builder.fluent.Parent;

public class Child extends Parent {

    private final int childMandatory;
    private final String childOptional;

    protected Child(Child.Builder builder) {
        super(builder);
        this.childMandatory = builder.childMandatory;
        this.childOptional = builder.childOptional;
    }

    public static class Builder extends Parent.Builder {

        private final int childMandatory;
        private String childOptional;

        public Builder(int parentMandatory, int childMandatory) {
            super(parentMandatory);
            this.childMandatory = childMandatory;
        }

        public Child.Builder withChildOptional(String childOptional) {
            this.childOptional = childOptional;
            return this;
        }

        public Child build() {
            return new Child(this);
        }
    }
}

