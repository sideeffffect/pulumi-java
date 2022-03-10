// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FormParameterResponse;
import java.util.List;
import java.util.Objects;


/**
 * A form is a data model that groups related parameters that can be collected from the user. The process in which the agent prompts the user and collects parameter values from the user is called form filling. A form can be added to a page. When form filling is done, the filled parameters will be written to the session.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1FormResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1FormResponse Empty = new GoogleCloudDialogflowCxV3beta1FormResponse();

    /**
     * Parameters to collect from the user.
     * 
     */
    @InputImport(name="parameters", required=true)
      private final List<GoogleCloudDialogflowCxV3beta1FormParameterResponse> parameters;

    public List<GoogleCloudDialogflowCxV3beta1FormParameterResponse> getParameters() {
        return this.parameters;
    }

    public GoogleCloudDialogflowCxV3beta1FormResponse(List<GoogleCloudDialogflowCxV3beta1FormParameterResponse> parameters) {
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1FormResponse() {
        this.parameters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FormResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3beta1FormParameterResponse> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FormResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
        }

        public Builder parameters(List<GoogleCloudDialogflowCxV3beta1FormParameterResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1FormResponse build() {
            return new GoogleCloudDialogflowCxV3beta1FormResponse(parameters);
        }
    }
}
