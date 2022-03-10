// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class QuickConnectPhoneNumberQuickConnectConfig {
    private final String phoneNumber;

    @OutputCustomType.Constructor
    private QuickConnectPhoneNumberQuickConnectConfig(@OutputCustomType.Parameter("phoneNumber") String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
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
