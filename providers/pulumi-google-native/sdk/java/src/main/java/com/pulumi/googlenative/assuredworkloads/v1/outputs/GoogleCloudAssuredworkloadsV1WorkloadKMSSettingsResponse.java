// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.assuredworkloads.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse {
    /**
     * @return Input only. Immutable. The time at which the Key Management Service will automatically create a new version of the crypto key and mark it as the primary.
     * 
     */
    private final String nextRotationTime;
    /**
     * @return Input only. Immutable. [next_rotation_time] will be advanced by this period when the Key Management Service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours.
     * 
     */
    private final String rotationPeriod;

    @CustomType.Constructor
    private GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse(
        @CustomType.Parameter("nextRotationTime") String nextRotationTime,
        @CustomType.Parameter("rotationPeriod") String rotationPeriod) {
        this.nextRotationTime = nextRotationTime;
        this.rotationPeriod = rotationPeriod;
    }

    /**
     * @return Input only. Immutable. The time at which the Key Management Service will automatically create a new version of the crypto key and mark it as the primary.
     * 
     */
    public String nextRotationTime() {
        return this.nextRotationTime;
    }
    /**
     * @return Input only. Immutable. [next_rotation_time] will be advanced by this period when the Key Management Service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours.
     * 
     */
    public String rotationPeriod() {
        return this.rotationPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextRotationTime;
        private String rotationPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextRotationTime = defaults.nextRotationTime;
    	      this.rotationPeriod = defaults.rotationPeriod;
        }

        public Builder nextRotationTime(String nextRotationTime) {
            this.nextRotationTime = Objects.requireNonNull(nextRotationTime);
            return this;
        }
        public Builder rotationPeriod(String rotationPeriod) {
            this.rotationPeriod = Objects.requireNonNull(rotationPeriod);
            return this;
        }        public GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse build() {
            return new GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse(nextRotationTime, rotationPeriod);
        }
    }
}
