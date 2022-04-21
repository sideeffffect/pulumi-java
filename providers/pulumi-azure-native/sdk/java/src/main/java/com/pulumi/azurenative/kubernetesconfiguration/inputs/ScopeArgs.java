// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration.inputs;

import com.pulumi.azurenative.kubernetesconfiguration.inputs.ScopeClusterArgs;
import com.pulumi.azurenative.kubernetesconfiguration.inputs.ScopeNamespaceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Scope of the extensionInstance. It can be either Cluster or Namespace; but not both.
 * 
 */
public final class ScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScopeArgs Empty = new ScopeArgs();

    /**
     * Specifies that the scope of the extensionInstance is Cluster
     * 
     */
    @Import(name="cluster")
    private @Nullable Output<ScopeClusterArgs> cluster;

    public Optional<Output<ScopeClusterArgs>> cluster() {
        return Optional.ofNullable(this.cluster);
    }

    /**
     * Specifies that the scope of the extensionInstance is Namespace
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<ScopeNamespaceArgs> namespace;

    public Optional<Output<ScopeNamespaceArgs>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    private ScopeArgs() {}

    private ScopeArgs(ScopeArgs $) {
        this.cluster = $.cluster;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScopeArgs $;

        public Builder() {
            $ = new ScopeArgs();
        }

        public Builder(ScopeArgs defaults) {
            $ = new ScopeArgs(Objects.requireNonNull(defaults));
        }

        public Builder cluster(@Nullable Output<ScopeClusterArgs> cluster) {
            $.cluster = cluster;
            return this;
        }

        public Builder cluster(ScopeClusterArgs cluster) {
            return cluster(Output.of(cluster));
        }

        public Builder namespace(@Nullable Output<ScopeNamespaceArgs> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(ScopeNamespaceArgs namespace) {
            return namespace(Output.of(namespace));
        }

        public ScopeArgs build() {
            return $;
        }
    }

}
