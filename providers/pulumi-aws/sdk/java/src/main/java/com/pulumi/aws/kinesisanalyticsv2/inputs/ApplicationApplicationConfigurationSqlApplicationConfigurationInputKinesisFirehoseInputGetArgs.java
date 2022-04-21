// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs();

    /**
     * The ARN of the delivery stream.
     * 
     */
    @Import(name="resourceArn", required=true)
    private Output<String> resourceArn;

    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs() {}

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs(ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs $) {
        this.resourceArn = $.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs();
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs defaults) {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceArn(Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputGetArgs build() {
            $.resourceArn = Objects.requireNonNull($.resourceArn, "expected parameter 'resourceArn' to be non-null");
            return $;
        }
    }

}
