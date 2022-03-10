// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Sms channel.
 * 
 */
public final class SmsChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SmsChannelPropertiesArgs Empty = new SmsChannelPropertiesArgs();

    /**
     * The Sms account SID. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @InputImport(name="accountSID", required=true)
      private final Input<String> accountSID;

    public Input<String> getAccountSID() {
        return this.accountSID;
    }

    /**
     * The Sms auth token. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @InputImport(name="authToken")
      private final @Nullable Input<String> authToken;

    public Input<String> getAuthToken() {
        return this.authToken == null ? Input.empty() : this.authToken;
    }

    /**
     * Whether this channel is enabled for the bot
     * 
     */
    @InputImport(name="isEnabled", required=true)
      private final Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * Whether this channel is validated for the bot
     * 
     */
    @InputImport(name="isValidated")
      private final @Nullable Input<Boolean> isValidated;

    public Input<Boolean> getIsValidated() {
        return this.isValidated == null ? Input.empty() : this.isValidated;
    }

    /**
     * The Sms phone
     * 
     */
    @InputImport(name="phone", required=true)
      private final Input<String> phone;

    public Input<String> getPhone() {
        return this.phone;
    }

    public SmsChannelPropertiesArgs(
        Input<String> accountSID,
        @Nullable Input<String> authToken,
        Input<Boolean> isEnabled,
        @Nullable Input<Boolean> isValidated,
        Input<String> phone) {
        this.accountSID = Objects.requireNonNull(accountSID, "expected parameter 'accountSID' to be non-null");
        this.authToken = authToken;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.isValidated = isValidated;
        this.phone = Objects.requireNonNull(phone, "expected parameter 'phone' to be non-null");
    }

    private SmsChannelPropertiesArgs() {
        this.accountSID = Input.empty();
        this.authToken = Input.empty();
        this.isEnabled = Input.empty();
        this.isValidated = Input.empty();
        this.phone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmsChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountSID;
        private @Nullable Input<String> authToken;
        private Input<Boolean> isEnabled;
        private @Nullable Input<Boolean> isValidated;
        private Input<String> phone;

        public Builder() {
    	      // Empty
        }

        public Builder(SmsChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountSID = defaults.accountSID;
    	      this.authToken = defaults.authToken;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isValidated = defaults.isValidated;
    	      this.phone = defaults.phone;
        }

        public Builder accountSID(Input<String> accountSID) {
            this.accountSID = Objects.requireNonNull(accountSID);
            return this;
        }

        public Builder accountSID(String accountSID) {
            this.accountSID = Input.of(Objects.requireNonNull(accountSID));
            return this;
        }

        public Builder authToken(@Nullable Input<String> authToken) {
            this.authToken = authToken;
            return this;
        }

        public Builder authToken(@Nullable String authToken) {
            this.authToken = Input.ofNullable(authToken);
            return this;
        }

        public Builder isEnabled(Input<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Input.of(Objects.requireNonNull(isEnabled));
            return this;
        }

        public Builder isValidated(@Nullable Input<Boolean> isValidated) {
            this.isValidated = isValidated;
            return this;
        }

        public Builder isValidated(@Nullable Boolean isValidated) {
            this.isValidated = Input.ofNullable(isValidated);
            return this;
        }

        public Builder phone(Input<String> phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }

        public Builder phone(String phone) {
            this.phone = Input.of(Objects.requireNonNull(phone));
            return this;
        }
        public SmsChannelPropertiesArgs build() {
            return new SmsChannelPropertiesArgs(accountSID, authToken, isEnabled, isValidated, phone);
        }
    }
}
