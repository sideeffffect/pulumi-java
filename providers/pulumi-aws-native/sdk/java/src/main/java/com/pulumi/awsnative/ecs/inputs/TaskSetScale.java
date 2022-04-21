// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.awsnative.ecs.enums.TaskSetScaleUnit;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskSetScale extends com.pulumi.resources.InvokeArgs {

    public static final TaskSetScale Empty = new TaskSetScale();

    /**
     * The unit of measure for the scale value.
     * 
     */
    @Import(name="unit")
    private @Nullable TaskSetScaleUnit unit;

    public Optional<TaskSetScaleUnit> unit() {
        return Optional.ofNullable(this.unit);
    }

    /**
     * The value, specified as a percent total of a service&#39;s desiredCount, to scale the task set. Accepted values are numbers between 0 and 100.
     * 
     */
    @Import(name="value")
    private @Nullable Double value;

    public Optional<Double> value() {
        return Optional.ofNullable(this.value);
    }

    private TaskSetScale() {}

    private TaskSetScale(TaskSetScale $) {
        this.unit = $.unit;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskSetScale defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskSetScale $;

        public Builder() {
            $ = new TaskSetScale();
        }

        public Builder(TaskSetScale defaults) {
            $ = new TaskSetScale(Objects.requireNonNull(defaults));
        }

        public Builder unit(@Nullable TaskSetScaleUnit unit) {
            $.unit = unit;
            return this;
        }

        public Builder value(@Nullable Double value) {
            $.value = value;
            return this;
        }

        public TaskSetScale build() {
            return $;
        }
    }

}
