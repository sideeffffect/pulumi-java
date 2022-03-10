// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Represents configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse Empty = new GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse();

    /**
     * Generic Service configuration of this webhook.
     * 
     */
    @InputImport(name="genericWebService", required=true)
      private final GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse genericWebService;

    public GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse getGenericWebService() {
        return this.genericWebService;
    }

    /**
     * The name of [Service Directory](https://cloud.google.com/service-directory) service. Format: `projects//locations//namespaces//services/`. `Location ID` of the service directory must be the same as the location of the agent.
     * 
     */
    @InputImport(name="service", required=true)
      private final String service;

    public String getService() {
        return this.service;
    }

    public GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse(
        GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse genericWebService,
        String service) {
        this.genericWebService = Objects.requireNonNull(genericWebService, "expected parameter 'genericWebService' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse() {
        this.genericWebService = null;
        this.service = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse genericWebService;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.genericWebService = defaults.genericWebService;
    	      this.service = defaults.service;
        }

        public Builder genericWebService(GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceResponse genericWebService) {
            this.genericWebService = Objects.requireNonNull(genericWebService);
            return this;
        }

        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse build() {
            return new GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigResponse(genericWebService, service);
        }
    }
}
