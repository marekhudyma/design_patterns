package mh.creational.builder.classic;

public class Parent {

    private final int parentMandatory;
    private final String parentOptional;

    protected Parent(Parent.Builder builder) {
        this.parentMandatory = builder.parentMandatory;
        this.parentOptional = builder.parentOptional;
    }

    public static class Builder {

        private final int parentMandatory;
        private String parentOptional;

        public Builder(int parentMandatory) {
            this.parentMandatory = parentMandatory;
        }

        public Builder withParentOptional(String parentOptional) {
            this.parentOptional = parentOptional;
            return this;
        }

        public Parent build() {
            return new Parent(this);
        }
    }

    public int getParentMandatory() {
        return parentMandatory;
    }

    public String getParentOptional() {
        return parentOptional;
    }
}
