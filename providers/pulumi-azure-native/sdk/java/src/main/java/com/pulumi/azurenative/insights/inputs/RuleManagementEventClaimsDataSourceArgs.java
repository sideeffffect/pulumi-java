// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The claims for a rule management event data source.
 * 
 */
public final class RuleManagementEventClaimsDataSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleManagementEventClaimsDataSourceArgs Empty = new RuleManagementEventClaimsDataSourceArgs();

    /**
     * the email address.
     * 
     */
    @Import(name="emailAddress")
    private @Nullable Output<String> emailAddress;

    public Optional<Output<String>> emailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }

    private RuleManagementEventClaimsDataSourceArgs() {}

    private RuleManagementEventClaimsDataSourceArgs(RuleManagementEventClaimsDataSourceArgs $) {
        this.emailAddress = $.emailAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleManagementEventClaimsDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleManagementEventClaimsDataSourceArgs $;

        public Builder() {
            $ = new RuleManagementEventClaimsDataSourceArgs();
        }

        public Builder(RuleManagementEventClaimsDataSourceArgs defaults) {
            $ = new RuleManagementEventClaimsDataSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder emailAddress(@Nullable Output<String> emailAddress) {
            $.emailAddress = emailAddress;
            return this;
        }

        public Builder emailAddress(String emailAddress) {
            return emailAddress(Output.of(emailAddress));
        }

        public RuleManagementEventClaimsDataSourceArgs build() {
            return $;
        }
    }

}
