// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.extensions_v1beta1.inputs.DeploymentSpecArgs;
import com.pulumi.kubernetes.extensions_v1beta1.inputs.DeploymentStatusArgs;
import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Deployment enables declarative updates for Pods and ReplicaSets.
 * 
 * This resource waits until its status is ready before registering success
 * for create/update, and populating output properties from the current state of the resource.
 * The following conditions are used to determine whether the resource creation has
 * succeeded or failed:
 * 
 * 1. The Deployment has begun to be updated by the Deployment controller. If the current
 *    generation of the Deployment is > 1, then this means that the current generation must
 *    be different from the generation reported by the last outputs.
 * 2. There exists a ReplicaSet whose revision is equal to the current revision of the
 *    Deployment.
 * 3. The Deployment's '.status.conditions' has a status of type 'Available' whose 'status'
 *    member is set to 'True'.
 * 4. If the Deployment has generation > 1, then '.status.conditions' has a status of type
 *    'Progressing', whose 'status' member is set to 'True', and whose 'reason' is
 *    'NewReplicaSetAvailable'. For generation <= 1, this status field does not exist,
 *    because it doesn't do a rollout (i.e., it simply creates the Deployment and
 *    corresponding ReplicaSet), and therefore there is no rollout to mark as 'Progressing'.
 * 
 * If the Deployment has not reached a Ready state after 10 minutes, it will
 * time out and mark the resource update as Failed. You can override the default timeout value
 * by setting the 'customTimeouts' option on the resource.
 * 
 */
public final class DeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentArgs Empty = new DeploymentArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> apiVersion() {
        return this.apiVersion == null ? Codegen.empty() : this.apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Standard object metadata.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Specification of the desired behavior of the Deployment.
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<DeploymentSpecArgs> spec;

    public Output<DeploymentSpecArgs> spec() {
        return this.spec == null ? Codegen.empty() : this.spec;
    }

    /**
     * Most recently observed status of the Deployment.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<DeploymentStatusArgs> status;

    public Output<DeploymentStatusArgs> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public DeploymentArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<DeploymentSpecArgs> spec,
        @Nullable Output<DeploymentStatusArgs> status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    private DeploymentArgs() {
        this.apiVersion = Codegen.empty();
        this.kind = Codegen.empty();
        this.metadata = Codegen.empty();
        this.spec = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<DeploymentSpecArgs> spec;
        private @Nullable Output<DeploymentStatusArgs> status;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Codegen.ofNullable(apiVersion);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder spec(@Nullable Output<DeploymentSpecArgs> spec) {
            this.spec = spec;
            return this;
        }
        public Builder spec(@Nullable DeploymentSpecArgs spec) {
            this.spec = Codegen.ofNullable(spec);
            return this;
        }
        public Builder status(@Nullable Output<DeploymentStatusArgs> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable DeploymentStatusArgs status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public DeploymentArgs build() {
            return new DeploymentArgs(apiVersion, kind, metadata, spec, status);
        }
    }
}
