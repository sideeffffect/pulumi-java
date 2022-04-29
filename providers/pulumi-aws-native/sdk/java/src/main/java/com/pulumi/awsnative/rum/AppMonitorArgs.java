// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.rum;

import com.pulumi.awsnative.rum.inputs.AppMonitorConfigurationArgs;
import com.pulumi.awsnative.rum.inputs.AppMonitorTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppMonitorArgs extends ResourceArgs {

    public static final AppMonitorArgs Empty = new AppMonitorArgs();

    @Import(name="appMonitorConfiguration")
    private @Nullable Output<AppMonitorConfigurationArgs> appMonitorConfiguration;

    public Optional<Output<AppMonitorConfigurationArgs>> appMonitorConfiguration() {
        return Optional.ofNullable(this.appMonitorConfiguration);
    }

    /**
     * Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a copy of this telemetry data to CWLlong in your account. This enables you to keep the telemetry data for more than 30 days, but it does incur CWLlong charges. If you omit this parameter, the default is false
     * 
     */
    @Import(name="cwLogEnabled")
    private @Nullable Output<Boolean> cwLogEnabled;

    /**
     * @return Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a copy of this telemetry data to CWLlong in your account. This enables you to keep the telemetry data for more than 30 days, but it does incur CWLlong charges. If you omit this parameter, the default is false
     * 
     */
    public Optional<Output<Boolean>> cwLogEnabled() {
        return Optional.ofNullable(this.cwLogEnabled);
    }

    /**
     * The top-level internet domain name for which your application has administrative authority.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return The top-level internet domain name for which your application has administrative authority.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * A name for the app monitor
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A name for the app monitor
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="tags")
    private @Nullable Output<List<AppMonitorTagArgs>> tags;

    public Optional<Output<List<AppMonitorTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AppMonitorArgs() {}

    private AppMonitorArgs(AppMonitorArgs $) {
        this.appMonitorConfiguration = $.appMonitorConfiguration;
        this.cwLogEnabled = $.cwLogEnabled;
        this.domain = $.domain;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppMonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppMonitorArgs $;

        public Builder() {
            $ = new AppMonitorArgs();
        }

        public Builder(AppMonitorArgs defaults) {
            $ = new AppMonitorArgs(Objects.requireNonNull(defaults));
        }

        public Builder appMonitorConfiguration(@Nullable Output<AppMonitorConfigurationArgs> appMonitorConfiguration) {
            $.appMonitorConfiguration = appMonitorConfiguration;
            return this;
        }

        public Builder appMonitorConfiguration(AppMonitorConfigurationArgs appMonitorConfiguration) {
            return appMonitorConfiguration(Output.of(appMonitorConfiguration));
        }

        /**
         * @param cwLogEnabled Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a copy of this telemetry data to CWLlong in your account. This enables you to keep the telemetry data for more than 30 days, but it does incur CWLlong charges. If you omit this parameter, the default is false
         * 
         * @return builder
         * 
         */
        public Builder cwLogEnabled(@Nullable Output<Boolean> cwLogEnabled) {
            $.cwLogEnabled = cwLogEnabled;
            return this;
        }

        /**
         * @param cwLogEnabled Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a copy of this telemetry data to CWLlong in your account. This enables you to keep the telemetry data for more than 30 days, but it does incur CWLlong charges. If you omit this parameter, the default is false
         * 
         * @return builder
         * 
         */
        public Builder cwLogEnabled(Boolean cwLogEnabled) {
            return cwLogEnabled(Output.of(cwLogEnabled));
        }

        /**
         * @param domain The top-level internet domain name for which your application has administrative authority.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The top-level internet domain name for which your application has administrative authority.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param name A name for the app monitor
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name for the app monitor
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder tags(@Nullable Output<List<AppMonitorTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<AppMonitorTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(AppMonitorTagArgs... tags) {
            return tags(List.of(tags));
        }

        public AppMonitorArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            return $;
        }
    }

}
