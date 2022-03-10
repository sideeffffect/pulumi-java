// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MethodResponse extends io.pulumi.resources.InvokeArgs {

    public static final MethodResponse Empty = new MethodResponse();

    /**
     * The resources used for the response's content type. Specify response models as key-value pairs (string-to-string maps), with a content type as the key and a Model resource name as the value.
     * 
     */
    @InputImport(name="responseModels")
      private final @Nullable Object responseModels;

    public Optional<Object> getResponseModels() {
        return this.responseModels == null ? Optional.empty() : Optional.ofNullable(this.responseModels);
    }

    /**
     * Response parameters that API Gateway sends to the client that called a method. Specify response parameters as key-value pairs (string-to-Boolean maps), with a destination as the key and a Boolean as the value.
     * 
     */
    @InputImport(name="responseParameters")
      private final @Nullable Object responseParameters;

    public Optional<Object> getResponseParameters() {
        return this.responseParameters == null ? Optional.empty() : Optional.ofNullable(this.responseParameters);
    }

    /**
     * The method response's status code, which you map to an IntegrationResponse.
     * 
     */
    @InputImport(name="statusCode", required=true)
      private final String statusCode;

    public String getStatusCode() {
        return this.statusCode;
    }

    public MethodResponse(
        @Nullable Object responseModels,
        @Nullable Object responseParameters,
        String statusCode) {
        this.responseModels = responseModels;
        this.responseParameters = responseParameters;
        this.statusCode = Objects.requireNonNull(statusCode, "expected parameter 'statusCode' to be non-null");
    }

    private MethodResponse() {
        this.responseModels = null;
        this.responseParameters = null;
        this.statusCode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object responseModels;
        private @Nullable Object responseParameters;
        private String statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.responseModels = defaults.responseModels;
    	      this.responseParameters = defaults.responseParameters;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder responseModels(@Nullable Object responseModels) {
            this.responseModels = responseModels;
            return this;
        }

        public Builder responseParameters(@Nullable Object responseParameters) {
            this.responseParameters = responseParameters;
            return this;
        }

        public Builder statusCode(String statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }
        public MethodResponse build() {
            return new MethodResponse(responseModels, responseParameters, statusCode);
        }
    }
}
