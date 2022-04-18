// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagesync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloudTieringVolumeFreeSpacePolicyStatusResponse {
    /**
     * Current volume free space percentage.
     * 
     */
    private final Integer currentVolumeFreeSpacePercent;
    /**
     * In the case where multiple server endpoints are present in a volume, an effective free space policy is applied.
     * 
     */
    private final Integer effectiveVolumeFreeSpacePolicy;
    /**
     * Last updated timestamp
     * 
     */
    private final String lastUpdatedTimestamp;

    @CustomType.Constructor
    private CloudTieringVolumeFreeSpacePolicyStatusResponse(
        @CustomType.Parameter("currentVolumeFreeSpacePercent") Integer currentVolumeFreeSpacePercent,
        @CustomType.Parameter("effectiveVolumeFreeSpacePolicy") Integer effectiveVolumeFreeSpacePolicy,
        @CustomType.Parameter("lastUpdatedTimestamp") String lastUpdatedTimestamp) {
        this.currentVolumeFreeSpacePercent = currentVolumeFreeSpacePercent;
        this.effectiveVolumeFreeSpacePolicy = effectiveVolumeFreeSpacePolicy;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * Current volume free space percentage.
     * 
    */
    public Integer currentVolumeFreeSpacePercent() {
        return this.currentVolumeFreeSpacePercent;
    }
    /**
     * In the case where multiple server endpoints are present in a volume, an effective free space policy is applied.
     * 
    */
    public Integer effectiveVolumeFreeSpacePolicy() {
        return this.effectiveVolumeFreeSpacePolicy;
    }
    /**
     * Last updated timestamp
     * 
    */
    public String lastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudTieringVolumeFreeSpacePolicyStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer currentVolumeFreeSpacePercent;
        private Integer effectiveVolumeFreeSpacePolicy;
        private String lastUpdatedTimestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudTieringVolumeFreeSpacePolicyStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentVolumeFreeSpacePercent = defaults.currentVolumeFreeSpacePercent;
    	      this.effectiveVolumeFreeSpacePolicy = defaults.effectiveVolumeFreeSpacePolicy;
    	      this.lastUpdatedTimestamp = defaults.lastUpdatedTimestamp;
        }

        public Builder currentVolumeFreeSpacePercent(Integer currentVolumeFreeSpacePercent) {
            this.currentVolumeFreeSpacePercent = Objects.requireNonNull(currentVolumeFreeSpacePercent);
            return this;
        }
        public Builder effectiveVolumeFreeSpacePolicy(Integer effectiveVolumeFreeSpacePolicy) {
            this.effectiveVolumeFreeSpacePolicy = Objects.requireNonNull(effectiveVolumeFreeSpacePolicy);
            return this;
        }
        public Builder lastUpdatedTimestamp(String lastUpdatedTimestamp) {
            this.lastUpdatedTimestamp = Objects.requireNonNull(lastUpdatedTimestamp);
            return this;
        }        public CloudTieringVolumeFreeSpacePolicyStatusResponse build() {
            return new CloudTieringVolumeFreeSpacePolicyStatusResponse(currentVolumeFreeSpacePercent, effectiveVolumeFreeSpacePolicy, lastUpdatedTimestamp);
        }
    }
}
