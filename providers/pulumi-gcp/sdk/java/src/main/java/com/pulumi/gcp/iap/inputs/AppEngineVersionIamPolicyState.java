// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppEngineVersionIamPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final AppEngineVersionIamPolicyState Empty = new AppEngineVersionIamPolicyState();

    /**
     * Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData")
    private @Nullable Output<String> policyData;

    public Optional<Output<String>> policyData() {
        return Optional.ofNullable(this.policyData);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Service id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * Version id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="versionId")
    private @Nullable Output<String> versionId;

    public Optional<Output<String>> versionId() {
        return Optional.ofNullable(this.versionId);
    }

    private AppEngineVersionIamPolicyState() {}

    private AppEngineVersionIamPolicyState(AppEngineVersionIamPolicyState $) {
        this.appId = $.appId;
        this.etag = $.etag;
        this.policyData = $.policyData;
        this.project = $.project;
        this.service = $.service;
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppEngineVersionIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppEngineVersionIamPolicyState $;

        public Builder() {
            $ = new AppEngineVersionIamPolicyState();
        }

        public Builder(AppEngineVersionIamPolicyState defaults) {
            $ = new AppEngineVersionIamPolicyState(Objects.requireNonNull(defaults));
        }

        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder policyData(@Nullable Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        public Builder service(String service) {
            return service(Output.of(service));
        }

        public Builder versionId(@Nullable Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        public AppEngineVersionIamPolicyState build() {
            return $;
        }
    }

}
