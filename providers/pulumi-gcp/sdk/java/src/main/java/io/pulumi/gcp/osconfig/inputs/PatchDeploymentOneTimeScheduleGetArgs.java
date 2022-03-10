// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PatchDeploymentOneTimeScheduleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentOneTimeScheduleGetArgs Empty = new PatchDeploymentOneTimeScheduleGetArgs();

    /**
     * The desired patch job execution time. A timestamp in RFC3339 UTC "Zulu" format,
     * accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="executeTime", required=true)
      private final Input<String> executeTime;

    public Input<String> getExecuteTime() {
        return this.executeTime;
    }

    public PatchDeploymentOneTimeScheduleGetArgs(Input<String> executeTime) {
        this.executeTime = Objects.requireNonNull(executeTime, "expected parameter 'executeTime' to be non-null");
    }

    private PatchDeploymentOneTimeScheduleGetArgs() {
        this.executeTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentOneTimeScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> executeTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentOneTimeScheduleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executeTime = defaults.executeTime;
        }

        public Builder executeTime(Input<String> executeTime) {
            this.executeTime = Objects.requireNonNull(executeTime);
            return this;
        }

        public Builder executeTime(String executeTime) {
            this.executeTime = Input.of(Objects.requireNonNull(executeTime));
            return this;
        }
        public PatchDeploymentOneTimeScheduleGetArgs build() {
            return new PatchDeploymentOneTimeScheduleGetArgs(executeTime);
        }
    }
}
