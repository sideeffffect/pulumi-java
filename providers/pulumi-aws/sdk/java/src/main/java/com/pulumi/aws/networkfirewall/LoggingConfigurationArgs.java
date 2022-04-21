// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall;

import com.pulumi.aws.networkfirewall.inputs.LoggingConfigurationLoggingConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LoggingConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationArgs Empty = new LoggingConfigurationArgs();

    /**
     * The Amazon Resource Name (ARN) of the Network Firewall firewall.
     * 
     */
    @Import(name="firewallArn", required=true)
    private Output<String> firewallArn;

    public Output<String> firewallArn() {
        return this.firewallArn;
    }

    /**
     * A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
     * 
     */
    @Import(name="loggingConfiguration", required=true)
    private Output<LoggingConfigurationLoggingConfigurationArgs> loggingConfiguration;

    public Output<LoggingConfigurationLoggingConfigurationArgs> loggingConfiguration() {
        return this.loggingConfiguration;
    }

    private LoggingConfigurationArgs() {}

    private LoggingConfigurationArgs(LoggingConfigurationArgs $) {
        this.firewallArn = $.firewallArn;
        this.loggingConfiguration = $.loggingConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingConfigurationArgs $;

        public Builder() {
            $ = new LoggingConfigurationArgs();
        }

        public Builder(LoggingConfigurationArgs defaults) {
            $ = new LoggingConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder firewallArn(Output<String> firewallArn) {
            $.firewallArn = firewallArn;
            return this;
        }

        public Builder firewallArn(String firewallArn) {
            return firewallArn(Output.of(firewallArn));
        }

        public Builder loggingConfiguration(Output<LoggingConfigurationLoggingConfigurationArgs> loggingConfiguration) {
            $.loggingConfiguration = loggingConfiguration;
            return this;
        }

        public Builder loggingConfiguration(LoggingConfigurationLoggingConfigurationArgs loggingConfiguration) {
            return loggingConfiguration(Output.of(loggingConfiguration));
        }

        public LoggingConfigurationArgs build() {
            $.firewallArn = Objects.requireNonNull($.firewallArn, "expected parameter 'firewallArn' to be non-null");
            $.loggingConfiguration = Objects.requireNonNull($.loggingConfiguration, "expected parameter 'loggingConfiguration' to be non-null");
            return $;
        }
    }

}
