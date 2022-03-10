// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePlacementConstraintGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePlacementConstraintGetArgs Empty = new ServicePlacementConstraintGetArgs();

    /**
     * Cluster Query Language expression to apply to the constraint. Does not need to be specified for the `distinctInstance` type. For more information, see [Cluster Query Language in the Amazon EC2 Container Service Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
     * 
     */
    @InputImport(name="expression")
      private final @Nullable Input<String> expression;

    public Input<String> getExpression() {
        return this.expression == null ? Input.empty() : this.expression;
    }

    /**
     * Type of constraint. The only valid values at this time are `memberOf` and `distinctInstance`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ServicePlacementConstraintGetArgs(
        @Nullable Input<String> expression,
        Input<String> type) {
        this.expression = expression;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ServicePlacementConstraintGetArgs() {
        this.expression = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePlacementConstraintGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> expression;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePlacementConstraintGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.type = defaults.type;
        }

        public Builder expression(@Nullable Input<String> expression) {
            this.expression = expression;
            return this;
        }

        public Builder expression(@Nullable String expression) {
            this.expression = Input.ofNullable(expression);
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
        public ServicePlacementConstraintGetArgs build() {
            return new ServicePlacementConstraintGetArgs(expression, type);
        }
    }
}
