// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Email notification of an autoscale event.
 * 
 */
public final class EmailNotificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EmailNotificationArgs Empty = new EmailNotificationArgs();

    /**
     * the custom e-mails list. This value can be null or empty, in which case this attribute will be ignored.
     * 
     */
    @InputImport(name="customEmails")
      private final @Nullable Input<List<String>> customEmails;

    public Input<List<String>> getCustomEmails() {
        return this.customEmails == null ? Input.empty() : this.customEmails;
    }

    /**
     * a value indicating whether to send email to subscription administrator.
     * 
     */
    @InputImport(name="sendToSubscriptionAdministrator")
      private final @Nullable Input<Boolean> sendToSubscriptionAdministrator;

    public Input<Boolean> getSendToSubscriptionAdministrator() {
        return this.sendToSubscriptionAdministrator == null ? Input.empty() : this.sendToSubscriptionAdministrator;
    }

    /**
     * a value indicating whether to send email to subscription co-administrators.
     * 
     */
    @InputImport(name="sendToSubscriptionCoAdministrators")
      private final @Nullable Input<Boolean> sendToSubscriptionCoAdministrators;

    public Input<Boolean> getSendToSubscriptionCoAdministrators() {
        return this.sendToSubscriptionCoAdministrators == null ? Input.empty() : this.sendToSubscriptionCoAdministrators;
    }

    public EmailNotificationArgs(
        @Nullable Input<List<String>> customEmails,
        @Nullable Input<Boolean> sendToSubscriptionAdministrator,
        @Nullable Input<Boolean> sendToSubscriptionCoAdministrators) {
        this.customEmails = customEmails;
        this.sendToSubscriptionAdministrator = sendToSubscriptionAdministrator == null ? Input.ofNullable(false) : sendToSubscriptionAdministrator;
        this.sendToSubscriptionCoAdministrators = sendToSubscriptionCoAdministrators == null ? Input.ofNullable(false) : sendToSubscriptionCoAdministrators;
    }

    private EmailNotificationArgs() {
        this.customEmails = Input.empty();
        this.sendToSubscriptionAdministrator = Input.empty();
        this.sendToSubscriptionCoAdministrators = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> customEmails;
        private @Nullable Input<Boolean> sendToSubscriptionAdministrator;
        private @Nullable Input<Boolean> sendToSubscriptionCoAdministrators;

        public Builder() {
    	      // Empty
        }

        public Builder(EmailNotificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customEmails = defaults.customEmails;
    	      this.sendToSubscriptionAdministrator = defaults.sendToSubscriptionAdministrator;
    	      this.sendToSubscriptionCoAdministrators = defaults.sendToSubscriptionCoAdministrators;
        }

        public Builder customEmails(@Nullable Input<List<String>> customEmails) {
            this.customEmails = customEmails;
            return this;
        }

        public Builder customEmails(@Nullable List<String> customEmails) {
            this.customEmails = Input.ofNullable(customEmails);
            return this;
        }

        public Builder sendToSubscriptionAdministrator(@Nullable Input<Boolean> sendToSubscriptionAdministrator) {
            this.sendToSubscriptionAdministrator = sendToSubscriptionAdministrator;
            return this;
        }

        public Builder sendToSubscriptionAdministrator(@Nullable Boolean sendToSubscriptionAdministrator) {
            this.sendToSubscriptionAdministrator = Input.ofNullable(sendToSubscriptionAdministrator);
            return this;
        }

        public Builder sendToSubscriptionCoAdministrators(@Nullable Input<Boolean> sendToSubscriptionCoAdministrators) {
            this.sendToSubscriptionCoAdministrators = sendToSubscriptionCoAdministrators;
            return this;
        }

        public Builder sendToSubscriptionCoAdministrators(@Nullable Boolean sendToSubscriptionCoAdministrators) {
            this.sendToSubscriptionCoAdministrators = Input.ofNullable(sendToSubscriptionCoAdministrators);
            return this;
        }
        public EmailNotificationArgs build() {
            return new EmailNotificationArgs(customEmails, sendToSubscriptionAdministrator, sendToSubscriptionCoAdministrators);
        }
    }
}
