// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.outputs;

import com.pulumi.awsnative.ecs.outputs.TaskSetScale;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTaskSetResult {
    /**
     * @return The ID of the task set.
     * 
     */
    private final @Nullable String id;
    /**
     * @return A floating-point percentage of the desired number of tasks to place and keep running in the task set.
     * 
     */
    private final @Nullable TaskSetScale scale;

    @CustomType.Constructor
    private GetTaskSetResult(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("scale") @Nullable TaskSetScale scale) {
        this.id = id;
        this.scale = scale;
    }

    /**
     * @return The ID of the task set.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return A floating-point percentage of the desired number of tasks to place and keep running in the task set.
     * 
     */
    public Optional<TaskSetScale> scale() {
        return Optional.ofNullable(this.scale);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaskSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable TaskSetScale scale;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaskSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.scale = defaults.scale;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder scale(@Nullable TaskSetScale scale) {
            this.scale = scale;
            return this;
        }        public GetTaskSetResult build() {
            return new GetTaskSetResult(id, scale);
        }
    }
}
