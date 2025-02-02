// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBasePathMappingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBasePathMappingPlainArgs Empty = new GetBasePathMappingPlainArgs();

    /**
     * The base path name that callers of the API must provide in the URL after the domain name.
     * 
     */
    @Import(name="basePath", required=true)
    private String basePath;

    /**
     * @return The base path name that callers of the API must provide in the URL after the domain name.
     * 
     */
    public String basePath() {
        return this.basePath;
    }

    /**
     * The DomainName of an AWS::ApiGateway::DomainName resource.
     * 
     */
    @Import(name="domainName", required=true)
    private String domainName;

    /**
     * @return The DomainName of an AWS::ApiGateway::DomainName resource.
     * 
     */
    public String domainName() {
        return this.domainName;
    }

    private GetBasePathMappingPlainArgs() {}

    private GetBasePathMappingPlainArgs(GetBasePathMappingPlainArgs $) {
        this.basePath = $.basePath;
        this.domainName = $.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBasePathMappingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBasePathMappingPlainArgs $;

        public Builder() {
            $ = new GetBasePathMappingPlainArgs();
        }

        public Builder(GetBasePathMappingPlainArgs defaults) {
            $ = new GetBasePathMappingPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param basePath The base path name that callers of the API must provide in the URL after the domain name.
         * 
         * @return builder
         * 
         */
        public Builder basePath(String basePath) {
            $.basePath = basePath;
            return this;
        }

        /**
         * @param domainName The DomainName of an AWS::ApiGateway::DomainName resource.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            $.domainName = domainName;
            return this;
        }

        public GetBasePathMappingPlainArgs build() {
            $.basePath = Objects.requireNonNull($.basePath, "expected parameter 'basePath' to be non-null");
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            return $;
        }
    }

}
