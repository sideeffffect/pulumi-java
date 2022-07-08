// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.accesscontextmanager.v1beta.enums.BasicLevelCombiningFunction;
import com.pulumi.googlenative.accesscontextmanager.v1beta.inputs.ConditionArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * `BasicLevel` is an `AccessLevel` using a set of recommended features.
 * 
 */
public final class BasicLevelArgs extends com.pulumi.resources.ResourceArgs {

    public static final BasicLevelArgs Empty = new BasicLevelArgs();

    /**
     * How the `conditions` list should be combined to determine if a request is granted this `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. Default behavior is AND.
     * 
     */
    @Import(name="combiningFunction")
    private @Nullable Output<BasicLevelCombiningFunction> combiningFunction;

    /**
     * @return How the `conditions` list should be combined to determine if a request is granted this `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. Default behavior is AND.
     * 
     */
    public Optional<Output<BasicLevelCombiningFunction>> combiningFunction() {
        return Optional.ofNullable(this.combiningFunction);
    }

    /**
     * A list of requirements for the `AccessLevel` to be granted.
     * 
     */
    @Import(name="conditions", required=true)
    private Output<List<ConditionArgs>> conditions;

    /**
     * @return A list of requirements for the `AccessLevel` to be granted.
     * 
     */
    public Output<List<ConditionArgs>> conditions() {
        return this.conditions;
    }

    private BasicLevelArgs() {}

    private BasicLevelArgs(BasicLevelArgs $) {
        this.combiningFunction = $.combiningFunction;
        this.conditions = $.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BasicLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicLevelArgs $;

        public Builder() {
            $ = new BasicLevelArgs();
        }

        public Builder(BasicLevelArgs defaults) {
            $ = new BasicLevelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param combiningFunction How the `conditions` list should be combined to determine if a request is granted this `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. Default behavior is AND.
         * 
         * @return builder
         * 
         */
        public Builder combiningFunction(@Nullable Output<BasicLevelCombiningFunction> combiningFunction) {
            $.combiningFunction = combiningFunction;
            return this;
        }

        /**
         * @param combiningFunction How the `conditions` list should be combined to determine if a request is granted this `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. Default behavior is AND.
         * 
         * @return builder
         * 
         */
        public Builder combiningFunction(BasicLevelCombiningFunction combiningFunction) {
            return combiningFunction(Output.of(combiningFunction));
        }

        /**
         * @param conditions A list of requirements for the `AccessLevel` to be granted.
         * 
         * @return builder
         * 
         */
        public Builder conditions(Output<List<ConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions A list of requirements for the `AccessLevel` to be granted.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<ConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions A list of requirements for the `AccessLevel` to be granted.
         * 
         * @return builder
         * 
         */
        public Builder conditions(ConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public BasicLevelArgs build() {
            $.conditions = Objects.requireNonNull($.conditions, "expected parameter 'conditions' to be non-null");
            return $;
        }
    }

}
