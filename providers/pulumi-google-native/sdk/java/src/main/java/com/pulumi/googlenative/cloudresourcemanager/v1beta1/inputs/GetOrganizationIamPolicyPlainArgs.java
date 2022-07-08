// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager.v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationIamPolicyPlainArgs Empty = new GetOrganizationIamPolicyPlainArgs();

    @Import(name="organizationId", required=true)
    private String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    private GetOrganizationIamPolicyPlainArgs() {}

    private GetOrganizationIamPolicyPlainArgs(GetOrganizationIamPolicyPlainArgs $) {
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetOrganizationIamPolicyPlainArgs();
        }

        public Builder(GetOrganizationIamPolicyPlainArgs defaults) {
            $ = new GetOrganizationIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GetOrganizationIamPolicyPlainArgs build() {
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
