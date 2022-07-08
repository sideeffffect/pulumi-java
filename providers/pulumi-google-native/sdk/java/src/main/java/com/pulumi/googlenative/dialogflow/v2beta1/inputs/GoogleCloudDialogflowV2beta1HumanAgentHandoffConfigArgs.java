// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs;
import com.pulumi.googlenative.dialogflow.v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the hand off to a live agent, typically on which external agent service provider to connect to a conversation. Currently, this feature is not general available, please contact Google to get access.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs Empty = new GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs();

    /**
     * Uses LivePerson (https://www.liveperson.com).
     * 
     */
    @Import(name="livePersonConfig")
    private @Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs> livePersonConfig;

    /**
     * @return Uses LivePerson (https://www.liveperson.com).
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs>> livePersonConfig() {
        return Optional.ofNullable(this.livePersonConfig);
    }

    /**
     * Uses Salesforce Live Agent.
     * 
     */
    @Import(name="salesforceLiveAgentConfig")
    private @Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs> salesforceLiveAgentConfig;

    /**
     * @return Uses Salesforce Live Agent.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs>> salesforceLiveAgentConfig() {
        return Optional.ofNullable(this.salesforceLiveAgentConfig);
    }

    private GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs() {}

    private GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs $) {
        this.livePersonConfig = $.livePersonConfig;
        this.salesforceLiveAgentConfig = $.salesforceLiveAgentConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param livePersonConfig Uses LivePerson (https://www.liveperson.com).
         * 
         * @return builder
         * 
         */
        public Builder livePersonConfig(@Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs> livePersonConfig) {
            $.livePersonConfig = livePersonConfig;
            return this;
        }

        /**
         * @param livePersonConfig Uses LivePerson (https://www.liveperson.com).
         * 
         * @return builder
         * 
         */
        public Builder livePersonConfig(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs livePersonConfig) {
            return livePersonConfig(Output.of(livePersonConfig));
        }

        /**
         * @param salesforceLiveAgentConfig Uses Salesforce Live Agent.
         * 
         * @return builder
         * 
         */
        public Builder salesforceLiveAgentConfig(@Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs> salesforceLiveAgentConfig) {
            $.salesforceLiveAgentConfig = salesforceLiveAgentConfig;
            return this;
        }

        /**
         * @param salesforceLiveAgentConfig Uses Salesforce Live Agent.
         * 
         * @return builder
         * 
         */
        public Builder salesforceLiveAgentConfig(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs salesforceLiveAgentConfig) {
            return salesforceLiveAgentConfig(Output.of(salesforceLiveAgentConfig));
        }

        public GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs build() {
            return $;
        }
    }

}
