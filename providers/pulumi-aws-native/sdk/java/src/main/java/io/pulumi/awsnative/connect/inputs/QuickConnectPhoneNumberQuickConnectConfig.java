// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The phone configuration. This is required only if QuickConnectType is PHONE_NUMBER.
 * 
 */
public final class QuickConnectPhoneNumberQuickConnectConfig extends io.pulumi.resources.InvokeArgs {

    public static final QuickConnectPhoneNumberQuickConnectConfig Empty = new QuickConnectPhoneNumberQuickConnectConfig();

    @InputImport(name="phoneNumber", required=true)
      private final String phoneNumber;

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public QuickConnectPhoneNumberQuickConnectConfig(String phoneNumber) {
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "expected parameter 'phoneNumber' to be non-null");
    }

    private QuickConnectPhoneNumberQuickConnectConfig() {
        this.phoneNumber = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectPhoneNumberQuickConnectConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectPhoneNumberQuickConnectConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }
        public QuickConnectPhoneNumberQuickConnectConfig build() {
            return new QuickConnectPhoneNumberQuickConnectConfig(phoneNumber);
        }
    }
}
