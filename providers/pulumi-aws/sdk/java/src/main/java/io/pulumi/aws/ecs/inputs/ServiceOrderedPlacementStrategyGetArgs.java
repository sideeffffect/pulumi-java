// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceOrderedPlacementStrategyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceOrderedPlacementStrategyGetArgs Empty = new ServiceOrderedPlacementStrategyGetArgs();

    /**
     * For the `spread` placement strategy, valid values are `instanceId` (or `host`,
     * which has the same effect), or any platform or custom attribute that is applied to a container instance.
     * For the `binpack` type, valid values are `memory` and `cpu`. For the `random` type, this attribute is not
     * needed. For more information, see [Placement Strategy](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PlacementStrategy.html).
     * 
     */
    @InputImport(name="field")
      private final @Nullable Input<String> field;

    public Input<String> getField() {
        return this.field == null ? Input.empty() : this.field;
    }

    /**
     * Type of placement strategy. Must be one of: `binpack`, `random`, or `spread`
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ServiceOrderedPlacementStrategyGetArgs(
        @Nullable Input<String> field,
        Input<String> type) {
        this.field = field;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ServiceOrderedPlacementStrategyGetArgs() {
        this.field = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceOrderedPlacementStrategyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> field;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceOrderedPlacementStrategyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.type = defaults.type;
        }

        public Builder field(@Nullable Input<String> field) {
            this.field = field;
            return this;
        }

        public Builder field(@Nullable String field) {
            this.field = Input.ofNullable(field);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ServiceOrderedPlacementStrategyGetArgs build() {
            return new ServiceOrderedPlacementStrategyGetArgs(field, type);
        }
    }
}
