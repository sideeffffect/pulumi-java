// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExtendedLocationResponse {
    /**
     * Name of extended location.
     * 
     */
    private final @Nullable String name;
    /**
     * Type of extended location.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ExtendedLocationResponse(
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("type") String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Name of extended location.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Type of extended location.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtendedLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtendedLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ExtendedLocationResponse build() {
            return new ExtendedLocationResponse(name, type);
        }
    }
}
