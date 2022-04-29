// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiConfigIamPolicyArgs extends ResourceArgs {

    public static final ApiConfigIamPolicyArgs Empty = new ApiConfigIamPolicyArgs();

    /**
     * The API to attach the config to.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="api", required=true)
    private Output<String> api;

    /**
     * @return The API to attach the config to.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> api() {
        return this.api;
    }

    @Import(name="apiConfig", required=true)
    private Output<String> apiConfig;

    public Output<String> apiConfig() {
        return this.apiConfig;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> policyData() {
        return this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private ApiConfigIamPolicyArgs() {}

    private ApiConfigIamPolicyArgs(ApiConfigIamPolicyArgs $) {
        this.api = $.api;
        this.apiConfig = $.apiConfig;
        this.policyData = $.policyData;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiConfigIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiConfigIamPolicyArgs $;

        public Builder() {
            $ = new ApiConfigIamPolicyArgs();
        }

        public Builder(ApiConfigIamPolicyArgs defaults) {
            $ = new ApiConfigIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param api The API to attach the config to.
         * Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder api(Output<String> api) {
            $.api = api;
            return this;
        }

        /**
         * @param api The API to attach the config to.
         * Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder api(String api) {
            return api(Output.of(api));
        }

        public Builder apiConfig(Output<String> apiConfig) {
            $.apiConfig = apiConfig;
            return this;
        }

        public Builder apiConfig(String apiConfig) {
            return apiConfig(Output.of(apiConfig));
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public ApiConfigIamPolicyArgs build() {
            $.api = Objects.requireNonNull($.api, "expected parameter 'api' to be non-null");
            $.apiConfig = Objects.requireNonNull($.apiConfig, "expected parameter 'apiConfig' to be non-null");
            $.policyData = Objects.requireNonNull($.policyData, "expected parameter 'policyData' to be non-null");
            return $;
        }
    }

}
