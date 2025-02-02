// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PlanDataResponse {
    /**
     * @return different billing cycles like MONTHLY/WEEKLY. this could be enum
     * 
     */
    private final @Nullable String billingCycle;
    /**
     * @return date when plan was applied
     * 
     */
    private final @Nullable String effectiveDate;
    /**
     * @return plan id as published by Logz
     * 
     */
    private final @Nullable String planDetails;
    /**
     * @return different usage type like PAYG/COMMITTED. this could be enum
     * 
     */
    private final @Nullable String usageType;

    @CustomType.Constructor
    private PlanDataResponse(
        @CustomType.Parameter("billingCycle") @Nullable String billingCycle,
        @CustomType.Parameter("effectiveDate") @Nullable String effectiveDate,
        @CustomType.Parameter("planDetails") @Nullable String planDetails,
        @CustomType.Parameter("usageType") @Nullable String usageType) {
        this.billingCycle = billingCycle;
        this.effectiveDate = effectiveDate;
        this.planDetails = planDetails;
        this.usageType = usageType;
    }

    /**
     * @return different billing cycles like MONTHLY/WEEKLY. this could be enum
     * 
     */
    public Optional<String> billingCycle() {
        return Optional.ofNullable(this.billingCycle);
    }
    /**
     * @return date when plan was applied
     * 
     */
    public Optional<String> effectiveDate() {
        return Optional.ofNullable(this.effectiveDate);
    }
    /**
     * @return plan id as published by Logz
     * 
     */
    public Optional<String> planDetails() {
        return Optional.ofNullable(this.planDetails);
    }
    /**
     * @return different usage type like PAYG/COMMITTED. this could be enum
     * 
     */
    public Optional<String> usageType() {
        return Optional.ofNullable(this.usageType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String billingCycle;
        private @Nullable String effectiveDate;
        private @Nullable String planDetails;
        private @Nullable String usageType;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingCycle = defaults.billingCycle;
    	      this.effectiveDate = defaults.effectiveDate;
    	      this.planDetails = defaults.planDetails;
    	      this.usageType = defaults.usageType;
        }

        public Builder billingCycle(@Nullable String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public Builder effectiveDate(@Nullable String effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }
        public Builder planDetails(@Nullable String planDetails) {
            this.planDetails = planDetails;
            return this;
        }
        public Builder usageType(@Nullable String usageType) {
            this.usageType = usageType;
            return this;
        }        public PlanDataResponse build() {
            return new PlanDataResponse(billingCycle, effectiveDate, planDetails, usageType);
        }
    }
}
