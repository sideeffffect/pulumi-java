// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v3.inputs.GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A list of cascading if-else conditions. Cases are mutually exclusive. The first one with a matching condition is selected, all the rest ignored.
 * 
 */
public final class GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs Empty = new GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs();

    /**
     * A list of cascading if-else conditions.
     * 
     */
    @Import(name="cases")
    private @Nullable Output<List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseArgs>> cases;

    /**
     * @return A list of cascading if-else conditions.
     * 
     */
    public Optional<Output<List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseArgs>>> cases() {
        return Optional.ofNullable(this.cases);
    }

    private GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs() {}

    private GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs $) {
        this.cases = $.cases;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cases A list of cascading if-else conditions.
         * 
         * @return builder
         * 
         */
        public Builder cases(@Nullable Output<List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseArgs>> cases) {
            $.cases = cases;
            return this;
        }

        /**
         * @param cases A list of cascading if-else conditions.
         * 
         * @return builder
         * 
         */
        public Builder cases(List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseArgs> cases) {
            return cases(Output.of(cases));
        }

        /**
         * @param cases A list of cascading if-else conditions.
         * 
         * @return builder
         * 
         */
        public Builder cases(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseArgs... cases) {
            return cases(List.of(cases));
        }

        public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs build() {
            return $;
        }
    }

}
