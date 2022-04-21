// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
 * 
 */
public final class GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs Empty = new GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs();

    /**
     * Generic Service configuration of this webhook.
     * 
     */
    @Import(name="genericWebService")
    private @Nullable Output<GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs> genericWebService;

    public Optional<Output<GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs>> genericWebService() {
        return Optional.ofNullable(this.genericWebService);
    }

    /**
     * The name of [Service Directory](https://cloud.google.com/service-directory) service. Format: `projects//locations//namespaces//services/`. `Location ID` of the service directory must be the same as the location of the agent.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    public Output<String> service() {
        return this.service;
    }

    private GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs() {}

    private GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs(GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs $) {
        this.genericWebService = $.genericWebService;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder genericWebService(@Nullable Output<GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs> genericWebService) {
            $.genericWebService = genericWebService;
            return this;
        }

        public Builder genericWebService(GoogleCloudDialogflowCxV3WebhookGenericWebServiceArgs genericWebService) {
            return genericWebService(Output.of(genericWebService));
        }

        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        public Builder service(String service) {
            return service(Output.of(service));
        }

        public GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigArgs build() {
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}
