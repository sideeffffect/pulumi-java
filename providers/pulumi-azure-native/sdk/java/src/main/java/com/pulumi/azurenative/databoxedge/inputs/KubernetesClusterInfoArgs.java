// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Kubernetes cluster configuration
 * 
 */
public final class KubernetesClusterInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterInfoArgs Empty = new KubernetesClusterInfoArgs();

    /**
     * Kubernetes cluster version
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    public Output<String> version() {
        return this.version;
    }

    private KubernetesClusterInfoArgs() {}

    private KubernetesClusterInfoArgs(KubernetesClusterInfoArgs $) {
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterInfoArgs $;

        public Builder() {
            $ = new KubernetesClusterInfoArgs();
        }

        public Builder(KubernetesClusterInfoArgs defaults) {
            $ = new KubernetesClusterInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public KubernetesClusterInfoArgs build() {
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
