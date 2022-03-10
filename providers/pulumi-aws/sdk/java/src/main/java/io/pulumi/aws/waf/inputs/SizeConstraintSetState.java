// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.aws.waf.inputs.SizeConstraintSetSizeConstraintGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SizeConstraintSetState extends io.pulumi.resources.ResourceArgs {

    public static final SizeConstraintSetState Empty = new SizeConstraintSetState();

    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The name or description of the Size Constraint Set.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies the parts of web requests that you want to inspect the size of.
     * 
     */
    @InputImport(name="sizeConstraints")
      private final @Nullable Input<List<SizeConstraintSetSizeConstraintGetArgs>> sizeConstraints;

    public Input<List<SizeConstraintSetSizeConstraintGetArgs>> getSizeConstraints() {
        return this.sizeConstraints == null ? Input.empty() : this.sizeConstraints;
    }

    public SizeConstraintSetState(
        @Nullable Input<String> arn,
        @Nullable Input<String> name,
        @Nullable Input<List<SizeConstraintSetSizeConstraintGetArgs>> sizeConstraints) {
        this.arn = arn;
        this.name = name;
        this.sizeConstraints = sizeConstraints;
    }

    private SizeConstraintSetState() {
        this.arn = Input.empty();
        this.name = Input.empty();
        this.sizeConstraints = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SizeConstraintSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> name;
        private @Nullable Input<List<SizeConstraintSetSizeConstraintGetArgs>> sizeConstraints;

        public Builder() {
    	      // Empty
        }

        public Builder(SizeConstraintSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.sizeConstraints = defaults.sizeConstraints;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder sizeConstraints(@Nullable Input<List<SizeConstraintSetSizeConstraintGetArgs>> sizeConstraints) {
            this.sizeConstraints = sizeConstraints;
            return this;
        }

        public Builder sizeConstraints(@Nullable List<SizeConstraintSetSizeConstraintGetArgs> sizeConstraints) {
            this.sizeConstraints = Input.ofNullable(sizeConstraints);
            return this;
        }
        public SizeConstraintSetState build() {
            return new SizeConstraintSetState(arn, name, sizeConstraints);
        }
    }
}
