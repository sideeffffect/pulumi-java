// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class GetOrganizationPolicyRestorePolicy extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationPolicyRestorePolicy Empty = new GetOrganizationPolicyRestorePolicy();

    @Import(name="default", required=true)
    private Boolean default_;

    public Boolean default_() {
        return this.default_;
    }

    private GetOrganizationPolicyRestorePolicy() {}

    private GetOrganizationPolicyRestorePolicy(GetOrganizationPolicyRestorePolicy $) {
        this.default_ = $.default_;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationPolicyRestorePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationPolicyRestorePolicy $;

        public Builder() {
            $ = new GetOrganizationPolicyRestorePolicy();
        }

        public Builder(GetOrganizationPolicyRestorePolicy defaults) {
            $ = new GetOrganizationPolicyRestorePolicy(Objects.requireNonNull(defaults));
        }

        public Builder default_(Boolean default_) {
            $.default_ = default_;
            return this;
        }

        public GetOrganizationPolicyRestorePolicy build() {
            $.default_ = Objects.requireNonNull($.default_, "expected parameter 'default' to be non-null");
            return $;
        }
    }

}
