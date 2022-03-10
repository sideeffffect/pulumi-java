// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The rotation time and period for a Secret. At next_rotation_time, Secret Manager will send a Pub/Sub notification to the topics configured on the Secret. Secret.topics must be set to configure rotation.
 * 
 */
public final class RotationResponse extends io.pulumi.resources.InvokeArgs {

    public static final RotationResponse Empty = new RotationResponse();

    /**
     * Optional. Timestamp in UTC at which the Secret is scheduled to rotate. Cannot be set to less than 300s (5 min) in the future and at most 3153600000s (100 years). next_rotation_time MUST be set if rotation_period is set.
     * 
     */
    @InputImport(name="nextRotationTime", required=true)
      private final String nextRotationTime;

    public String getNextRotationTime() {
        return this.nextRotationTime;
    }

    /**
     * Input only. The Duration between rotation notifications. Must be in seconds and at least 3600s (1h) and at most 3153600000s (100 years). If rotation_period is set, next_rotation_time must be set. next_rotation_time will be advanced by this period when the service automatically sends rotation notifications.
     * 
     */
    @InputImport(name="rotationPeriod", required=true)
      private final String rotationPeriod;

    public String getRotationPeriod() {
        return this.rotationPeriod;
    }

    public RotationResponse(
        String nextRotationTime,
        String rotationPeriod) {
        this.nextRotationTime = Objects.requireNonNull(nextRotationTime, "expected parameter 'nextRotationTime' to be non-null");
        this.rotationPeriod = Objects.requireNonNull(rotationPeriod, "expected parameter 'rotationPeriod' to be non-null");
    }

    private RotationResponse() {
        this.nextRotationTime = null;
        this.rotationPeriod = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RotationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextRotationTime;
        private String rotationPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(RotationResponse defaults) {
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
        }
        public RotationResponse build() {
            return new RotationResponse(nextRotationTime, rotationPeriod);
        }
    }
}
