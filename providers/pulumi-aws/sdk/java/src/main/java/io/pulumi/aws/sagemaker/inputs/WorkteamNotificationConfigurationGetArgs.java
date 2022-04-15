// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkteamNotificationConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkteamNotificationConfigurationGetArgs Empty = new WorkteamNotificationConfigurationGetArgs();

    /**
     * The ARN for the SNS topic to which notifications should be published.
     * 
     */
    @Import(name="notificationTopicArn")
      private final @Nullable Output<String> notificationTopicArn;

    public Output<String> notificationTopicArn() {
        return this.notificationTopicArn == null ? Codegen.empty() : this.notificationTopicArn;
    }

    public WorkteamNotificationConfigurationGetArgs(@Nullable Output<String> notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }

    private WorkteamNotificationConfigurationGetArgs() {
        this.notificationTopicArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkteamNotificationConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> notificationTopicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkteamNotificationConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notificationTopicArn = defaults.notificationTopicArn;
        }

        public Builder notificationTopicArn(@Nullable Output<String> notificationTopicArn) {
            this.notificationTopicArn = notificationTopicArn;
            return this;
        }
        public Builder notificationTopicArn(@Nullable String notificationTopicArn) {
            this.notificationTopicArn = Codegen.ofNullable(notificationTopicArn);
            return this;
        }        public WorkteamNotificationConfigurationGetArgs build() {
            return new WorkteamNotificationConfigurationGetArgs(notificationTopicArn);
        }
    }
}
