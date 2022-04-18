// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of the configuration parameter type.
 * 
 */
public final class DscConfigurationParameterResponse extends com.pulumi.resources.InvokeArgs {

    public static final DscConfigurationParameterResponse Empty = new DscConfigurationParameterResponse();

    /**
     * Gets or sets the default value of parameter.
     * 
     */
    @Import(name="defaultValue")
      private final @Nullable String defaultValue;

    public Optional<String> defaultValue() {
        return this.defaultValue == null ? Optional.empty() : Optional.ofNullable(this.defaultValue);
    }

    /**
     * Gets or sets a Boolean value to indicate whether the parameter is mandatory or not.
     * 
     */
    @Import(name="isMandatory")
      private final @Nullable Boolean isMandatory;

    public Optional<Boolean> isMandatory() {
        return this.isMandatory == null ? Optional.empty() : Optional.ofNullable(this.isMandatory);
    }

    /**
     * Get or sets the position of the parameter.
     * 
     */
    @Import(name="position")
      private final @Nullable Integer position;

    public Optional<Integer> position() {
        return this.position == null ? Optional.empty() : Optional.ofNullable(this.position);
    }

    /**
     * Gets or sets the type of the parameter.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public DscConfigurationParameterResponse(
        @Nullable String defaultValue,
        @Nullable Boolean isMandatory,
        @Nullable Integer position,
        @Nullable String type) {
        this.defaultValue = defaultValue;
        this.isMandatory = isMandatory;
        this.position = position;
        this.type = type;
    }

    private DscConfigurationParameterResponse() {
        this.defaultValue = null;
        this.isMandatory = null;
        this.position = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DscConfigurationParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultValue;
        private @Nullable Boolean isMandatory;
        private @Nullable Integer position;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DscConfigurationParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.isMandatory = defaults.isMandatory;
    	      this.position = defaults.position;
    	      this.type = defaults.type;
        }

        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Builder isMandatory(@Nullable Boolean isMandatory) {
            this.isMandatory = isMandatory;
            return this;
        }
        public Builder position(@Nullable Integer position) {
            this.position = position;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public DscConfigurationParameterResponse build() {
            return new DscConfigurationParameterResponse(defaultValue, isMandatory, position, type);
        }
    }
}
