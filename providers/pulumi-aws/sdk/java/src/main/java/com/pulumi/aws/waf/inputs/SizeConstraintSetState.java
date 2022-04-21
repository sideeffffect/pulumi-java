// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.inputs;

import com.pulumi.aws.waf.inputs.SizeConstraintSetSizeConstraintGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SizeConstraintSetState extends com.pulumi.resources.ResourceArgs {

    public static final SizeConstraintSetState Empty = new SizeConstraintSetState();

    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The name or description of the Size Constraint Set.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the parts of web requests that you want to inspect the size of.
     * 
     */
    @Import(name="sizeConstraints")
    private @Nullable Output<List<SizeConstraintSetSizeConstraintGetArgs>> sizeConstraints;

    public Optional<Output<List<SizeConstraintSetSizeConstraintGetArgs>>> sizeConstraints() {
        return Optional.ofNullable(this.sizeConstraints);
    }

    private SizeConstraintSetState() {}

    private SizeConstraintSetState(SizeConstraintSetState $) {
        this.arn = $.arn;
        this.name = $.name;
        this.sizeConstraints = $.sizeConstraints;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SizeConstraintSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SizeConstraintSetState $;

        public Builder() {
            $ = new SizeConstraintSetState();
        }

        public Builder(SizeConstraintSetState defaults) {
            $ = new SizeConstraintSetState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder sizeConstraints(@Nullable Output<List<SizeConstraintSetSizeConstraintGetArgs>> sizeConstraints) {
            $.sizeConstraints = sizeConstraints;
            return this;
        }

        public Builder sizeConstraints(List<SizeConstraintSetSizeConstraintGetArgs> sizeConstraints) {
            return sizeConstraints(Output.of(sizeConstraints));
        }

        public Builder sizeConstraints(SizeConstraintSetSizeConstraintGetArgs... sizeConstraints) {
            return sizeConstraints(List.of(sizeConstraints));
        }

        public SizeConstraintSetState build() {
            return $;
        }
    }

}
