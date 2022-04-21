// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration specific to LivePerson (https://www.liveperson.com).
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs Empty = new GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs();

    /**
     * Account number of the LivePerson account to connect. This is the account number you input at the login page.
     * 
     */
    @Import(name="accountNumber", required=true)
    private Output<String> accountNumber;

    public Output<String> accountNumber() {
        return this.accountNumber;
    }

    private GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs() {}

    private GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs $) {
        this.accountNumber = $.accountNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountNumber(Output<String> accountNumber) {
            $.accountNumber = accountNumber;
            return this;
        }

        public Builder accountNumber(String accountNumber) {
            return accountNumber(Output.of(accountNumber));
        }

        public GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs build() {
            $.accountNumber = Objects.requireNonNull($.accountNumber, "expected parameter 'accountNumber' to be non-null");
            return $;
        }
    }

}
