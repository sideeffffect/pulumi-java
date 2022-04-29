// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGroupManagerVersionTargetSizeArgs extends ResourceArgs {

    public static final InstanceGroupManagerVersionTargetSizeArgs Empty = new InstanceGroupManagerVersionTargetSizeArgs();

    /**
     * , The number of instances which are managed for this version. Conflicts with `percent`.
     * 
     */
    @Import(name="fixed")
    private @Nullable Output<Integer> fixed;

    /**
     * @return , The number of instances which are managed for this version. Conflicts with `percent`.
     * 
     */
    public Optional<Output<Integer>> fixed() {
        return Optional.ofNullable(this.fixed);
    }

    /**
     * , The number of instances (calculated as percentage) which are managed for this version. Conflicts with `fixed`.
     * Note that when using `percent`, rounding will be in favor of explicitly set `target_size` values; a managed instance group with 2 instances and 2 `version`s,
     * one of which has a `target_size.percent` of `60` will create 2 instances of that `version`.
     * 
     */
    @Import(name="percent")
    private @Nullable Output<Integer> percent;

    /**
     * @return , The number of instances (calculated as percentage) which are managed for this version. Conflicts with `fixed`.
     * Note that when using `percent`, rounding will be in favor of explicitly set `target_size` values; a managed instance group with 2 instances and 2 `version`s,
     * one of which has a `target_size.percent` of `60` will create 2 instances of that `version`.
     * 
     */
    public Optional<Output<Integer>> percent() {
        return Optional.ofNullable(this.percent);
    }

    private InstanceGroupManagerVersionTargetSizeArgs() {}

    private InstanceGroupManagerVersionTargetSizeArgs(InstanceGroupManagerVersionTargetSizeArgs $) {
        this.fixed = $.fixed;
        this.percent = $.percent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerVersionTargetSizeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerVersionTargetSizeArgs $;

        public Builder() {
            $ = new InstanceGroupManagerVersionTargetSizeArgs();
        }

        public Builder(InstanceGroupManagerVersionTargetSizeArgs defaults) {
            $ = new InstanceGroupManagerVersionTargetSizeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fixed , The number of instances which are managed for this version. Conflicts with `percent`.
         * 
         * @return builder
         * 
         */
        public Builder fixed(@Nullable Output<Integer> fixed) {
            $.fixed = fixed;
            return this;
        }

        /**
         * @param fixed , The number of instances which are managed for this version. Conflicts with `percent`.
         * 
         * @return builder
         * 
         */
        public Builder fixed(Integer fixed) {
            return fixed(Output.of(fixed));
        }

        /**
         * @param percent , The number of instances (calculated as percentage) which are managed for this version. Conflicts with `fixed`.
         * Note that when using `percent`, rounding will be in favor of explicitly set `target_size` values; a managed instance group with 2 instances and 2 `version`s,
         * one of which has a `target_size.percent` of `60` will create 2 instances of that `version`.
         * 
         * @return builder
         * 
         */
        public Builder percent(@Nullable Output<Integer> percent) {
            $.percent = percent;
            return this;
        }

        /**
         * @param percent , The number of instances (calculated as percentage) which are managed for this version. Conflicts with `fixed`.
         * Note that when using `percent`, rounding will be in favor of explicitly set `target_size` values; a managed instance group with 2 instances and 2 `version`s,
         * one of which has a `target_size.percent` of `60` will create 2 instances of that `version`.
         * 
         * @return builder
         * 
         */
        public Builder percent(Integer percent) {
            return percent(Output.of(percent));
        }

        public InstanceGroupManagerVersionTargetSizeArgs build() {
            return $;
        }
    }

}
