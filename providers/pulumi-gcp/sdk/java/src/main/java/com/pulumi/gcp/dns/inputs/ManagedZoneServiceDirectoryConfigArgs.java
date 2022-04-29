// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigNamespaceArgs;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;


public final class ManagedZoneServiceDirectoryConfigArgs extends ResourceArgs {

    public static final ManagedZoneServiceDirectoryConfigArgs Empty = new ManagedZoneServiceDirectoryConfigArgs();

    /**
     * The namespace associated with the zone.
     * Structure is documented below.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<ManagedZoneServiceDirectoryConfigNamespaceArgs> namespace;

    /**
     * @return The namespace associated with the zone.
     * Structure is documented below.
     * 
     */
    public Output<ManagedZoneServiceDirectoryConfigNamespaceArgs> namespace() {
        return this.namespace;
    }

    private ManagedZoneServiceDirectoryConfigArgs() {}

    private ManagedZoneServiceDirectoryConfigArgs(ManagedZoneServiceDirectoryConfigArgs $) {
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

        /**
         * @param namespace The namespace associated with the zone.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<ManagedZoneServiceDirectoryConfigNamespaceArgs> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespace associated with the zone.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder namespace(ManagedZoneServiceDirectoryConfigNamespaceArgs namespace) {
            return namespace(Output.of(namespace));
        }

        public ManagedZoneServiceDirectoryConfigArgs build() {
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            return $;
        }
    }

}
