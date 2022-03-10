// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.marketplace.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PlanResponse {
    /**
     * Plan accessibility
     * 
     */
    private final @Nullable String accessibility;
    /**
     * Alternative stack type
     * 
     */
    private final String altStackReference;
    /**
     * Friendly name for the plan for display in the marketplace
     * 
     */
    private final String planDisplayName;
    /**
     * Text identifier for this plan
     * 
     */
    private final String planId;
    /**
     * Identifier for this plan
     * 
     */
    private final String skuId;
    /**
     * Stack type (classic or arm)
     * 
     */
    private final String stackType;

    @OutputCustomType.Constructor
    private PlanResponse(
        @OutputCustomType.Parameter("accessibility") @Nullable String accessibility,
        @OutputCustomType.Parameter("altStackReference") String altStackReference,
        @OutputCustomType.Parameter("planDisplayName") String planDisplayName,
        @OutputCustomType.Parameter("planId") String planId,
        @OutputCustomType.Parameter("skuId") String skuId,
        @OutputCustomType.Parameter("stackType") String stackType) {
        this.accessibility = accessibility;
        this.altStackReference = altStackReference;
        this.planDisplayName = planDisplayName;
        this.planId = planId;
        this.skuId = skuId;
        this.stackType = stackType;
    }

    /**
     * Plan accessibility
     * 
    */
    public Optional<String> getAccessibility() {
        return Optional.ofNullable(this.accessibility);
    }
    /**
     * Alternative stack type
     * 
    */
    public String getAltStackReference() {
        return this.altStackReference;
    }
    /**
     * Friendly name for the plan for display in the marketplace
     * 
    */
    public String getPlanDisplayName() {
        return this.planDisplayName;
    }
    /**
     * Text identifier for this plan
     * 
    */
    public String getPlanId() {
        return this.planId;
    }
    /**
     * Identifier for this plan
     * 
    */
    public String getSkuId() {
        return this.skuId;
    }
    /**
     * Stack type (classic or arm)
     * 
    */
    public String getStackType() {
        return this.stackType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessibility;
        private String altStackReference;
        private String planDisplayName;
        private String planId;
        private String skuId;
        private String stackType;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessibility = defaults.accessibility;
    	      this.altStackReference = defaults.altStackReference;
    	      this.planDisplayName = defaults.planDisplayName;
    	      this.planId = defaults.planId;
    	      this.skuId = defaults.skuId;
    	      this.stackType = defaults.stackType;
        }

        public Builder accessibility(@Nullable String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        public Builder altStackReference(String altStackReference) {
            this.altStackReference = Objects.requireNonNull(altStackReference);
            return this;
        }

        public Builder planDisplayName(String planDisplayName) {
            this.planDisplayName = Objects.requireNonNull(planDisplayName);
            return this;
        }

        public Builder planId(String planId) {
            this.planId = Objects.requireNonNull(planId);
            return this;
        }

        public Builder skuId(String skuId) {
            this.skuId = Objects.requireNonNull(skuId);
            return this;
        }

        public Builder stackType(String stackType) {
            this.stackType = Objects.requireNonNull(stackType);
            return this;
        }
        public PlanResponse build() {
            return new PlanResponse(accessibility, altStackReference, planDisplayName, planId, skuId, stackType);
        }
    }
}
