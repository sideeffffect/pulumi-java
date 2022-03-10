// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The resource set description.
 * 
 */
public final class ResourceSetDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceSetDescriptionArgs Empty = new ResourceSetDescriptionArgs();

    /**
     * The elements included in the set.
     * 
     */
    @InputImport(name="elements")
      private final @Nullable Input<List<String>> elements;

    public Input<List<String>> getElements() {
        return this.elements == null ? Input.empty() : this.elements;
    }

    /**
     * The elements that are not included in the set, in case elements contains '*' indicating 'all'.
     * 
     */
    @InputImport(name="exceptions")
      private final @Nullable Input<List<String>> exceptions;

    public Input<List<String>> getExceptions() {
        return this.exceptions == null ? Input.empty() : this.exceptions;
    }

    public ResourceSetDescriptionArgs(
        @Nullable Input<List<String>> elements,
        @Nullable Input<List<String>> exceptions) {
        this.elements = elements;
        this.exceptions = exceptions;
    }

    private ResourceSetDescriptionArgs() {
        this.elements = Input.empty();
        this.exceptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> elements;
        private @Nullable Input<List<String>> exceptions;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elements = defaults.elements;
    	      this.exceptions = defaults.exceptions;
        }

        public Builder elements(@Nullable Input<List<String>> elements) {
            this.elements = elements;
            return this;
        }

        public Builder elements(@Nullable List<String> elements) {
            this.elements = Input.ofNullable(elements);
            return this;
        }

        public Builder exceptions(@Nullable Input<List<String>> exceptions) {
            this.exceptions = exceptions;
            return this;
        }

        public Builder exceptions(@Nullable List<String> exceptions) {
            this.exceptions = Input.ofNullable(exceptions);
            return this;
        }
        public ResourceSetDescriptionArgs build() {
            return new ResourceSetDescriptionArgs(elements, exceptions);
        }
    }
}
