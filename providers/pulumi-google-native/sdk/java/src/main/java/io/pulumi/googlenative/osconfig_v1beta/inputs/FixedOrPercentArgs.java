// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Message encapsulating a value that can be either absolute ("fixed") or relative ("percent") to a value.
 * 
 */
public final class FixedOrPercentArgs extends io.pulumi.resources.ResourceArgs {

    public static final FixedOrPercentArgs Empty = new FixedOrPercentArgs();

    /**
     * Specifies a fixed value.
     * 
     */
    @InputImport(name="fixed")
      private final @Nullable Input<Integer> fixed;

    public Input<Integer> getFixed() {
        return this.fixed == null ? Input.empty() : this.fixed;
    }

    /**
     * Specifies the relative value defined as a percentage, which will be multiplied by a reference value.
     * 
     */
    @InputImport(name="percent")
      private final @Nullable Input<Integer> percent;

    public Input<Integer> getPercent() {
        return this.percent == null ? Input.empty() : this.percent;
    }

    public FixedOrPercentArgs(
        @Nullable Input<Integer> fixed,
        @Nullable Input<Integer> percent) {
        this.fixed = fixed;
        this.percent = percent;
    }

    private FixedOrPercentArgs() {
        this.fixed = Input.empty();
        this.percent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FixedOrPercentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> fixed;
        private @Nullable Input<Integer> percent;

        public Builder() {
    	      // Empty
        }

        public Builder(FixedOrPercentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixed = defaults.fixed;
    	      this.percent = defaults.percent;
        }

        public Builder fixed(@Nullable Input<Integer> fixed) {
            this.fixed = fixed;
            return this;
        }

        public Builder fixed(@Nullable Integer fixed) {
            this.fixed = Input.ofNullable(fixed);
            return this;
        }

        public Builder percent(@Nullable Input<Integer> percent) {
            this.percent = percent;
            return this;
        }

        public Builder percent(@Nullable Integer percent) {
            this.percent = Input.ofNullable(percent);
            return this;
        }
        public FixedOrPercentArgs build() {
            return new FixedOrPercentArgs(fixed, percent);
        }
    }
}
