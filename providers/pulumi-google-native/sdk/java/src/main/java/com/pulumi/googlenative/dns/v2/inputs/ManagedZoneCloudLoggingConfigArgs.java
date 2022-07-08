// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cloud Logging configurations for publicly visible zones.
 * 
 */
public final class ManagedZoneCloudLoggingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedZoneCloudLoggingConfigArgs Empty = new ManagedZoneCloudLoggingConfigArgs();

    /**
     * If set, enable query logging for this ManagedZone. False by default, making logging opt-in.
     * 
     */
    @Import(name="enableLogging")
    private @Nullable Output<Boolean> enableLogging;

    /**
     * @return If set, enable query logging for this ManagedZone. False by default, making logging opt-in.
     * 
     */
    public Optional<Output<Boolean>> enableLogging() {
        return Optional.ofNullable(this.enableLogging);
    }

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    private ManagedZoneCloudLoggingConfigArgs() {}

    private ManagedZoneCloudLoggingConfigArgs(ManagedZoneCloudLoggingConfigArgs $) {
        this.enableLogging = $.enableLogging;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZoneCloudLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZoneCloudLoggingConfigArgs $;

        public Builder() {
            $ = new ManagedZoneCloudLoggingConfigArgs();
        }

        public Builder(ManagedZoneCloudLoggingConfigArgs defaults) {
            $ = new ManagedZoneCloudLoggingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableLogging If set, enable query logging for this ManagedZone. False by default, making logging opt-in.
         * 
         * @return builder
         * 
         */
        public Builder enableLogging(@Nullable Output<Boolean> enableLogging) {
            $.enableLogging = enableLogging;
            return this;
        }

        /**
         * @param enableLogging If set, enable query logging for this ManagedZone. False by default, making logging opt-in.
         * 
         * @return builder
         * 
         */
        public Builder enableLogging(Boolean enableLogging) {
            return enableLogging(Output.of(enableLogging));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public ManagedZoneCloudLoggingConfigArgs build() {
            return $;
        }
    }

}
