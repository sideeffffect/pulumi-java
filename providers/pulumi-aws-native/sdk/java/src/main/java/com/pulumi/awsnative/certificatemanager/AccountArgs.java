// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.certificatemanager;

import com.pulumi.awsnative.certificatemanager.inputs.AccountExpiryEventsConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;


public final class AccountArgs extends ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    @Import(name="expiryEventsConfiguration", required=true)
    private Output<AccountExpiryEventsConfigurationArgs> expiryEventsConfiguration;

    public Output<AccountExpiryEventsConfigurationArgs> expiryEventsConfiguration() {
        return this.expiryEventsConfiguration;
    }

    private AccountArgs() {}

    private AccountArgs(AccountArgs $) {
        this.expiryEventsConfiguration = $.expiryEventsConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountArgs $;

        public Builder() {
            $ = new AccountArgs();
        }

        public Builder(AccountArgs defaults) {
            $ = new AccountArgs(Objects.requireNonNull(defaults));
        }

        public Builder expiryEventsConfiguration(Output<AccountExpiryEventsConfigurationArgs> expiryEventsConfiguration) {
            $.expiryEventsConfiguration = expiryEventsConfiguration;
            return this;
        }

        public Builder expiryEventsConfiguration(AccountExpiryEventsConfigurationArgs expiryEventsConfiguration) {
            return expiryEventsConfiguration(Output.of(expiryEventsConfiguration));
        }

        public AccountArgs build() {
            $.expiryEventsConfiguration = Objects.requireNonNull($.expiryEventsConfiguration, "expected parameter 'expiryEventsConfiguration' to be non-null");
            return $;
        }
    }

}
