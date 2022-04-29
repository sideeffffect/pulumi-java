// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.inputs.BotSlotDefaultValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;


/**
 * A list of values that Amazon Lex should use as the default value for a slot.
 * 
 */
public final class BotSlotDefaultValueSpecificationArgs extends ResourceArgs {

    public static final BotSlotDefaultValueSpecificationArgs Empty = new BotSlotDefaultValueSpecificationArgs();

    /**
     * A list of slot default values
     * 
     */
    @Import(name="defaultValueList", required=true)
    private Output<List<BotSlotDefaultValueArgs>> defaultValueList;

    /**
     * @return A list of slot default values
     * 
     */
    public Output<List<BotSlotDefaultValueArgs>> defaultValueList() {
        return this.defaultValueList;
    }

    private BotSlotDefaultValueSpecificationArgs() {}

    private BotSlotDefaultValueSpecificationArgs(BotSlotDefaultValueSpecificationArgs $) {
        this.defaultValueList = $.defaultValueList;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotSlotDefaultValueSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotSlotDefaultValueSpecificationArgs $;

        public Builder() {
            $ = new BotSlotDefaultValueSpecificationArgs();
        }

        public Builder(BotSlotDefaultValueSpecificationArgs defaults) {
            $ = new BotSlotDefaultValueSpecificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultValueList A list of slot default values
         * 
         * @return builder
         * 
         */
        public Builder defaultValueList(Output<List<BotSlotDefaultValueArgs>> defaultValueList) {
            $.defaultValueList = defaultValueList;
            return this;
        }

        /**
         * @param defaultValueList A list of slot default values
         * 
         * @return builder
         * 
         */
        public Builder defaultValueList(List<BotSlotDefaultValueArgs> defaultValueList) {
            return defaultValueList(Output.of(defaultValueList));
        }

        /**
         * @param defaultValueList A list of slot default values
         * 
         * @return builder
         * 
         */
        public Builder defaultValueList(BotSlotDefaultValueArgs... defaultValueList) {
            return defaultValueList(List.of(defaultValueList));
        }

        public BotSlotDefaultValueSpecificationArgs build() {
            $.defaultValueList = Objects.requireNonNull($.defaultValueList, "expected parameter 'defaultValueList' to be non-null");
            return $;
        }
    }

}
