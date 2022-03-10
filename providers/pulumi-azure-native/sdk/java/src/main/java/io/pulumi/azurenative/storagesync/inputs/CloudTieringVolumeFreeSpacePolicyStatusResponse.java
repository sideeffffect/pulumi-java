// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Status of the volume free space policy
 * 
 */
public final class CloudTieringVolumeFreeSpacePolicyStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final CloudTieringVolumeFreeSpacePolicyStatusResponse Empty = new CloudTieringVolumeFreeSpacePolicyStatusResponse();

    /**
     * Current volume free space percentage.
     * 
     */
    @InputImport(name="currentVolumeFreeSpacePercent", required=true)
      private final Integer currentVolumeFreeSpacePercent;

    public Integer getCurrentVolumeFreeSpacePercent() {
        return this.currentVolumeFreeSpacePercent;
    }

    /**
     * In the case where multiple server endpoints are present in a volume, an effective free space policy is applied.
     * 
     */
    @InputImport(name="effectiveVolumeFreeSpacePolicy", required=true)
      private final Integer effectiveVolumeFreeSpacePolicy;

    public Integer getEffectiveVolumeFreeSpacePolicy() {
        return this.effectiveVolumeFreeSpacePolicy;
    }

    /**
     * Last updated timestamp
     * 
     */
    @InputImport(name="lastUpdatedTimestamp", required=true)
      private final String lastUpdatedTimestamp;

    public String getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public CloudTieringVolumeFreeSpacePolicyStatusResponse(
        Integer currentVolumeFreeSpacePercent,
        Integer effectiveVolumeFreeSpacePolicy,
        String lastUpdatedTimestamp) {
        this.currentVolumeFreeSpacePercent = Objects.requireNonNull(currentVolumeFreeSpacePercent, "expected parameter 'currentVolumeFreeSpacePercent' to be non-null");
        this.effectiveVolumeFreeSpacePolicy = Objects.requireNonNull(effectiveVolumeFreeSpacePolicy, "expected parameter 'effectiveVolumeFreeSpacePolicy' to be non-null");
        this.lastUpdatedTimestamp = Objects.requireNonNull(lastUpdatedTimestamp, "expected parameter 'lastUpdatedTimestamp' to be non-null");
    }

    private CloudTieringVolumeFreeSpacePolicyStatusResponse() {
        this.currentVolumeFreeSpacePercent = null;
        this.effectiveVolumeFreeSpacePolicy = null;
        this.lastUpdatedTimestamp = null;
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
        }
        public CloudTieringVolumeFreeSpacePolicyStatusResponse build() {
            return new CloudTieringVolumeFreeSpacePolicyStatusResponse(currentVolumeFreeSpacePercent, effectiveVolumeFreeSpacePolicy, lastUpdatedTimestamp);
        }
    }
}
