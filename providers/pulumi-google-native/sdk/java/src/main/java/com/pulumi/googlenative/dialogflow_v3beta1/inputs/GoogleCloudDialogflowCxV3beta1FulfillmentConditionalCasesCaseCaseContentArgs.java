// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The list of messages or conditional cases to activate for this case.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentArgs Empty = new GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentArgs();

    /**
     * Additional cases to be evaluated.
     * 
     */
    @Import(name="additionalCases")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs> additionalCases;

    public Optional<Output<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs>> additionalCases() {
        return Optional.ofNullable(this.additionalCases);
    }

    /**
     * Returned message.
     * 
     */
    @Import(name="message")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1ResponseMessageArgs> message;

    public Optional<Output<GoogleCloudDialogflowCxV3beta1ResponseMessageArgs>> message() {
        return Optional.ofNullable(this.message);
    }

    private GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentArgs() {}

    private GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentArgs(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentArgs $) {
        this.additionalCases = $.additionalCases;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalCases(@Nullable Output<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs> additionalCases) {
            $.additionalCases = additionalCases;
            return this;
        }

        public Builder additionalCases(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs additionalCases) {
            return additionalCases(Output.of(additionalCases));
        }

        public Builder message(@Nullable Output<GoogleCloudDialogflowCxV3beta1ResponseMessageArgs> message) {
            $.message = message;
            return this;
        }

        public Builder message(GoogleCloudDialogflowCxV3beta1ResponseMessageArgs message) {
            return message(Output.of(message));
        }

        public GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentArgs build() {
            return $;
        }
    }

}
