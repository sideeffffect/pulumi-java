// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.timestream.inputs;

import com.pulumi.awsnative.timestream.inputs.ScheduledQueryTimestreamConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Configuration of target store where scheduled query results are written to.
 * 
 */
public final class ScheduledQueryTargetConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduledQueryTargetConfigurationArgs Empty = new ScheduledQueryTargetConfigurationArgs();

    @Import(name="timestreamConfiguration", required=true)
    private Output<ScheduledQueryTimestreamConfigurationArgs> timestreamConfiguration;

    public Output<ScheduledQueryTimestreamConfigurationArgs> timestreamConfiguration() {
        return this.timestreamConfiguration;
    }

    private ScheduledQueryTargetConfigurationArgs() {}

    private ScheduledQueryTargetConfigurationArgs(ScheduledQueryTargetConfigurationArgs $) {
        this.timestreamConfiguration = $.timestreamConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledQueryTargetConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledQueryTargetConfigurationArgs $;

        public Builder() {
            $ = new ScheduledQueryTargetConfigurationArgs();
        }

        public Builder(ScheduledQueryTargetConfigurationArgs defaults) {
            $ = new ScheduledQueryTargetConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder timestreamConfiguration(Output<ScheduledQueryTimestreamConfigurationArgs> timestreamConfiguration) {
            $.timestreamConfiguration = timestreamConfiguration;
            return this;
        }

        public Builder timestreamConfiguration(ScheduledQueryTimestreamConfigurationArgs timestreamConfiguration) {
            return timestreamConfiguration(Output.of(timestreamConfiguration));
        }

        public ScheduledQueryTargetConfigurationArgs build() {
            $.timestreamConfiguration = Objects.requireNonNull($.timestreamConfiguration, "expected parameter 'timestreamConfiguration' to be non-null");
            return $;
        }
    }

}
