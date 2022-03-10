// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Represents the quantity a commitment plan provides of a metered resource.
 * 
 */
public final class PlanQuantityResponse extends io.pulumi.resources.InvokeArgs {

    public static final PlanQuantityResponse Empty = new PlanQuantityResponse();

    /**
     * The quantity added to the commitment plan at an interval specified by its allowance frequency.
     * 
     */
    @InputImport(name="allowance", required=true)
      private final Double allowance;

    public Double getAllowance() {
        return this.allowance;
    }

    /**
     * The quantity available to the plan the last time usage was calculated.
     * 
     */
    @InputImport(name="amount", required=true)
      private final Double amount;

    public Double getAmount() {
        return this.amount;
    }

    /**
     * The Azure meter for usage against included quantities.
     * 
     */
    @InputImport(name="includedQuantityMeter", required=true)
      private final String includedQuantityMeter;

    public String getIncludedQuantityMeter() {
        return this.includedQuantityMeter;
    }

    /**
     * The Azure meter for usage which exceeds included quantities.
     * 
     */
    @InputImport(name="overageMeter", required=true)
      private final String overageMeter;

    public String getOverageMeter() {
        return this.overageMeter;
    }

    public PlanQuantityResponse(
        Double allowance,
        Double amount,
        String includedQuantityMeter,
        String overageMeter) {
        this.allowance = Objects.requireNonNull(allowance, "expected parameter 'allowance' to be non-null");
        this.amount = Objects.requireNonNull(amount, "expected parameter 'amount' to be non-null");
        this.includedQuantityMeter = Objects.requireNonNull(includedQuantityMeter, "expected parameter 'includedQuantityMeter' to be non-null");
        this.overageMeter = Objects.requireNonNull(overageMeter, "expected parameter 'overageMeter' to be non-null");
    }

    private PlanQuantityResponse() {
        this.allowance = null;
        this.amount = null;
        this.includedQuantityMeter = null;
        this.overageMeter = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanQuantityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double allowance;
        private Double amount;
        private String includedQuantityMeter;
        private String overageMeter;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanQuantityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowance = defaults.allowance;
    	      this.amount = defaults.amount;
    	      this.includedQuantityMeter = defaults.includedQuantityMeter;
    	      this.overageMeter = defaults.overageMeter;
        }

        public Builder allowance(Double allowance) {
            this.allowance = Objects.requireNonNull(allowance);
            return this;
        }

        public Builder amount(Double amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }

        public Builder includedQuantityMeter(String includedQuantityMeter) {
            this.includedQuantityMeter = Objects.requireNonNull(includedQuantityMeter);
            return this;
        }

        public Builder overageMeter(String overageMeter) {
            this.overageMeter = Objects.requireNonNull(overageMeter);
            return this;
        }
        public PlanQuantityResponse build() {
            return new PlanQuantityResponse(allowance, amount, includedQuantityMeter, overageMeter);
        }
    }
}
