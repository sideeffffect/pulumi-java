// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HTTP headers used in UrlMapTests.
 * 
 */
public final class UrlMapTestHeaderArgs extends io.pulumi.resources.ResourceArgs {

    public static final UrlMapTestHeaderArgs Empty = new UrlMapTestHeaderArgs();

    /**
     * Header name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Header value.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public UrlMapTestHeaderArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> value) {
        this.name = name;
        this.value = value;
    }

    private UrlMapTestHeaderArgs() {
        this.name = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlMapTestHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlMapTestHeaderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder value(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public UrlMapTestHeaderArgs build() {
            return new UrlMapTestHeaderArgs(name, value);
        }
    }
}
