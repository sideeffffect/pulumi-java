// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class JobSparkConfigLoggingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobSparkConfigLoggingConfigArgs Empty = new JobSparkConfigLoggingConfigArgs();

    @InputImport(name="driverLogLevels", required=true)
      private final Input<Map<String,String>> driverLogLevels;

    public Input<Map<String,String>> getDriverLogLevels() {
        return this.driverLogLevels;
    }

    public JobSparkConfigLoggingConfigArgs(Input<Map<String,String>> driverLogLevels) {
        this.driverLogLevels = Objects.requireNonNull(driverLogLevels, "expected parameter 'driverLogLevels' to be non-null");
    }

    private JobSparkConfigLoggingConfigArgs() {
        this.driverLogLevels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSparkConfigLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Map<String,String>> driverLogLevels;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSparkConfigLoggingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverLogLevels = defaults.driverLogLevels;
        }

        public Builder driverLogLevels(Input<Map<String,String>> driverLogLevels) {
            this.driverLogLevels = Objects.requireNonNull(driverLogLevels);
            return this;
        }

        public Builder driverLogLevels(Map<String,String> driverLogLevels) {
            this.driverLogLevels = Input.of(Objects.requireNonNull(driverLogLevels));
            return this;
        }
        public JobSparkConfigLoggingConfigArgs build() {
            return new JobSparkConfigLoggingConfigArgs(driverLogLevels);
        }
    }
}
