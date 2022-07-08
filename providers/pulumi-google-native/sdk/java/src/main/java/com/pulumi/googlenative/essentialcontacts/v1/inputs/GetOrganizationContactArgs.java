// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.essentialcontacts.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationContactArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationContactArgs Empty = new GetOrganizationContactArgs();

    @Import(name="contactId", required=true)
    private Output<String> contactId;

    public Output<String> contactId() {
        return this.contactId;
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    private GetOrganizationContactArgs() {}

    private GetOrganizationContactArgs(GetOrganizationContactArgs $) {
        this.contactId = $.contactId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationContactArgs $;

        public Builder() {
            $ = new GetOrganizationContactArgs();
        }

        public Builder(GetOrganizationContactArgs defaults) {
            $ = new GetOrganizationContactArgs(Objects.requireNonNull(defaults));
        }

        public Builder contactId(Output<String> contactId) {
            $.contactId = contactId;
            return this;
        }

        public Builder contactId(String contactId) {
            return contactId(Output.of(contactId));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public GetOrganizationContactArgs build() {
            $.contactId = Objects.requireNonNull($.contactId, "expected parameter 'contactId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
