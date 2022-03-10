// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CommitmentQuotaResponse {
    /**
     * Commitment quota quantity.
     * 
     */
    private final @Nullable Double quantity;
    /**
     * Commitment quota unit.
     * 
     */
    private final @Nullable String unit;

    @OutputCustomType.Constructor
    private CommitmentQuotaResponse(
        @OutputCustomType.Parameter("quantity") @Nullable Double quantity,
        @OutputCustomType.Parameter("unit") @Nullable String unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    /**
     * Commitment quota quantity.
     * 
    */
    public Optional<Double> getQuantity() {
        return Optional.ofNullable(this.quantity);
    }
    /**
     * Commitment quota unit.
     * 
    */
    public Optional<String> getUnit() {
        return Optional.ofNullable(this.unit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommitmentQuotaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double quantity;
        private @Nullable String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(CommitmentQuotaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quantity = defaults.quantity;
    	      this.unit = defaults.unit;
        }

        public Builder quantity(@Nullable Double quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder unit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }
        public CommitmentQuotaResponse build() {
            return new CommitmentQuotaResponse(quantity, unit);
        }
    }
}
