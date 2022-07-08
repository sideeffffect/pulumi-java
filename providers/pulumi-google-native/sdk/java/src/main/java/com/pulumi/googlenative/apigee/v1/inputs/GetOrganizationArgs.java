// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationArgs Empty = new GetOrganizationArgs();

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    private GetOrganizationArgs() {}

    private GetOrganizationArgs(GetOrganizationArgs $) {
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationArgs $;

        public Builder() {
            $ = new GetOrganizationArgs();
        }

        public Builder(GetOrganizationArgs defaults) {
            $ = new GetOrganizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public GetOrganizationArgs build() {
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
