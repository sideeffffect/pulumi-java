// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.outputs;

import com.pulumi.awsnative.iotanalytics.outputs.DatasetDeltaTimeSessionWindowConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatasetLateDataRuleConfiguration {
    private final @Nullable DatasetDeltaTimeSessionWindowConfiguration deltaTimeSessionWindowConfiguration;

    @CustomType.Constructor
    private DatasetLateDataRuleConfiguration(@CustomType.Parameter("deltaTimeSessionWindowConfiguration") @Nullable DatasetDeltaTimeSessionWindowConfiguration deltaTimeSessionWindowConfiguration) {
        this.deltaTimeSessionWindowConfiguration = deltaTimeSessionWindowConfiguration;
    }

    public Optional<DatasetDeltaTimeSessionWindowConfiguration> deltaTimeSessionWindowConfiguration() {
        return Optional.ofNullable(this.deltaTimeSessionWindowConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetLateDataRuleConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetDeltaTimeSessionWindowConfiguration deltaTimeSessionWindowConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetLateDataRuleConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deltaTimeSessionWindowConfiguration = defaults.deltaTimeSessionWindowConfiguration;
        }

        public Builder deltaTimeSessionWindowConfiguration(@Nullable DatasetDeltaTimeSessionWindowConfiguration deltaTimeSessionWindowConfiguration) {
            this.deltaTimeSessionWindowConfiguration = deltaTimeSessionWindowConfiguration;
            return this;
        }        public DatasetLateDataRuleConfiguration build() {
            return new DatasetLateDataRuleConfiguration(deltaTimeSessionWindowConfiguration);
        }
    }
}
