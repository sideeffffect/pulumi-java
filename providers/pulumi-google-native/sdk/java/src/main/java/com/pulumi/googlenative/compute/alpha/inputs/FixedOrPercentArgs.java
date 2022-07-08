// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encapsulates numeric value that can be either absolute or relative.
 * 
 */
public final class FixedOrPercentArgs extends com.pulumi.resources.ResourceArgs {

    public static final FixedOrPercentArgs Empty = new FixedOrPercentArgs();

    /**
     * Specifies a fixed number of VM instances. This must be a positive integer.
     * 
     */
    @Import(name="fixed")
    private @Nullable Output<Integer> fixed;

    /**
     * @return Specifies a fixed number of VM instances. This must be a positive integer.
     * 
     */
    public Optional<Output<Integer>> fixed() {
        return Optional.ofNullable(this.fixed);
    }

    /**
     * Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for 80%.
     * 
     */
    @Import(name="percent")
    private @Nullable Output<Integer> percent;

    /**
     * @return Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for 80%.
     * 
     */
    public Optional<Output<Integer>> percent() {
        return Optional.ofNullable(this.percent);
    }

    private FixedOrPercentArgs() {}

    private FixedOrPercentArgs(FixedOrPercentArgs $) {
        this.fixed = $.fixed;
        this.percent = $.percent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FixedOrPercentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FixedOrPercentArgs $;

        public Builder() {
            $ = new FixedOrPercentArgs();
        }

        public Builder(FixedOrPercentArgs defaults) {
            $ = new FixedOrPercentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fixed Specifies a fixed number of VM instances. This must be a positive integer.
         * 
         * @return builder
         * 
         */
        public Builder fixed(@Nullable Output<Integer> fixed) {
            $.fixed = fixed;
            return this;
        }

        /**
         * @param fixed Specifies a fixed number of VM instances. This must be a positive integer.
         * 
         * @return builder
         * 
         */
        public Builder fixed(Integer fixed) {
            return fixed(Output.of(fixed));
        }

        /**
         * @param percent Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for 80%.
         * 
         * @return builder
         * 
         */
        public Builder percent(@Nullable Output<Integer> percent) {
            $.percent = percent;
            return this;
        }

        /**
         * @param percent Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for 80%.
         * 
         * @return builder
         * 
         */
        public Builder percent(Integer percent) {
            return percent(Output.of(percent));
        }

        public FixedOrPercentArgs build() {
            return $;
        }
    }

}
