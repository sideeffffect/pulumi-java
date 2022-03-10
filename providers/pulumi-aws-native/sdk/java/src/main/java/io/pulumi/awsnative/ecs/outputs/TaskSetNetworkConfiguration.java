// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.awsnative.ecs.outputs.TaskSetAwsVpcConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskSetNetworkConfiguration {
    private final @Nullable TaskSetAwsVpcConfiguration awsVpcConfiguration;

    @OutputCustomType.Constructor
    private TaskSetNetworkConfiguration(@OutputCustomType.Parameter("awsVpcConfiguration") @Nullable TaskSetAwsVpcConfiguration awsVpcConfiguration) {
        this.awsVpcConfiguration = awsVpcConfiguration;
    }

    public Optional<TaskSetAwsVpcConfiguration> getAwsVpcConfiguration() {
        return Optional.ofNullable(this.awsVpcConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetNetworkConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TaskSetAwsVpcConfiguration awsVpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetNetworkConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsVpcConfiguration = defaults.awsVpcConfiguration;
        }

        public Builder awsVpcConfiguration(@Nullable TaskSetAwsVpcConfiguration awsVpcConfiguration) {
            this.awsVpcConfiguration = awsVpcConfiguration;
            return this;
        }
        public TaskSetNetworkConfiguration build() {
            return new TaskSetNetworkConfiguration(awsVpcConfiguration);
        }
    }
}
