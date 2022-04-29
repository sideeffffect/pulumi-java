// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentDocumentArgs;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;


public final class ApiConfigOpenapiDocumentArgs extends ResourceArgs {

    public static final ApiConfigOpenapiDocumentArgs Empty = new ApiConfigOpenapiDocumentArgs();

    /**
     * The OpenAPI Specification document file.
     * Structure is documented below.
     * 
     */
    @Import(name="document", required=true)
    private Output<ApiConfigOpenapiDocumentDocumentArgs> document;

    /**
     * @return The OpenAPI Specification document file.
     * Structure is documented below.
     * 
     */
    public Output<ApiConfigOpenapiDocumentDocumentArgs> document() {
        return this.document;
    }

    private ApiConfigOpenapiDocumentArgs() {}

    private ApiConfigOpenapiDocumentArgs(ApiConfigOpenapiDocumentArgs $) {
        this.document = $.document;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiConfigOpenapiDocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiConfigOpenapiDocumentArgs $;

        public Builder() {
            $ = new ApiConfigOpenapiDocumentArgs();
        }

        public Builder(ApiConfigOpenapiDocumentArgs defaults) {
            $ = new ApiConfigOpenapiDocumentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param document The OpenAPI Specification document file.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder document(Output<ApiConfigOpenapiDocumentDocumentArgs> document) {
            $.document = document;
            return this;
        }

        /**
         * @param document The OpenAPI Specification document file.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder document(ApiConfigOpenapiDocumentDocumentArgs document) {
            return document(Output.of(document));
        }

        public ApiConfigOpenapiDocumentArgs build() {
            $.document = Objects.requireNonNull($.document, "expected parameter 'document' to be non-null");
            return $;
        }
    }

}
