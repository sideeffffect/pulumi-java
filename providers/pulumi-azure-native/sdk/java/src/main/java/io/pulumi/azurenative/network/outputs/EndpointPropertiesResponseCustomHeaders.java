// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointPropertiesResponseCustomHeaders {
    /**
     * Header name.
     * 
     */
    private final @Nullable String name;
    /**
     * Header value.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor
    private EndpointPropertiesResponseCustomHeaders(
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("value") @Nullable String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Header name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Header value.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPropertiesResponseCustomHeaders defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointPropertiesResponseCustomHeaders defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public EndpointPropertiesResponseCustomHeaders build() {
            return new EndpointPropertiesResponseCustomHeaders(name, value);
        }
    }
}
