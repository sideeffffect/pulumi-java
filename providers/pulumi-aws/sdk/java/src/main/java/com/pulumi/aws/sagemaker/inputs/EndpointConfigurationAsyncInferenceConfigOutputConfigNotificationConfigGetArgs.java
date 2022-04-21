// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs Empty = new EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs();

    /**
     * Amazon SNS topic to post a notification to when inference fails. If no topic is provided, no notification is sent on failure.
     * 
     */
    @Import(name="errorTopic")
    private @Nullable Output<String> errorTopic;

    public Optional<Output<String>> errorTopic() {
        return Optional.ofNullable(this.errorTopic);
    }

    /**
     * Amazon SNS topic to post a notification to when inference completes successfully. If no topic is provided, no notification is sent on success.
     * 
     */
    @Import(name="successTopic")
    private @Nullable Output<String> successTopic;

    public Optional<Output<String>> successTopic() {
        return Optional.ofNullable(this.successTopic);
    }

    private EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs() {}

    private EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs(EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs $) {
        this.errorTopic = $.errorTopic;
        this.successTopic = $.successTopic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs $;

        public Builder() {
            $ = new EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs();
        }

        public Builder(EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs defaults) {
            $ = new EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder errorTopic(@Nullable Output<String> errorTopic) {
            $.errorTopic = errorTopic;
            return this;
        }

        public Builder errorTopic(String errorTopic) {
            return errorTopic(Output.of(errorTopic));
        }

        public Builder successTopic(@Nullable Output<String> successTopic) {
            $.successTopic = successTopic;
            return this;
        }

        public Builder successTopic(String successTopic) {
            return successTopic(Output.of(successTopic));
        }

        public EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs build() {
            return $;
        }
    }

}
