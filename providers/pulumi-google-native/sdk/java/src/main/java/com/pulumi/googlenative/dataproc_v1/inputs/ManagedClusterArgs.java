// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1.inputs.ClusterConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cluster that is managed by the workflow.
 * 
 */
public final class ManagedClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedClusterArgs Empty = new ManagedClusterArgs();

    /**
     * The cluster name prefix. A unique cluster name will be formed by appending a random suffix.The name must contain only lower-case letters (a-z), numbers (0-9), and hyphens (-). Must begin with a letter. Cannot begin or end with hyphen. Must consist of between 2 and 35 characters.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The cluster configuration.
     * 
     */
    @Import(name="config", required=true)
    private Output<ClusterConfigArgs> config;

    public Output<ClusterConfigArgs> config() {
        return this.config;
    }

    /**
     * Optional. The labels to associate with this cluster.Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a given cluster.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    private ManagedClusterArgs() {}

    private ManagedClusterArgs(ManagedClusterArgs $) {
        this.clusterName = $.clusterName;
        this.config = $.config;
        this.labels = $.labels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedClusterArgs $;

        public Builder() {
            $ = new ManagedClusterArgs();
        }

        public Builder(ManagedClusterArgs defaults) {
            $ = new ManagedClusterArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        public Builder config(Output<ClusterConfigArgs> config) {
            $.config = config;
            return this;
        }

        public Builder config(ClusterConfigArgs config) {
            return config(Output.of(config));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public ManagedClusterArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.config = Objects.requireNonNull($.config, "expected parameter 'config' to be non-null");
            return $;
        }
    }

}
