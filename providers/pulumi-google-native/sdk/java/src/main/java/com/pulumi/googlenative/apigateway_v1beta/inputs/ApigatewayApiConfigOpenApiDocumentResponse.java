// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apigateway_v1beta.inputs.ApigatewayApiConfigFileResponse;
import java.util.Objects;


/**
 * An OpenAPI Specification Document describing an API.
 * 
 */
public final class ApigatewayApiConfigOpenApiDocumentResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApigatewayApiConfigOpenApiDocumentResponse Empty = new ApigatewayApiConfigOpenApiDocumentResponse();

    /**
     * The OpenAPI Specification document file.
     * 
     */
    @Import(name="document", required=true)
      private final ApigatewayApiConfigFileResponse document;

    public ApigatewayApiConfigFileResponse document() {
        return this.document;
    }

    public ApigatewayApiConfigOpenApiDocumentResponse(ApigatewayApiConfigFileResponse document) {
        this.document = Objects.requireNonNull(document, "expected parameter 'document' to be non-null");
    }

    private ApigatewayApiConfigOpenApiDocumentResponse() {
        this.document = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayApiConfigOpenApiDocumentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApigatewayApiConfigFileResponse document;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayApiConfigOpenApiDocumentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.document = defaults.document;
        }

        public Builder document(ApigatewayApiConfigFileResponse document) {
            this.document = Objects.requireNonNull(document);
            return this;
        }        public ApigatewayApiConfigOpenApiDocumentResponse build() {
            return new ApigatewayApiConfigOpenApiDocumentResponse(document);
        }
    }
}
