// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apigateway_v1.inputs.ApigatewayApiConfigFileArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An OpenAPI Specification Document describing an API.
 * 
 */
public final class ApigatewayApiConfigOpenApiDocumentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApigatewayApiConfigOpenApiDocumentArgs Empty = new ApigatewayApiConfigOpenApiDocumentArgs();

    /**
     * The OpenAPI Specification document file.
     * 
     */
    @Import(name="document")
    private @Nullable Output<ApigatewayApiConfigFileArgs> document;

    public Optional<Output<ApigatewayApiConfigFileArgs>> document() {
        return Optional.ofNullable(this.document);
    }

    private ApigatewayApiConfigOpenApiDocumentArgs() {}

    private ApigatewayApiConfigOpenApiDocumentArgs(ApigatewayApiConfigOpenApiDocumentArgs $) {
        this.document = $.document;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApigatewayApiConfigOpenApiDocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApigatewayApiConfigOpenApiDocumentArgs $;

        public Builder() {
            $ = new ApigatewayApiConfigOpenApiDocumentArgs();
        }

        public Builder(ApigatewayApiConfigOpenApiDocumentArgs defaults) {
            $ = new ApigatewayApiConfigOpenApiDocumentArgs(Objects.requireNonNull(defaults));
        }

        public Builder document(@Nullable Output<ApigatewayApiConfigFileArgs> document) {
            $.document = document;
            return this;
        }

        public Builder document(ApigatewayApiConfigFileArgs document) {
            return document(Output.of(document));
        }

        public ApigatewayApiConfigOpenApiDocumentArgs build() {
            return $;
        }
    }

}
