// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.inputs;

import io.pulumi.azurenative.eventhub.enums.ClusterSkuName;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SKU parameters particular to a cluster instance.
 * 
 */
public final class ClusterSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterSkuArgs Empty = new ClusterSkuArgs();

    /**
     * The quantity of Event Hubs Cluster Capacity Units contained in this cluster.
     * 
     */
    @InputImport(name="capacity")
      private final @Nullable Input<Integer> capacity;

    public Input<Integer> getCapacity() {
        return this.capacity == null ? Input.empty() : this.capacity;
    }

    /**
     * Name of this SKU.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<Either<String,ClusterSkuName>> name;

    public Input<Either<String,ClusterSkuName>> getName() {
        return this.name;
    }

    public ClusterSkuArgs(
        @Nullable Input<Integer> capacity,
        Input<Either<String,ClusterSkuName>> name) {
        this.capacity = capacity;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ClusterSkuArgs() {
        this.capacity = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> capacity;
        private Input<Either<String,ClusterSkuName>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
        }

        public Builder capacity(@Nullable Input<Integer> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = Input.ofNullable(capacity);
            return this;
        }

        public Builder name(Input<Either<String,ClusterSkuName>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(Either<String,ClusterSkuName> name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public ClusterSkuArgs build() {
            return new ClusterSkuArgs(capacity, name);
        }
    }
}
