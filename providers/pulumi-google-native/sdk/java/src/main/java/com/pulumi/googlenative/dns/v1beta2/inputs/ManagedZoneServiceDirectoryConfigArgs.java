// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns.v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns.v1beta2.inputs.ManagedZoneServiceDirectoryConfigNamespaceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information about Service Directory-backed zones.
 * 
 */
public final class ManagedZoneServiceDirectoryConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedZoneServiceDirectoryConfigArgs Empty = new ManagedZoneServiceDirectoryConfigArgs();

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Contains information about the namespace associated with the zone.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<ManagedZoneServiceDirectoryConfigNamespaceArgs> namespace;

    /**
     * @return Contains information about the namespace associated with the zone.
     * 
     */
    public Optional<Output<ManagedZoneServiceDirectoryConfigNamespaceArgs>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    private ManagedZoneServiceDirectoryConfigArgs() {}

    private ManagedZoneServiceDirectoryConfigArgs(ManagedZoneServiceDirectoryConfigArgs $) {
        this.kind = $.kind;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZoneServiceDirectoryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZoneServiceDirectoryConfigArgs $;

        public Builder() {
            $ = new ManagedZoneServiceDirectoryConfigArgs();
        }

        public Builder(ManagedZoneServiceDirectoryConfigArgs defaults) {
            $ = new ManagedZoneServiceDirectoryConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param namespace Contains information about the namespace associated with the zone.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<ManagedZoneServiceDirectoryConfigNamespaceArgs> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Contains information about the namespace associated with the zone.
         * 
         * @return builder
         * 
         */
        public Builder namespace(ManagedZoneServiceDirectoryConfigNamespaceArgs namespace) {
            return namespace(Output.of(namespace));
        }

        public ManagedZoneServiceDirectoryConfigArgs build() {
            return $;
        }
    }

}
