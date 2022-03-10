// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Data type for indicators connection.
 * 
 */
public final class TIDataConnectorDataTypesResponseIndicators extends io.pulumi.resources.InvokeArgs {

    public static final TIDataConnectorDataTypesResponseIndicators Empty = new TIDataConnectorDataTypesResponseIndicators();

    /**
     * Describe whether this data type connection is enabled or not.
     * 
     */
    @InputImport(name="state")
      private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    public TIDataConnectorDataTypesResponseIndicators(@Nullable String state) {
        this.state = state;
    }

    private TIDataConnectorDataTypesResponseIndicators() {
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TIDataConnectorDataTypesResponseIndicators defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(TIDataConnectorDataTypesResponseIndicators defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public TIDataConnectorDataTypesResponseIndicators build() {
            return new TIDataConnectorDataTypesResponseIndicators(state);
        }
    }
}
