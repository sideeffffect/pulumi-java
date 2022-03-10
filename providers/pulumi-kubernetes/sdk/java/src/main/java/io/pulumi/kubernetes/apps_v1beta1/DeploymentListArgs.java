// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.apps_v1beta1.inputs.DeploymentArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ListMetaArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentListArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentListArgs Empty = new DeploymentListArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @InputImport(name="apiVersion")
      private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    /**
     * Items is the list of Deployments.
     * 
     */
    @InputImport(name="items", required=true)
      private final Input<List<DeploymentArgs>> items;

    public Input<List<DeploymentArgs>> getItems() {
        return this.items;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Standard list metadata.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<ListMetaArgs> metadata;

    public Input<ListMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    public DeploymentListArgs(
        @Nullable Input<String> apiVersion,
        Input<List<DeploymentArgs>> items,
        @Nullable Input<String> kind,
        @Nullable Input<ListMetaArgs> metadata) {
        this.apiVersion = apiVersion;
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.kind = kind;
        this.metadata = metadata;
    }

    private DeploymentListArgs() {
        this.apiVersion = Input.empty();
        this.items = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private Input<List<DeploymentArgs>> items;
        private @Nullable Input<String> kind;
        private @Nullable Input<ListMetaArgs> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.items = defaults.items;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
        }

        public Builder apiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder items(Input<List<DeploymentArgs>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder items(List<DeploymentArgs> items) {
            this.items = Input.of(Objects.requireNonNull(items));
            return this;
        }

        public Builder kind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder metadata(@Nullable Input<ListMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable ListMetaArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }
        public DeploymentListArgs build() {
            return new DeploymentListArgs(apiVersion, items, kind, metadata);
        }
    }
}
