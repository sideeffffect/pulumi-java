// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserPoolVerificationMessageTemplate {
    /**
     * Default email option. Must be either `CONFIRM_WITH_CODE` or `CONFIRM_WITH_LINK`. Defaults to `CONFIRM_WITH_CODE`.
     * 
     */
    private final @Nullable String defaultEmailOption;
    /**
     * Email message template. Must contain the `{####}` placeholder. Conflicts with `email_verification_message` argument.
     * 
     */
    private final @Nullable String emailMessage;
    /**
     * Email message template for sending a confirmation link to the user, it must contain the `{##Click Here##}` placeholder.
     * 
     */
    private final @Nullable String emailMessageByLink;
    /**
     * Subject line for the email message template. Conflicts with `email_verification_subject` argument.
     * 
     */
    private final @Nullable String emailSubject;
    /**
     * Subject line for the email message template for sending a confirmation link to the user.
     * 
     */
    private final @Nullable String emailSubjectByLink;
    /**
     * SMS message template. Must contain the `{####}` placeholder. Conflicts with `sms_verification_message` argument.
     * 
     */
    private final @Nullable String smsMessage;

    @CustomType.Constructor
    private UserPoolVerificationMessageTemplate(
        @CustomType.Parameter("defaultEmailOption") @Nullable String defaultEmailOption,
        @CustomType.Parameter("emailMessage") @Nullable String emailMessage,
        @CustomType.Parameter("emailMessageByLink") @Nullable String emailMessageByLink,
        @CustomType.Parameter("emailSubject") @Nullable String emailSubject,
        @CustomType.Parameter("emailSubjectByLink") @Nullable String emailSubjectByLink,
        @CustomType.Parameter("smsMessage") @Nullable String smsMessage) {
        this.defaultEmailOption = defaultEmailOption;
        this.emailMessage = emailMessage;
        this.emailMessageByLink = emailMessageByLink;
        this.emailSubject = emailSubject;
        this.emailSubjectByLink = emailSubjectByLink;
        this.smsMessage = smsMessage;
    }

    /**
     * Default email option. Must be either `CONFIRM_WITH_CODE` or `CONFIRM_WITH_LINK`. Defaults to `CONFIRM_WITH_CODE`.
     * 
    */
    public Optional<String> defaultEmailOption() {
        return Optional.ofNullable(this.defaultEmailOption);
    }
    /**
     * Email message template. Must contain the `{####}` placeholder. Conflicts with `email_verification_message` argument.
     * 
    */
    public Optional<String> emailMessage() {
        return Optional.ofNullable(this.emailMessage);
    }
    /**
     * Email message template for sending a confirmation link to the user, it must contain the `{##Click Here##}` placeholder.
     * 
    */
    public Optional<String> emailMessageByLink() {
        return Optional.ofNullable(this.emailMessageByLink);
    }
    /**
     * Subject line for the email message template. Conflicts with `email_verification_subject` argument.
     * 
    */
    public Optional<String> emailSubject() {
        return Optional.ofNullable(this.emailSubject);
    }
    /**
     * Subject line for the email message template for sending a confirmation link to the user.
     * 
    */
    public Optional<String> emailSubjectByLink() {
        return Optional.ofNullable(this.emailSubjectByLink);
    }
    /**
     * SMS message template. Must contain the `{####}` placeholder. Conflicts with `sms_verification_message` argument.
     * 
    */
    public Optional<String> smsMessage() {
        return Optional.ofNullable(this.smsMessage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolVerificationMessageTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultEmailOption;
        private @Nullable String emailMessage;
        private @Nullable String emailMessageByLink;
        private @Nullable String emailSubject;
        private @Nullable String emailSubjectByLink;
        private @Nullable String smsMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolVerificationMessageTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultEmailOption = defaults.defaultEmailOption;
    	      this.emailMessage = defaults.emailMessage;
    	      this.emailMessageByLink = defaults.emailMessageByLink;
    	      this.emailSubject = defaults.emailSubject;
    	      this.emailSubjectByLink = defaults.emailSubjectByLink;
    	      this.smsMessage = defaults.smsMessage;
        }

        public Builder defaultEmailOption(@Nullable String defaultEmailOption) {
            this.defaultEmailOption = defaultEmailOption;
            return this;
        }
        public Builder emailMessage(@Nullable String emailMessage) {
            this.emailMessage = emailMessage;
            return this;
        }
        public Builder emailMessageByLink(@Nullable String emailMessageByLink) {
            this.emailMessageByLink = emailMessageByLink;
            return this;
        }
        public Builder emailSubject(@Nullable String emailSubject) {
            this.emailSubject = emailSubject;
            return this;
        }
        public Builder emailSubjectByLink(@Nullable String emailSubjectByLink) {
            this.emailSubjectByLink = emailSubjectByLink;
            return this;
        }
        public Builder smsMessage(@Nullable String smsMessage) {
            this.smsMessage = smsMessage;
            return this;
        }        public UserPoolVerificationMessageTemplate build() {
            return new UserPoolVerificationMessageTemplate(defaultEmailOption, emailMessage, emailMessageByLink, emailSubject, emailSubjectByLink, smsMessage);
        }
    }
}
