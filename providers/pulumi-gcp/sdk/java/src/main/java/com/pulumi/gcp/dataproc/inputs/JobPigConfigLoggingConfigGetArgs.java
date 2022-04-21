// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class JobPigConfigLoggingConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobPigConfigLoggingConfigGetArgs Empty = new JobPigConfigLoggingConfigGetArgs();

    @Import(name="driverLogLevels", required=true)
    private Output<Map<String,String>> driverLogLevels;

    public Output<Map<String,String>> driverLogLevels() {
        return this.driverLogLevels;
    }

    private JobPigConfigLoggingConfigGetArgs() {}

    private JobPigConfigLoggingConfigGetArgs(JobPigConfigLoggingConfigGetArgs $) {
        this.driverLogLevels = $.driverLogLevels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobPigConfigLoggingConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobPigConfigLoggingConfigGetArgs $;

        public Builder() {
            $ = new JobPigConfigLoggingConfigGetArgs();
        }

        public Builder(JobPigConfigLoggingConfigGetArgs defaults) {
            $ = new JobPigConfigLoggingConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder driverLogLevels(Output<Map<String,String>> driverLogLevels) {
            $.driverLogLevels = driverLogLevels;
            return this;
        }

        public Builder driverLogLevels(Map<String,String> driverLogLevels) {
            return driverLogLevels(Output.of(driverLogLevels));
        }

        public JobPigConfigLoggingConfigGetArgs build() {
            $.driverLogLevels = Objects.requireNonNull($.driverLogLevels, "expected parameter 'driverLogLevels' to be non-null");
            return $;
        }
    }

}
