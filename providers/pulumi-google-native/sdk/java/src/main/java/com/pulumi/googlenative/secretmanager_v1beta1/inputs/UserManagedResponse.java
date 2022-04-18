// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.secretmanager_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.secretmanager_v1beta1.inputs.ReplicaResponse;
import java.util.List;
import java.util.Objects;


/**
 * A replication policy that replicates the Secret payload into the locations specified in Secret.replication.user_managed.replicas
 * 
 */
public final class UserManagedResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserManagedResponse Empty = new UserManagedResponse();

    /**
     * The list of Replicas for this Secret. Cannot be empty.
     * 
     */
    @Import(name="replicas", required=true)
      private final List<ReplicaResponse> replicas;

    public List<ReplicaResponse> replicas() {
        return this.replicas;
    }

    public UserManagedResponse(List<ReplicaResponse> replicas) {
        this.replicas = Objects.requireNonNull(replicas, "expected parameter 'replicas' to be non-null");
    }

    private UserManagedResponse() {
        this.replicas = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserManagedResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ReplicaResponse> replicas;

        public Builder() {
    	      // Empty
        }

        public Builder(UserManagedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicas = defaults.replicas;
        }

        public Builder replicas(List<ReplicaResponse> replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }
        public Builder replicas(ReplicaResponse... replicas) {
            return replicas(List.of(replicas));
        }        public UserManagedResponse build() {
            return new UserManagedResponse(replicas);
        }
    }
}
