// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserPoolVerificationMessageTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserPoolVerificationMessageTemplateArgs Empty = new UserPoolVerificationMessageTemplateArgs();

    /**
     * Default email option. Must be either `CONFIRM_WITH_CODE` or `CONFIRM_WITH_LINK`. Defaults to `CONFIRM_WITH_CODE`.
     * 
     */
    @Import(name="defaultEmailOption")
    private @Nullable Output<String> defaultEmailOption;

    public Optional<Output<String>> defaultEmailOption() {
        return Optional.ofNullable(this.defaultEmailOption);
    }

    /**
     * Email message template. Must contain the `{####}` placeholder. Conflicts with `email_verification_message` argument.
     * 
     */
    @Import(name="emailMessage")
    private @Nullable Output<String> emailMessage;

    public Optional<Output<String>> emailMessage() {
        return Optional.ofNullable(this.emailMessage);
    }

    /**
     * Email message template for sending a confirmation link to the user, it must contain the `{##Click Here##}` placeholder.
     * 
     */
    @Import(name="emailMessageByLink")
    private @Nullable Output<String> emailMessageByLink;

    public Optional<Output<String>> emailMessageByLink() {
        return Optional.ofNullable(this.emailMessageByLink);
    }

    /**
     * Subject line for the email message template. Conflicts with `email_verification_subject` argument.
     * 
     */
    @Import(name="emailSubject")
    private @Nullable Output<String> emailSubject;

    public Optional<Output<String>> emailSubject() {
        return Optional.ofNullable(this.emailSubject);
    }

    /**
     * Subject line for the email message template for sending a confirmation link to the user.
     * 
     */
    @Import(name="emailSubjectByLink")
    private @Nullable Output<String> emailSubjectByLink;

    public Optional<Output<String>> emailSubjectByLink() {
        return Optional.ofNullable(this.emailSubjectByLink);
    }

    /**
     * SMS message template. Must contain the `{####}` placeholder. Conflicts with `sms_verification_message` argument.
     * 
     */
    @Import(name="smsMessage")
    private @Nullable Output<String> smsMessage;

    public Optional<Output<String>> smsMessage() {
        return Optional.ofNullable(this.smsMessage);
    }

    private UserPoolVerificationMessageTemplateArgs() {}

    private UserPoolVerificationMessageTemplateArgs(UserPoolVerificationMessageTemplateArgs $) {
        this.defaultEmailOption = $.defaultEmailOption;
        this.emailMessage = $.emailMessage;
        this.emailMessageByLink = $.emailMessageByLink;
        this.emailSubject = $.emailSubject;
        this.emailSubjectByLink = $.emailSubjectByLink;
        this.smsMessage = $.smsMessage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPoolVerificationMessageTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPoolVerificationMessageTemplateArgs $;

        public Builder() {
            $ = new UserPoolVerificationMessageTemplateArgs();
        }

        public Builder(UserPoolVerificationMessageTemplateArgs defaults) {
            $ = new UserPoolVerificationMessageTemplateArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultEmailOption(@Nullable Output<String> defaultEmailOption) {
            $.defaultEmailOption = defaultEmailOption;
            return this;
        }

        public Builder defaultEmailOption(String defaultEmailOption) {
            return defaultEmailOption(Output.of(defaultEmailOption));
        }

        public Builder emailMessage(@Nullable Output<String> emailMessage) {
            $.emailMessage = emailMessage;
            return this;
        }

        public Builder emailMessage(String emailMessage) {
            return emailMessage(Output.of(emailMessage));
        }

        public Builder emailMessageByLink(@Nullable Output<String> emailMessageByLink) {
            $.emailMessageByLink = emailMessageByLink;
            return this;
        }

        public Builder emailMessageByLink(String emailMessageByLink) {
            return emailMessageByLink(Output.of(emailMessageByLink));
        }

        public Builder emailSubject(@Nullable Output<String> emailSubject) {
            $.emailSubject = emailSubject;
            return this;
        }

        public Builder emailSubject(String emailSubject) {
            return emailSubject(Output.of(emailSubject));
        }

        public Builder emailSubjectByLink(@Nullable Output<String> emailSubjectByLink) {
            $.emailSubjectByLink = emailSubjectByLink;
            return this;
        }

        public Builder emailSubjectByLink(String emailSubjectByLink) {
            return emailSubjectByLink(Output.of(emailSubjectByLink));
        }

        public Builder smsMessage(@Nullable Output<String> smsMessage) {
            $.smsMessage = smsMessage;
            return this;
        }

        public Builder smsMessage(String smsMessage) {
            return smsMessage(Output.of(smsMessage));
        }

        public UserPoolVerificationMessageTemplateArgs build() {
            return $;
        }
    }

}
