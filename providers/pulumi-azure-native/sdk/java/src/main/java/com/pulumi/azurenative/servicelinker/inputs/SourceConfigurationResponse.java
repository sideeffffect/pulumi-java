// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicelinker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A configuration item for source resource
 * 
 */
public final class SourceConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final SourceConfigurationResponse Empty = new SourceConfigurationResponse();

    /**
     * The name of setting.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The value of setting
     * 
     */
    @Import(name="value")
      private final @Nullable String value;

    public Optional<String> value() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public SourceConfigurationResponse(
        @Nullable String name,
        @Nullable String value) {
        this.name = name;
        this.value = value;
    }

    private SourceConfigurationResponse() {
        this.name = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceConfigurationResponse defaults) {
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
        }        public SourceConfigurationResponse build() {
            return new SourceConfigurationResponse(name, value);
        }
    }
}
