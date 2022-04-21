// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLoggingConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoggingConfigurationArgs Empty = new GetLoggingConfigurationArgs();

    @Import(name="firewallArn", required=true)
    private String firewallArn;

    public String firewallArn() {
        return this.firewallArn;
    }

    private GetLoggingConfigurationArgs() {}

    private GetLoggingConfigurationArgs(GetLoggingConfigurationArgs $) {
        this.firewallArn = $.firewallArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoggingConfigurationArgs $;

        public Builder() {
            $ = new GetLoggingConfigurationArgs();
        }

        public Builder(GetLoggingConfigurationArgs defaults) {
            $ = new GetLoggingConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder firewallArn(String firewallArn) {
            $.firewallArn = firewallArn;
            return this;
        }

        public GetLoggingConfigurationArgs build() {
            $.firewallArn = Objects.requireNonNull($.firewallArn, "expected parameter 'firewallArn' to be non-null");
            return $;
        }
    }

}
