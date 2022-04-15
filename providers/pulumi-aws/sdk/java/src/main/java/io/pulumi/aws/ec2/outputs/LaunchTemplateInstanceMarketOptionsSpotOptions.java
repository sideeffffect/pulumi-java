// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LaunchTemplateInstanceMarketOptionsSpotOptions {
    /**
     * The required duration in minutes. This value must be a multiple of 60.
     * 
     */
    private final @Nullable Integer blockDurationMinutes;
    /**
     * The behavior when a Spot Instance is interrupted. Can be `hibernate`,
     * `stop`, or `terminate`. (Default: `terminate`).
     * 
     */
    private final @Nullable String instanceInterruptionBehavior;
    /**
     * The maximum hourly price you're willing to pay for the Spot Instances.
     * 
     */
    private final @Nullable String maxPrice;
    /**
     * The Spot Instance request type. Can be `one-time`, or `persistent`.
     * 
     */
    private final @Nullable String spotInstanceType;
    /**
     * The end date of the request.
     * 
     */
    private final @Nullable String validUntil;

    @CustomType.Constructor
    private LaunchTemplateInstanceMarketOptionsSpotOptions(
        @CustomType.Parameter("blockDurationMinutes") @Nullable Integer blockDurationMinutes,
        @CustomType.Parameter("instanceInterruptionBehavior") @Nullable String instanceInterruptionBehavior,
        @CustomType.Parameter("maxPrice") @Nullable String maxPrice,
        @CustomType.Parameter("spotInstanceType") @Nullable String spotInstanceType,
        @CustomType.Parameter("validUntil") @Nullable String validUntil) {
        this.blockDurationMinutes = blockDurationMinutes;
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        this.maxPrice = maxPrice;
        this.spotInstanceType = spotInstanceType;
        this.validUntil = validUntil;
    }

    /**
     * The required duration in minutes. This value must be a multiple of 60.
     * 
    */
    public Optional<Integer> blockDurationMinutes() {
        return Optional.ofNullable(this.blockDurationMinutes);
    }
    /**
     * The behavior when a Spot Instance is interrupted. Can be `hibernate`,
     * `stop`, or `terminate`. (Default: `terminate`).
     * 
    */
    public Optional<String> instanceInterruptionBehavior() {
        return Optional.ofNullable(this.instanceInterruptionBehavior);
    }
    /**
     * The maximum hourly price you're willing to pay for the Spot Instances.
     * 
    */
    public Optional<String> maxPrice() {
        return Optional.ofNullable(this.maxPrice);
    }
    /**
     * The Spot Instance request type. Can be `one-time`, or `persistent`.
     * 
    */
    public Optional<String> spotInstanceType() {
        return Optional.ofNullable(this.spotInstanceType);
    }
    /**
     * The end date of the request.
     * 
    */
    public Optional<String> validUntil() {
        return Optional.ofNullable(this.validUntil);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateInstanceMarketOptionsSpotOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer blockDurationMinutes;
        private @Nullable String instanceInterruptionBehavior;
        private @Nullable String maxPrice;
        private @Nullable String spotInstanceType;
        private @Nullable String validUntil;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateInstanceMarketOptionsSpotOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockDurationMinutes = defaults.blockDurationMinutes;
    	      this.instanceInterruptionBehavior = defaults.instanceInterruptionBehavior;
    	      this.maxPrice = defaults.maxPrice;
    	      this.spotInstanceType = defaults.spotInstanceType;
    	      this.validUntil = defaults.validUntil;
        }

        public Builder blockDurationMinutes(@Nullable Integer blockDurationMinutes) {
            this.blockDurationMinutes = blockDurationMinutes;
            return this;
        }
        public Builder instanceInterruptionBehavior(@Nullable String instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = instanceInterruptionBehavior;
            return this;
        }
        public Builder maxPrice(@Nullable String maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Builder spotInstanceType(@Nullable String spotInstanceType) {
            this.spotInstanceType = spotInstanceType;
            return this;
        }
        public Builder validUntil(@Nullable String validUntil) {
            this.validUntil = validUntil;
            return this;
        }        public LaunchTemplateInstanceMarketOptionsSpotOptions build() {
            return new LaunchTemplateInstanceMarketOptionsSpotOptions(blockDurationMinutes, instanceInterruptionBehavior, maxPrice, spotInstanceType, validUntil);
        }
    }
}
