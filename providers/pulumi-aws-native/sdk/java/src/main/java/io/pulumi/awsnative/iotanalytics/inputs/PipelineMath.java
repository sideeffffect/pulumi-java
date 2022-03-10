// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineMath extends io.pulumi.resources.InvokeArgs {

    public static final PipelineMath Empty = new PipelineMath();

    @InputImport(name="attribute", required=true)
      private final String attribute;

    public String getAttribute() {
        return this.attribute;
    }

    @InputImport(name="math", required=true)
      private final String math;

    public String getMath() {
        return this.math;
    }

    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="next")
      private final @Nullable String next;

    public Optional<String> getNext() {
        return this.next == null ? Optional.empty() : Optional.ofNullable(this.next);
    }

    public PipelineMath(
        String attribute,
        String math,
        String name,
        @Nullable String next) {
        this.attribute = Objects.requireNonNull(attribute, "expected parameter 'attribute' to be non-null");
        this.math = Objects.requireNonNull(math, "expected parameter 'math' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.next = next;
    }

    private PipelineMath() {
        this.attribute = null;
        this.math = null;
        this.name = null;
        this.next = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineMath defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attribute;
        private String math;
        private String name;
        private @Nullable String next;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineMath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.math = defaults.math;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
        }

        public Builder attribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }

        public Builder math(String math) {
            this.math = Objects.requireNonNull(math);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder next(@Nullable String next) {
            this.next = next;
            return this;
        }
        public PipelineMath build() {
            return new PipelineMath(attribute, math, name, next);
        }
    }
}
