// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.assuredworkloads_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Settings specific to the Key Management Service.
 * 
 */
public final class GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs Empty = new GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs();

    /**
     * Input only. Immutable. The time at which the Key Management Service will automatically create a new version of the crypto key and mark it as the primary.
     * 
     */
    @InputImport(name="nextRotationTime", required=true)
      private final Input<String> nextRotationTime;

    public Input<String> getNextRotationTime() {
        return this.nextRotationTime;
    }

    /**
     * Input only. Immutable. [next_rotation_time] will be advanced by this period when the Key Management Service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours.
     * 
     */
    @InputImport(name="rotationPeriod", required=true)
      private final Input<String> rotationPeriod;

    public Input<String> getRotationPeriod() {
        return this.rotationPeriod;
    }

    public GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs(
        Input<String> nextRotationTime,
        Input<String> rotationPeriod) {
        this.nextRotationTime = Objects.requireNonNull(nextRotationTime, "expected parameter 'nextRotationTime' to be non-null");
        this.rotationPeriod = Objects.requireNonNull(rotationPeriod, "expected parameter 'rotationPeriod' to be non-null");
    }

    private GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs() {
        this.nextRotationTime = Input.empty();
        this.rotationPeriod = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> nextRotationTime;
        private Input<String> rotationPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextRotationTime = defaults.nextRotationTime;
    	      this.rotationPeriod = defaults.rotationPeriod;
        }

        public Builder nextRotationTime(Input<String> nextRotationTime) {
            this.nextRotationTime = Objects.requireNonNull(nextRotationTime);
            return this;
        }

        public Builder nextRotationTime(String nextRotationTime) {
            this.nextRotationTime = Input.of(Objects.requireNonNull(nextRotationTime));
            return this;
        }

        public Builder rotationPeriod(Input<String> rotationPeriod) {
            this.rotationPeriod = Objects.requireNonNull(rotationPeriod);
            return this;
        }

        public Builder rotationPeriod(String rotationPeriod) {
            this.rotationPeriod = Input.of(Objects.requireNonNull(rotationPeriod));
            return this;
        }
        public GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs build() {
            return new GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs(nextRotationTime, rotationPeriod);
        }
    }
}
