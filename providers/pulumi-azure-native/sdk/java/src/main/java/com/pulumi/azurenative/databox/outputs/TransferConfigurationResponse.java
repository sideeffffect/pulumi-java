// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.outputs;

import com.pulumi.azurenative.databox.outputs.TransferConfigurationResponseTransferAllDetails;
import com.pulumi.azurenative.databox.outputs.TransferConfigurationResponseTransferFilterDetails;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransferConfigurationResponse {
    /**
     * @return Map of filter type and the details to transfer all data. This field is required only if the TransferConfigurationType is given as TransferAll
     * 
     */
    private final @Nullable TransferConfigurationResponseTransferAllDetails transferAllDetails;
    /**
     * @return Type of the configuration for transfer.
     * 
     */
    private final String transferConfigurationType;
    /**
     * @return Map of filter type and the details to filter. This field is required only if the TransferConfigurationType is given as TransferUsingFilter.
     * 
     */
    private final @Nullable TransferConfigurationResponseTransferFilterDetails transferFilterDetails;

    @CustomType.Constructor
    private TransferConfigurationResponse(
        @CustomType.Parameter("transferAllDetails") @Nullable TransferConfigurationResponseTransferAllDetails transferAllDetails,
        @CustomType.Parameter("transferConfigurationType") String transferConfigurationType,
        @CustomType.Parameter("transferFilterDetails") @Nullable TransferConfigurationResponseTransferFilterDetails transferFilterDetails) {
        this.transferAllDetails = transferAllDetails;
        this.transferConfigurationType = transferConfigurationType;
        this.transferFilterDetails = transferFilterDetails;
    }

    /**
     * @return Map of filter type and the details to transfer all data. This field is required only if the TransferConfigurationType is given as TransferAll
     * 
     */
    public Optional<TransferConfigurationResponseTransferAllDetails> transferAllDetails() {
        return Optional.ofNullable(this.transferAllDetails);
    }
    /**
     * @return Type of the configuration for transfer.
     * 
     */
    public String transferConfigurationType() {
        return this.transferConfigurationType;
    }
    /**
     * @return Map of filter type and the details to filter. This field is required only if the TransferConfigurationType is given as TransferUsingFilter.
     * 
     */
    public Optional<TransferConfigurationResponseTransferFilterDetails> transferFilterDetails() {
        return Optional.ofNullable(this.transferFilterDetails);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TransferConfigurationResponseTransferAllDetails transferAllDetails;
        private String transferConfigurationType;
        private @Nullable TransferConfigurationResponseTransferFilterDetails transferFilterDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transferAllDetails = defaults.transferAllDetails;
    	      this.transferConfigurationType = defaults.transferConfigurationType;
    	      this.transferFilterDetails = defaults.transferFilterDetails;
        }

        public Builder transferAllDetails(@Nullable TransferConfigurationResponseTransferAllDetails transferAllDetails) {
            this.transferAllDetails = transferAllDetails;
            return this;
        }
        public Builder transferConfigurationType(String transferConfigurationType) {
            this.transferConfigurationType = Objects.requireNonNull(transferConfigurationType);
            return this;
        }
        public Builder transferFilterDetails(@Nullable TransferConfigurationResponseTransferFilterDetails transferFilterDetails) {
            this.transferFilterDetails = transferFilterDetails;
            return this;
        }        public TransferConfigurationResponse build() {
            return new TransferConfigurationResponse(transferAllDetails, transferConfigurationType, transferFilterDetails);
        }
    }
}
