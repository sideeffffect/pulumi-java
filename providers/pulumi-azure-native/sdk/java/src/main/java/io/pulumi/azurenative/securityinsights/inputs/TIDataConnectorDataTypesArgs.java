// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.TIDataConnectorDataTypesIndicatorsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The available data types for TI (Threat Intelligence) data connector.
 * 
 */
public final class TIDataConnectorDataTypesArgs extends io.pulumi.resources.ResourceArgs {

    public static final TIDataConnectorDataTypesArgs Empty = new TIDataConnectorDataTypesArgs();

    /**
     * Data type for indicators connection.
     * 
     */
    @InputImport(name="indicators")
      private final @Nullable Input<TIDataConnectorDataTypesIndicatorsArgs> indicators;

    public Input<TIDataConnectorDataTypesIndicatorsArgs> getIndicators() {
        return this.indicators == null ? Input.empty() : this.indicators;
    }

    public TIDataConnectorDataTypesArgs(@Nullable Input<TIDataConnectorDataTypesIndicatorsArgs> indicators) {
        this.indicators = indicators;
    }

    private TIDataConnectorDataTypesArgs() {
        this.indicators = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TIDataConnectorDataTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TIDataConnectorDataTypesIndicatorsArgs> indicators;

        public Builder() {
    	      // Empty
        }

        public Builder(TIDataConnectorDataTypesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.indicators = defaults.indicators;
        }

        public Builder indicators(@Nullable Input<TIDataConnectorDataTypesIndicatorsArgs> indicators) {
            this.indicators = indicators;
            return this;
        }

        public Builder indicators(@Nullable TIDataConnectorDataTypesIndicatorsArgs indicators) {
            this.indicators = Input.ofNullable(indicators);
            return this;
        }
        public TIDataConnectorDataTypesArgs build() {
            return new TIDataConnectorDataTypesArgs(indicators);
        }
    }
}
