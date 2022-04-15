// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrderableClusterArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOrderableClusterArgs Empty = new GetOrderableClusterArgs();

    /**
     * Reshift Cluster typeE.g., `multi-node` or `single-node`
     * 
     */
    @Import(name="clusterType")
      private final @Nullable String clusterType;

    public Optional<String> clusterType() {
        return this.clusterType == null ? Optional.empty() : Optional.ofNullable(this.clusterType);
    }

    /**
     * Redshift Cluster versionE.g., `1.0`
     * 
     */
    @Import(name="clusterVersion")
      private final @Nullable String clusterVersion;

    public Optional<String> clusterVersion() {
        return this.clusterVersion == null ? Optional.empty() : Optional.ofNullable(this.clusterVersion);
    }

    /**
     * Redshift Cluster node typeE.g., `dc2.8xlarge`
     * 
     */
    @Import(name="nodeType")
      private final @Nullable String nodeType;

    public Optional<String> nodeType() {
        return this.nodeType == null ? Optional.empty() : Optional.ofNullable(this.nodeType);
    }

    /**
     * Ordered list of preferred Redshift Cluster node types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
     * 
     */
    @Import(name="preferredNodeTypes")
      private final @Nullable List<String> preferredNodeTypes;

    public List<String> preferredNodeTypes() {
        return this.preferredNodeTypes == null ? List.of() : this.preferredNodeTypes;
    }

    public GetOrderableClusterArgs(
        @Nullable String clusterType,
        @Nullable String clusterVersion,
        @Nullable String nodeType,
        @Nullable List<String> preferredNodeTypes) {
        this.clusterType = clusterType;
        this.clusterVersion = clusterVersion;
        this.nodeType = nodeType;
        this.preferredNodeTypes = preferredNodeTypes;
    }

    private GetOrderableClusterArgs() {
        this.clusterType = null;
        this.clusterVersion = null;
        this.nodeType = null;
        this.preferredNodeTypes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrderableClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterType;
        private @Nullable String clusterVersion;
        private @Nullable String nodeType;
        private @Nullable List<String> preferredNodeTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrderableClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterType = defaults.clusterType;
    	      this.clusterVersion = defaults.clusterVersion;
    	      this.nodeType = defaults.nodeType;
    	      this.preferredNodeTypes = defaults.preferredNodeTypes;
        }

        public Builder clusterType(@Nullable String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Builder clusterVersion(@Nullable String clusterVersion) {
            this.clusterVersion = clusterVersion;
            return this;
        }
        public Builder nodeType(@Nullable String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Builder preferredNodeTypes(@Nullable List<String> preferredNodeTypes) {
            this.preferredNodeTypes = preferredNodeTypes;
            return this;
        }
        public Builder preferredNodeTypes(String... preferredNodeTypes) {
            return preferredNodeTypes(List.of(preferredNodeTypes));
        }        public GetOrderableClusterArgs build() {
            return new GetOrderableClusterArgs(clusterType, clusterVersion, nodeType, preferredNodeTypes);
        }
    }
}
